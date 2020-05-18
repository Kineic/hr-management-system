package com.amazingsoftwarecompany.department;

public class Department {
	
	int depID;
	String depName;
	int numEmployees;
	
	public Department(int depID, String depName, int numEmployees) {
		super();
		this.depID = depID;
		this.depName = depName;
		this.numEmployees = numEmployees;
	}
	
	@Override
	public String toString() {
		return "Department [depID=" + depID + ", depName=" + depName + ", numEmployees=" + numEmployees + "]";
	}

	public int getDepID() {
		return depID;
	}
	public void setDepID(int depID) {
		this.depID = depID;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public int getNumEmployees() {
		return numEmployees;
	}
	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}
}
