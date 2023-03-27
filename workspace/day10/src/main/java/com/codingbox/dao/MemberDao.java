package com.codingbox.dao;

import java.util.List;

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
	
	public MemberBean searchById(String userid) {
		return (MemberBean) sqlSession.selectOne("Member.searchById", userid);
		
	}
	
	public List<MemberBean> getList() {
		List<MemberBean> result = 
				sqlSession.selectList("Member.getList");
		return result;
	}
	
	
}
