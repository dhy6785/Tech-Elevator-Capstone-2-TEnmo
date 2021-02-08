package com.techelevator.tenmo.models;

import java.math.BigDecimal;

public class TransferDetails {
		
	private Integer transferId;
	private Integer accountFrom;
	private Integer accountTo;
	private String transferType;
	private String transferStatus;
	private BigDecimal amount;
	
	public TransferDetails() { }
	
	public TransferDetails(Integer transferId, Integer accountFrom, Integer accountTo, String transferType, String transferStatus, BigDecimal amount) {
		this.transferId = transferId;
		this.accountFrom = accountFrom;
		this.accountTo = accountTo;
		this.transferType = transferType;
		this.transferStatus = transferStatus;
		this.amount = amount;
	}

	public Integer getTransferId() {
		return transferId;
	}

	public void setTransferId(Integer transferId) {
		this.transferId = transferId;
	}

	public Integer getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(Integer accountFrom) {
		this.accountFrom = accountFrom;
	}

	public Integer getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(Integer accountTo) {
		this.accountTo = accountTo;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getTransferStatus() {
		return transferStatus;
	}

	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TransferDetails [transferId=" + transferId + ", accountFrom=" + accountFrom + ", accountTo=" + accountTo + ", transferType=" + transferType
				+ ", transferStatus=" + transferStatus + ", amount=" + amount + "]";
	}

	}
