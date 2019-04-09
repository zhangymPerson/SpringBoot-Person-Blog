package com.danao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@RequestMapping(value = "/test")
	public String test(){
		return "success 萨达阿瑟东sad;喀什地方艰苦；阿斯达克 "	;
	}
	@Value("123")
	private String vv;

	@RequestMapping(value="/hello")
	//注意这儿没有@responseBody
	public String welcome(ModelMap map){
		Date date = new Date();
		//获取配置文件中的信息vv
		System.out.println(vv);
		//传到template模板中（会把模板中能找到的所有的ftl文件中的名称都替换掉）
		map.addAttribute("vv", date.toString());
		//返回页面hello.ftl
		return "hello";
	}
}
