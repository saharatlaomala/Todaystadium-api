package com.it.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_payments")
public class PaymentsEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer pmid;
	private String amount;
	private String paymentamount;
	private String receiveddate;
	private String transactioncode;
	private String status;
	private String userid;
	private Integer bkid;
	public Integer getPaymentid() {
		return pmid;
	}
	public Integer getPmid() {
		return pmid;
	}
	public void setPmid(Integer pmid) {
		this.pmid = pmid;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPaymentamount() {
		return paymentamount;
	}
	public void setPaymentamount(String paymentamount) {
		this.paymentamount = paymentamount;
	}
	public String getReceiveddate() {
		return receiveddate;
	}
	public void setReceiveddate(String receiveddate) {
		this.receiveddate = receiveddate;
	}
	public String getTransactioncode() {
		return transactioncode;
	}
	public void setTransactioncode(String transactioncode) {
		this.transactioncode = transactioncode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Integer getBkid() {
		return bkid;
	}
	public void setBkid(Integer bkid) {
		this.bkid = bkid;
	}}
	