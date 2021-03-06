package com.entity;

import java.sql.Date;
import java.util.List;

public class Orders {
	private int id;
	
	private int user_id;
	private int number;
	private String note;
	private Date createtime;
	private User user;
	private List<OrderDetail> orderDetails;
	
	
	
	
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", user_id=" + user_id + ", number=" + number + ", note=" + note + ", createtime="
				+ createtime + ", user=" + user + ", orderDetails=" + orderDetails + "]";
	}

	
	
	
	
	
	
}
