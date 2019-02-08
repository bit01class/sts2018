package com.bit.sts08.model.entity;

import java.sql.Date;

public class Bbs02Vo {
	private int num;
	private String sub,content;
	private Date nalja;
	
	public Bbs02Vo() {
		// TODO Auto-generated constructor stub
	}

	public Bbs02Vo(int num, String sub, String content, Date nalja) {
		super();
		this.num = num;
		this.sub = sub;
		this.content = content;
		this.nalja = nalja;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getNalja() {
		return nalja;
	}

	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}

	@Override
	public String toString() {
		return "Bbs02Vo [num=" + num + ", sub=" + sub + ", content=" + content + ", nalja=" + nalja + "]";
	}
	
}
