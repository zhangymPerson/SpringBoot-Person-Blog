package com.danao.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.danao.command.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author zhang
 * @version 1.0
 * @classname DruidConfig
 * @descriptionclass class describe
 * 1.****************
 * 2.****************
 * @createdate 2019/4/4
 * @since 1.0
 */
@Configuration
public class DruidConfig {

	private Logger logger = LoggerFactory.getLogger(DruidConfig.class);
	@Bean
	public ServletRegistrationBean druidServlet() {

		logger.info(Constant.getFormatString(DruidConfig.class.getName(),"初始化成功"));
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
		// IP白名单
		//servletRegistrationBean.addInitParameter("allow", "192.168.2.25,127.0.0.1");
		// IP黑名单(共同存在时，deny优先于allow)
		//servletRegistrationBean.addInitParameter("deny", "192.168.1.100");
		//控制台管理用户
		servletRegistrationBean.addInitParameter("loginUsername", "admin");
		servletRegistrationBean.addInitParameter("loginPassword", "admin");
		//是否能够重置数据 禁用HTML页面上的“Reset All”功能
		servletRegistrationBean.addInitParameter("resetEnable", "false");
		return servletRegistrationBean;
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		return filterRegistrationBean;
	}

	//@Bean     //声明其为Bean实例
	@Primary  //在同样的DataSource中，首先使用被标注的DataSource
	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean(destroyMethod = "close", initMethod = "init")
	public DataSource datasource(){
		return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
	}
}
