package com.danao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang
 * @version 1.0
 * @classname HelloController
 * @descriptionclass class describe
 * 1.测试
 * @createdate 2019/4/4
 * @since 1.0
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	@RequestMapping(value = "/test")
	public String test(){
		return "success 萨达阿瑟东sad;喀什地方艰苦；阿斯达克 ";
	}
}
