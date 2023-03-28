package com.codingbox.app.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.codingbox.mybatis.SqlMapConfig;

public class UserDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlsession;
	
	public UserDAO() {
		sqlsession = factory.openSession(true);
	}
	
	public boolean join(UserDTO user) {
		boolean result = false;
		
		if( sqlsession.insert("User.join", user) == 1) {
			result =  true;
		}
		
		return result;
	}
}
