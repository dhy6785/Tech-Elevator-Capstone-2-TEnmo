package com.techelevator.tenmo.models;

import java.math.BigDecimal;

public class Account {

	private Integer userId;
	private BigDecimal balance;


	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}
	
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [userId=" + userId + ", balance=" + balance + "]";
	}


}
