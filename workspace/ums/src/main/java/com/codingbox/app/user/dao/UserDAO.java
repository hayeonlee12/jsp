package com.codingbox.app.user.dao;

import java.util.HashMap;

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

	public boolean login(String userid, String userpw) {
		boolean result = false;
		
		HashMap<String, String> data = new HashMap<>();
		data.put("userid", userid);
		data.put("userpw", userpw);
		
		if((Integer)sqlsession.selectOne("User.login", data) == 1) {
			result = true;
		}
		
		
		return result;
	}


}
