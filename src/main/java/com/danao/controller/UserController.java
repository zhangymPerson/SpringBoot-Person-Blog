package com.danao.controller;

import com.danao.bean.SysUser;
import com.danao.dao.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
@Slf4j
@RequestMapping(value = "/user")
@RestController
public class UserController {

	@Autowired
	SysUserMapper sysUserMapper;

	@RequestMapping(value = "/all")
	public String getUser(){
		SysUser sysUser = new SysUser();
		sysUser.setId(1233);
		sysUser.setUsername("123");
		sysUser.setPassword("123");
		sysUserMapper.insert(sysUser);
		log.info("test -----------------------------------------------------------------");
		return "success";
	}
}
