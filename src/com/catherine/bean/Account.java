package com.catherine.bean;

public class Account {
	private int id;
	private String name;
	private double money;
	
	//в╙ук╫П╤Н
	private Double transferMoney;
	public Double getTransferMoney() {
		return transferMoney;
	}
	public void setTransferMoney(Double transferMoney) {
		this.transferMoney = transferMoney;
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
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
}
