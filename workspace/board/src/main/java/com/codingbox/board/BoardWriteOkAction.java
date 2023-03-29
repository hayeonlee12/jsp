package com.codingbox.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.Action;
import com.codingbox.action.ActionForward;
import com.codingbox.board.dao.BoardBean;
import com.codingbox.board.dao.BoardDao;

public class BoardWriteOkAction implements Action {
	// 글 등록
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		BoardBean board = new BoardBean();
		BoardDao bdao = new BoardDao();
		
		board.setBoardtitle(req.getParameter("boardtitle"));
		board.setBoardcontents(req.getParameter("boardcontents"));
		board.setUsername(req.getParameter("username"));
	
		ActionForward forward = new ActionForward();
		
		if (bdao.insertBoard(board)) {
			forward.setPath("/board/BoardWrite.bo");
			forward.setRedirect(true);
		} else {
			forward.setPath("/board/BoardWriteOK.bo");
			forward.setRedirect(true);
		}
		
		bdao.insertBoard(board);
		
		forward.setRedirect(true);
		return forward;
	
	}
	
}
