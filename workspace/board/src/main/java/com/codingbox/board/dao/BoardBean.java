package com.codingbox.board.dao;

public class BoardBean {
	private int boardnum;
	private String boardtitle;
	private String boardcontents;
	private String username;
	private String boarddate;
	private int boardreadcount;
	
	public BoardBean(int boardnum, String boardtitle, String boardcontents, String username, String boarddate,
			int boardreadcount) {
		super();
		this.boardnum = boardnum;
		this.boardtitle = boardtitle;
		this.boardcontents = boardcontents;
		this.username = username;
		this.boarddate = boarddate;
		this.boardreadcount = boardreadcount;
	}
	public BoardBean() {
		// TODO Auto-generated constructor stub
	}
	public int getBoardnum() {
		return boardnum;
	}
	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}
	public String getBoardtitle() {
		return boardtitle;
	}
	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}
	public String getBoardcontents() {
		return boardcontents;
	}
	public void setBoardcontents(String boardcontents) {
		this.boardcontents = boardcontents;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return boarddate;
	}
	public void setDate(String boarddate) {
		this.boarddate = boarddate;
	}
	public int getBoardreadcount() {
		return boardreadcount;
	}
	public void setBoardreadcount(int boardreadcount) {
		this.boardreadcount = boardreadcount;
	}
	
}
