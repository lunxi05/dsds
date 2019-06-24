package com.blackswan.web.entity;

import java.util.Date;


public class Seller {
	
	private int id;
	private int companyTel;
	private String companyEmail;
	private String companyName;
	private String companyImg;
	private String companyWeb;
	private int companyComi;
	private int companyRegNum;
	private String companyReg;
	private String companyPass;
	private String companyBoss;
	private String companyBossEmail;
	
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}


	public Seller(int id, int companyTel, String companyEmail, String companyName, String companyImg, String companyWeb,
			int companyComi, int companyRegNum, String companyReg, String companyPass, String companyBoss,
			String companyBossEmail) {
		super();
		this.id = id;
		this.companyTel = companyTel;
		this.companyEmail = companyEmail;
		this.companyName = companyName;
		this.companyImg = companyImg;
		this.companyWeb = companyWeb;
		this.companyComi = companyComi;
		this.companyRegNum = companyRegNum;
		this.companyReg = companyReg;
		this.companyPass = companyPass;
		this.companyBoss = companyBoss;
		this.companyBossEmail = companyBossEmail;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCompanyTel() {
		return companyTel;
	}


	public void setCompanyTel(int companyTel) {
		this.companyTel = companyTel;
	}


	public String getCompanyEmail() {
		return companyEmail;
	}


	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCompanyImg() {
		return companyImg;
	}


	public void setCompanyImg(String companyImg) {
		this.companyImg = companyImg;
	}


	public String getCompanyWeb() {
		return companyWeb;
	}


	public void setCompanyWeb(String companyWeb) {
		this.companyWeb = companyWeb;
	}


	public int getCompanyComi() {
		return companyComi;
	}


	public void setCompanyComi(int companyComi) {
		this.companyComi = companyComi;
	}


	public int getCompanyRegNum() {
		return companyRegNum;
	}


	public void setCompanyRegNum(int companyRegNum) {
		this.companyRegNum = companyRegNum;
	}


	public String getCompanyReg() {
		return companyReg;
	}


	public void setCompanyReg(String companyReg) {
		this.companyReg = companyReg;
	}


	public String getCompanyPass() {
		return companyPass;
	}


	public void setCompanyPass(String companyPass) {
		this.companyPass = companyPass;
	}


	public String getCompanyBoss() {
		return companyBoss;
	}


	public void setCompanyBoss(String companyBoss) {
		this.companyBoss = companyBoss;
	}


	public String getCompanyBossEmail() {
		return companyBossEmail;
	}


	public void setCompanyBossEmail(String companyBossEmail) {
		this.companyBossEmail = companyBossEmail;
	}
	
	
	
	
	
	
	
}