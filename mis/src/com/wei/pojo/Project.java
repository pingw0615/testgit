package com.wei.pojo;

import java.util.Date;

public class Project {
  private int id;
  private String wType;
  private String wName;
  private String sTime;
  private String eTime;
  private String progess;
  private String pdetail;
  private String leader;
  
public Project() {
	super();
}


public Project(String wType, String wName, String sTime, String eTime,
		String progess, String pdetail, String leader) {
	super();
	this.wType = wType;
	this.wName = wName;
	this.sTime = sTime;
	this.eTime = eTime;
	this.progess = progess;
	this.pdetail = pdetail;
	this.leader = leader;
}


public Project(int id, String wType, String wName, String sTime, String eTime,
		String progess, String pdetail, String leader) {
	super();
	this.id = id;
	this.wType = wType;
	this.wName = wName;
	this.sTime = sTime;
	this.eTime = eTime;
	this.progess = progess;
	this.pdetail = pdetail;
	this.leader = leader;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getwType() {
	return wType;
}

public void setwType(String wType) {
	this.wType = wType;
}

public String getwName() {
	return wName;
}

public void setwName(String wName) {
	this.wName = wName;
}

public String getsTime() {
	return sTime;
}

public void setsTime(String sTime) {
	this.sTime = sTime;
}

public String geteTime() {
	return eTime;
}

public void seteTime(String eTime) {
	this.eTime = eTime;
}

public String getProgess() {
	return progess;
}

public void setProgess(String progess) {
	this.progess = progess;
}

public String getPdetail() {
	return pdetail;
}

public void setPdetail(String pdetail) {
	this.pdetail = pdetail;
}

public String getLeader() {
	return leader;
}

public void setLeader(String leader) {
	this.leader = leader;
}




  
}
