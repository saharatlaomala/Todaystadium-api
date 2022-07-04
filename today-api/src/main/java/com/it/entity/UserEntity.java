package com.it.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class UserEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	private String userId;
	private String userusernaem;
	private String userpassword;
	private String usertitle;
	private String userfirstname;
	private String userlastname;
	private String usergender;
	private String userphone;
	private String useremail;
	private String useraddrass;
	private String userstutus;
	private String zipcode;
	private String roleid;
	public String getUserid() {
		return userId;
	}
	public void setUserid(String userid) {
		this.userId = userid;
	}
	public String getUserusernaem() {
		return userusernaem;
	}
	public void setUserusernaem(String userusernaem) {
		this.userusernaem = userusernaem;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUsertitle() {
		return usertitle;
	}
	public void setUsertitle(String usertitle) {
		this.usertitle = usertitle;
	}
	public String getUserfirstname() {
		return userfirstname;
	}
	public void setUserfirstname(String userfirstname) {
		this.userfirstname = userfirstname;
	}
	public String getUserlastname() {
		return userlastname;
	}
	public void setUserlastname(String userlastname) {
		this.userlastname = userlastname;
	}
	public String getUsergender() {
		return usergender;
	}
	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUseraddrass() {
		return useraddrass;
	}
	public void setUseraddrass(String useraddrass) {
		this.useraddrass = useraddrass;
	}
	public String getUserstutus() {
		return userstutus;
	}
	public void setUserstutus(String userstutus) {
		this.userstutus = userstutus;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	
	
     
}
