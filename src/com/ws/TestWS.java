/**
 * Project Name:mybatis_demo
 * File Name:TestWS.java
 * Package Name:com.ws
 * Date:2014年9月3日下午3:34:10
 * Copyright (c) 2014, WUXI-INFINIT-TECHNOLOGY 2010-2014 All Rights Reserved.
 *
*/

package com.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.service.TestService;
import com.vo.User;

/**
 * Date:     2015年8月29日 下午3:34:10 <br/>
 * @author   马新凡
 */
public class TestWS extends SpringBeanAutowiringSupport{

	@Autowired
	private TestService testService;
	
	public String sayHello(){
		return testService.sayHello();
	}
	
	public boolean login(String name){
		
		User user = new User();
		user.setName(name);
		
		String result = testService.login(user);
		if(result.equals("1")){
			return true;
		}else{return false;}
		 
	}
	
}

