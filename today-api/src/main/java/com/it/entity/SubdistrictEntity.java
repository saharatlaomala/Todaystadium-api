package com.it.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_sub-district")
public class SubdistrictEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer sdtid;
	private String zipcode;
	private String sdtnameth;
	private String sdtnameeng;
	private Integer disid;
	public Integer getSdtid() {
		return sdtid;
	}
	public void setSdtid(Integer sdtid) {
		this.sdtid = sdtid;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getSdtnameth() {
		return sdtnameth;
	}
	public void setSdtnameth(String sdtnameth) {
		this.sdtnameth = sdtnameth;
	}
	public String getSdtnameeng() {
		return sdtnameeng;
	}
	public void setSdtnameeng(String sdtnameeng) {
		this.sdtnameeng = sdtnameeng;
	}
	public Integer getDisid() {
		return disid;
	}
	public void setDisid(Integer disid) {
		this.disid = disid;
	}
	
	

}
