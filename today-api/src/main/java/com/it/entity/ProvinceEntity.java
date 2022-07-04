package com.it.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_province")
public class ProvinceEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer pvnid;
	private String pvncode;
	private String pvnnameth;
	private String pvnnameeng;
	private String area;
	public Integer getPvnid() {
		return pvnid;
	}
	public void setPvnid(Integer pvnid) {
		this.pvnid = pvnid;
	}
	public String getPvncode() {
		return pvncode;
	}
	public void setPvncode(String pvncode) {
		this.pvncode = pvncode;
	}
	public String getPvnnameth() {
		return pvnnameth;
	}
	public void setPvnnameth(String pvnnameth) {
		this.pvnnameth = pvnnameth;
	}
	public String getPvnnameeng() {
		return pvnnameeng;
	}
	public void setPvnnameeng(String pvnnameeng) {
		this.pvnnameeng = pvnnameeng;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	

}
