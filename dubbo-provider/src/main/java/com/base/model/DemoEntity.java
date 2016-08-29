package com.base.model;

import java.util.Date;

/**
 * 测试序列化对象
 * @author wangxuan
 *
 */
public class DemoEntity {

	public int id;
	
	public String name;
	
	public String pwd;
	
	public Date date;

	public DemoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
