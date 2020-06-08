package com.amazingsoftwarecompany.employee;

import java.io.Serializable;

import com.amazingsoftwarecompany.name.*;



public abstract class Employee implements Serializable{
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	int uniqueID;
	Name name; //Should reference the Name Class
	String dateStart; //Might change from int to Date
	int phoneNum;

	public Employee(int uniqueID, String title, String fName, String lName, String dateStart, int phoneNum) {
		super();
		this.uniqueID = uniqueID;
		this.name = new Name(title, fName, lName);
		this.dateStart = dateStart;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Employee [uniqueID=" + uniqueID + ", name=" + name + ", dateStart=" + dateStart
				+ ", phoneNum=" + phoneNum + "]";
	}

	public int getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getDateStart() {
		return dateStart;
	}
	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
}
