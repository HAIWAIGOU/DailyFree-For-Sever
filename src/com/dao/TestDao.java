/**
 * Project Name:mybatis_demo
 * File Name:TestDao.java
 * Package Name:com.dao
 * Date:2014年9月5日下午3:01:04
 * Copyright (c) 2014, WUXI-INFINIT-TECHNOLOGY 2010-2014 All Rights Reserved.
 *
*/

package com.dao;

import org.apache.ibatis.annotations.Param;

import com.vo.User;

/**
 * Reason:	 TODO ADD REASON. <br/>
 * @author   马新凡
 * @since    JDK 1.6
 */
public interface TestDao {
	public void insertUser( @Param(value = "user") User user);
	
	public String login(@Param(value = "user") User user);
}

