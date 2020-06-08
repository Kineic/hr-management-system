package com.amazingsoftwarecompany.tester;

import com.amazingsoftwarecompany.department.*;
import com.amazingsoftwarecompany.employee.*;

public class Tester {

	static Manager manager1 = new Manager(420, "Mr.", "Gareth", "Craig", "01/01/2020", 3322471, 3000, .4);
		
	static Developer developer1 = new Developer(421, "Mrs," ,"Kiera" , "Meyer", "09/09/2019", 54565, 1, 10.50);
		
	static Department hr = new Department(12, "Hiring Resources", 1);

	public static Manager getManager1() {
		return manager1;
	}

	public static Developer getDeveloper1() {
		return developer1;
	}

	public static Department getHr() {
		return hr;
	}
}