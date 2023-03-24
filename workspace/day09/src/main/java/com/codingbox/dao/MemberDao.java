package com.codingbox.dao;

import java.util.HashMap;

import javax.print.DocFlavor.STRING;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.codingbox.mybatis.SqlMapConfig;
import com.codingbox.vo.MemberBean;

public class MemberDao {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlSession;
	
	public MemberDao() {
		sqlSession = factory.openSession(true);
		// openSession(true) : auto commit 
		
	}
	
	public boolean checkId(String userid) {
		boolean result = false;
		
		int cnt = 0;
		cnt = sqlSession.selectOne("Member.checkId", userid);
		if(cnt >= 1) {
			result = true;
		}
		
		return result;
	}
	
	public boolean join(MemberBean member) {
		boolean result = false;
		
		if(sqlSession.insert("Member.join", member) == 1) {
			result = true;
		}
			
		return result;
	}
	
	public MemberBean login(String userid, String userpw) {
		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid", userid);
		datas.put("userpw", userpw);
		
		MemberBean result = sqlSession.selectOne("Member.login", datas);
		
		return result;
	}
}
