/**
 * Project Name:mybatis_demo
 * File Name:TestService.java
 * Package Name:com.service
 * Date:2014年9月3日下午3:27:37
 * Copyright (c) 2014, WUXI-INFINIT-TECHNOLOGY 2010-2014 All Rights Reserved.
 *
*/

package com.service;

import com.vo.User;

/**
 * ClassName:TestService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2014年9月3日 下午3:27:37 <br/>
 * @author   马新凡
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface TestService {
	
	public String sayHello();
	
	public void insertUser(User user);
	
	public String login(User user);
}

