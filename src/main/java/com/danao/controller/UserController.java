package com.danao.controller;

import com.danao.bean.SysUser;
import com.danao.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang
 * @version 1.0
 * @classname UserController
 * @descriptionclass class describe
 * 1.****************
 * 2.****************
 * @createdate 2019/4/9
 * @since 1.0
 */
@RequestMapping(value = "/user")
@RestController
public class UserController {

	@Autowired
	SysUserMapper sysUserMapper;

	@RequestMapping(value = "/all")
	public String getUser(){
		SysUser sysUser = new SysUser();
		sysUser.setId(123);
		sysUser.setUsername("123");
		sysUser.setPassword("123");
		sysUserMapper.insert(sysUser);
		return "success";
	}
}
