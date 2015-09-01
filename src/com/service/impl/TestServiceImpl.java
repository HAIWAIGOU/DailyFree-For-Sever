/**
 * Project Name:mybatis_demo
 * File Name:TestServiceImpl.java
 * Package Name:com.service.impl
 * Date:2014年9月3日下午3:31:08
 * Copyright (c) 2014, WUXI-INFINIT-TECHNOLOGY 2010-2014 All Rights Reserved.
 *
*/

package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.TestDao;
import com.service.TestService;
import com.vo.User;

/**
 * Date:     2014年9月3日 下午3:31:08 <br/>
 * @author   马新凡
 */
@Transactional
@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;
	
	@Override
	public String sayHello() {
		return "hello the world";
	}

	@Override
	public void insertUser(User user) {
		testDao.insertUser(user);
	}

	@Override
	public String login(User user) {
		// TODO Auto-generated method stub
		return testDao.login(user);
	}

}

