package com.amazingsoftwarecompany.employee;

import java.io.Serializable;

public class Developer extends Employee implements Serializable{

	private static final long serialVersionUID = 2L;
	
	int level;
	double hourlyRate;

	public Developer(int uniqueID, String title, String fName, String lName, String dateStart, int phoneNum, int level,
			double hourlyRate) {
		super(uniqueID, title, fName, lName, dateStart, phoneNum);
		this.level = level;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "Developer [level=" + level + ", hourlyRate=" + hourlyRate + "]";
	}

	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	
}
