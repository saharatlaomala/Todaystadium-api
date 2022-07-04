package com.it.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="tb_stadium")
public class StadiumEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String stdmid;
	private String stdmname;
	private Integer stdmstime;
	private Integer stdmEtime;
	private String stdmdescription;
	public String getStdmid() {
		return stdmid;
	}
	public void setStdmid(String stdmid) {
		this.stdmid = stdmid;
	}
	public String getStdmname() {
		return stdmname;
	}
	public void setStdmname(String stdmname) {
		this.stdmname = stdmname;
	}
	public Integer getStdmstime() {
		return stdmstime;
	}
	public void setStdmstime(Integer stdmstime) {
		this.stdmstime = stdmstime;
	}
	public Integer getStdmEtime() {
		return stdmEtime;
	}
	public void setStdmEtime(Integer stdmEtime) {
		this.stdmEtime = stdmEtime;
	}
	public String getStdmdescription() {
		return stdmdescription;
	}
	public void setStdmdescription(String stdmdescription) {
		this.stdmdescription = stdmdescription;
	}
	
	

}
