package com.blackswan.web.entity;


public class SelQNA {
    private int id;
    private int memberid;
    private String content;
    private String title;
    private String regdate;
    private String reply;
    private String repdate;
    private int answerid;
    private int fundingid;
	public SelQNA() {
		// TODO Auto-generated constructor stub
	}
	
	public SelQNA(int id, int memberid, String content, String title, String regdate, String reply, String repdate,
			int answerid, int fundingid) {
		this.id = id;
		this.memberid = memberid;
		this.content = content;
		this.title = title;
		this.regdate = regdate;
		this.reply = reply;
		this.repdate = repdate;
		this.answerid = answerid;
		this.fundingid = fundingid;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getRepdate() {
		return repdate;
	}
	public void setRepdate(String repdate) {
		this.repdate = repdate;
	}
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public int getFundingid() {
		return fundingid;
	}
	public void setFundingid(int fundingid) {
		this.fundingid = fundingid;
	}


}