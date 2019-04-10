package com.danao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


/**
 * @author zhang
 * @version 1.0
 * @classname HelloController
 * @descriptionclass class describe
 * 1.测试
 * @createdate 2019/4/4
 * @since 1.0
 */

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

	private Logger logger = LoggerFactory.getLogger(HelloController.class);


	@Autowired
	StringRedisTemplate redisTemplate;

	@RequestMapping(value = "/test")
	public String test(){
		return "success"	;
	}
	@Value("123")
	private String vv;

	@RequestMapping(value="/hello")
	//注意这儿没有@responseBody
	public String welcome(ModelMap map){
		Date date = new Date();
		//获取配置文件中的信息vv
		System.out.println(vv);
		String a = redisTemplate.opsForValue().get("a");
		System.out.println(a);
		//logger.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//logger.info("a======================================" + a);
		//logger.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//传到template模板中（会把模板中能找到的所有的ftl文件中的名称都替换掉）
		map.addAttribute("vv", date.toString());
		//返回页面hello.ftl
		return "hello";
	}
}
