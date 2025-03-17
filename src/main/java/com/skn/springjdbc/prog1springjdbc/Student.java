package com.skn.springjdbc.prog1springjdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
	@Value("At7896")
 private String sno;
	@Value("anand")
 private String sname;
	@Value("bhr")
 private String scity;
	@Value("AE")
 private String sbranch;
public Student(String sno, String sname, String scity, String sbranch) {
	super();
	this.sno = sno;
	this.sname = sname;
	this.scity = scity;
	this.sbranch = sbranch;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String getSno() {
	return sno;
}
public void setSno(String sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getScity() {
	return scity;
}
public void setScity(String scity) {
	this.scity = scity;
}
public String getSbranch() {
	return sbranch;
}
public void setSbranch(String sbranch) {
	this.sbranch = sbranch;
}
@Override
public String toString() {
	return "Student [sno=" + sno + ", sname=" + sname + ", scity=" + scity + ", sbranch=" + sbranch + "]";
}
 
 
}