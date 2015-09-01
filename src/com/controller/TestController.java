/**
 * Project Name:mybatis_demo
 * File Name:TestController.java
 * Package Name:controller
 * Date:2014年9月3日下午2:29:42
 * Copyright (c) 2014, WUXI-INFINIT-TECHNOLOGY 2010-2014 All Rights Reserved.
 *
*/

package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.TestService;
import com.vo.User;

/**
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2014年9月3日 下午2:29:42 <br/>
 * @author   张乾坤
 * @since    JDK 1.7
 */
@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/test/add.do")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("person/personDetail");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		testService.insertUser(user);
		model.addObject("user", user);
		return model;
	}
	
	/**
	 是否系统学过数据库 
	是否会ER图 
	是否知道3个以上范式 
	写项目是否用视图 
	写项目是否用存储过程 	
	 */
}

