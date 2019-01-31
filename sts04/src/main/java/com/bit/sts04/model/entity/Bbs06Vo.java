package com.bit.sts04.model.entity;

public class Bbs06Vo {
	private int bbs_num,user_num;
	private String name, sub, content;
	private int cnt;
	
	public Bbs06Vo() {
	}

	public Bbs06Vo(int bbs_num, int user_num, String sub, String content, int cnt) {
		super();
		this.bbs_num = bbs_num;
		this.user_num = user_num;
		this.sub = sub;
		this.content = content;
		this.cnt = cnt;
	}

	public Bbs06Vo(int bbs_num, String name, String sub, String content, int cnt) {
		super();
		this.bbs_num = bbs_num;
		this.name = name;
		this.sub = sub;
		this.content = content;
		this.cnt = cnt;
	}

	public int getBbs_num() {
		return bbs_num;
	}

	public void setBbs_num(int bbs_num) {
		this.bbs_num = bbs_num;
	}

	public int getUser_num() {
		return user_num;
	}

	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Bbs06Vo [bbs_num=" + bbs_num + ", user_num=" + user_num + ", name=" + name + ", sub=" + sub
				+ ", content=" + content + ", cnt=" + cnt + "]";
	}
	
}













