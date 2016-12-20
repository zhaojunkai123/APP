package com.cn.pojo;

import java.io.Serializable;

public class Staff implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String ename;
	private String job;
	private Double sal;
	private String dname;
	private String loc;
	
	public Staff(){
		
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Staff [ename=" + ename + ", job=" + job + ", sal=" + sal + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	

}
