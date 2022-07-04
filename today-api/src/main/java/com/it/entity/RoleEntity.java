package com.it.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_role")
public class RoleEntity implements Serializable{
  
	private static final long serialVersionUID = 1L;
    
    @Id
    private String roleid;
    private String rolename;
    private String roledes;
    private String rolestatus;
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRoledes() {
		return roledes;
	}
	public void setRoledes(String roledes) {
		this.roledes = roledes;
	}
	public String getRolestatus() {
		return rolestatus;
	}
	public void setRolestatus(String rolestatus) {
		this.rolestatus = rolestatus;
	}
    
    
}
