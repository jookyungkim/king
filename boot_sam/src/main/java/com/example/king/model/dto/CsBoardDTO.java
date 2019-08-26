package com.example.king.model.dto;

import java.io.Serializable;
import java.util.Date;

import com.sun.xml.messaging.saaj.packaging.mime.internet.ParseException;

public class CsBoardDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String enroll_dt;     // 등록일자
	private int cs_board_no;   // 글번호
	private String user_id;    // 아이디
	private String user_name;  // 이름
	private String email;	   // 이메일
	private String subject;	   // 제목
	private String content;	   // 내용
	private int pseq;		   // 원글번호
	private int reply;		   // 답변수
	private int hit;		   // 조회수
	private Date enrolldate;    // 생성일자
	
	public CsBoardDTO() {}
	
	public CsBoardDTO(String enroll_dt, int cs_board_no, String user_id, String user_name, String email, String subject, String content,
			int pseq, int reply, int hit, Date enrolldate) {
		super();
		this.enroll_dt = enroll_dt;
		this.cs_board_no = cs_board_no;
		this.user_id = user_id;
		this.user_name = user_name;
		this.email = email;
		this.subject = subject;
		this.content = content;
		this.pseq = pseq;
		this.reply = hit;
		this.enrolldate = enrolldate;
	}
	
	public String getEnroll_dt() {
		return enroll_dt;
	}
	public void setEnroll_dt(String enroll_dt) {
		this.enroll_dt = enroll_dt;
	}
	public int getCs_board_no() {
		return cs_board_no;
	}
	public void setCs_board_no(int cs_board_no) {
		this.cs_board_no = cs_board_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPseq() {
		return pseq;
	}
	public void setPseq(int pseq) {
		this.pseq = pseq;
	}
	public int getReply() {
		return reply;
	}
	public void setReply(int reply) {
		this.reply = reply;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Date getEnrolldate() {
		return enrolldate;
	}
	public void setEnrolldate(Date enrolldate) {
		this.enrolldate = enrolldate;
	}
	@Override
	public String toString() {
		return "CsBoardDTO [enroll_dt=" + enroll_dt + ", cs_board_no=" + cs_board_no + ", user_id=" + user_id
				+ ", user_name=" + user_name + ", email=" + email + ", subject=" + subject + ", content=" + content
				+ ", pseq=" + pseq + ", reply=" + reply + ", hit=" + hit + ", enrolldate=" + enrolldate + "]";
	}

	
}
