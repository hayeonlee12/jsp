package com.codingbox.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.codingbox.mybatis.SqlMapConfig;

public class BoardDao {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlsession;

	public BoardDao() {
		sqlsession = factory.openSession(true);
	}
	

	public boolean insertBoard(BoardBean board) {
		boolean result = false;
		
		if( sqlsession.insert("Board.insertBoard", board) == 1) {
			result = true;
		}
		
		return result;
	}
	
	
}
