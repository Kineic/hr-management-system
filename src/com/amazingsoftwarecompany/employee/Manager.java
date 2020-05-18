package com.amazingsoftwarecompany.employee;

import java.io.Serializable;

public class Manager extends Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	double monthlySalary;
	double bonus;

	public Manager(int uniqueID, String title, String fName, String lName, String dateStart, int phoneNum,
			double monthlySalary, double bonus) {
		super(uniqueID, title, fName, lName, dateStart, phoneNum);
		this.monthlySalary = monthlySalary;
		this.bonus = bonus;
	}

	

	@Override
	public String toString() {
		return "Position : Manager\nMonthly Salary = " + monthlySalary + "\nBonus = " + bonus + "\nUniqueID = " + uniqueID + "\nName = "
				+ name + "\nDate Start = " + dateStart + "\nPhone Number = " + phoneNum;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
