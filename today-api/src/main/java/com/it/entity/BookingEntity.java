package com.it.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_booking")
public class BookingEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer bkId;
	private Data bkDate;
	private Integer bkTime;
	private Integer bkEtime;
	private Enum<?>  status;
	private String userId;
	private String stdmId;
	public Integer getBkId() {
		return bkId;
	}
	public void setBkId(Integer bkId) {
		this.bkId = bkId;
	}
	public Data getBkDate() {
		return bkDate;
	}
	public void setBkDate(Data bkDate) {
		this.bkDate = bkDate;
	}
	public Integer getBkTime() {
		return bkTime;
	}
	public void setBkTime(Integer bkTime) {
		this.bkTime = bkTime;
	}
	public Integer getBkEtime() {
		return bkEtime;
	}
	public void setBkEtime(Integer bkEtime) {
		this.bkEtime = bkEtime;
	}
	public Enum<?> getStatus() {
		return status;
	}
	public void setStatus(Enum<?> status) {
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStdmId() {
		return stdmId;
	}
	public void setStdmId(String stdmId) {
		this.stdmId = stdmId;
	}
	

}
