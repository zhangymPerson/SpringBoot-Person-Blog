package com.danao.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

/**
 * @author zhang
 * @version 1.0
 * @classname WebSecurityConfig
 * @descriptionclass class describe
 * 1.访问阿里的druid页面的权限问题
 * 2.权限配置类
 * @createdate 2019/4/9
 * @since 1.0
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//  定义当需要用户登录时候，转到的登录页面。
		http.formLogin()
				.and()
				.authorizeRequests()        // 定义哪些URL需要被保护、哪些不需要被保护
				.anyRequest()               // 任何请求,登录后可以访问
				.authenticated();
	}

}
