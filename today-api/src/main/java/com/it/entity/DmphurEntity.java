package com.it.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="tb_dmphur")

public class DmphurEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer disid;
	private String disCode;
	private String disnameth;
	private String disnameeng;
	private Integer pvnid;
	public Integer getDisid() {
		return disid;
	}
	public void setDisid(Integer disid) {
		this.disid = disid;
	}
	public String getDisCode() {
		return disCode;
	}
	public void setDisCode(String disCode) {
		this.disCode = disCode;
	}
	public String getDisnameth() {
		return disnameth;
	}
	public void setDisnameth(String disnameth) {
		this.disnameth = disnameth;
	}
	public String getDisnameeng() {
		return disnameeng;
	}
	public void setDisnameeng(String disnameeng) {
		this.disnameeng = disnameeng;
	}
	public Integer getPvnid() {
		return pvnid;
	}
	public void setPvnid(Integer pvnid) {
		this.pvnid = pvnid;
	}
	
	

}
