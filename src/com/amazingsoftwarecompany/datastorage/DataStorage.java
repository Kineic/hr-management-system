package com.amazingsoftwarecompany.datastorage;

import com.amazingsoftwarecompany.employee.Developer;
import com.amazingsoftwarecompany.employee.Manager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import com.amazingsoftwarecompany.tester.*;

public class DataStorage extends Tester{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Manager> employeeManagerList = new ArrayList<Manager>(); //List that is populated with saved Managers.
		ArrayList<Developer> employeeDeveloperList = new ArrayList<Developer>(); //List that is populated with saved Developers.
		
		employeeManagerList.add(getManager1()); //Adds manager from Tester class into ArrayList.
		employeeDeveloperList.add(getDeveloper1()); //Adds developer from Tester class into ArrayList.
		
		//Saves the current list of employees to a text file for managers.
		for(Manager manager : employeeManagerList) {
			WriteObjectToFileManager(manager);
		}
		//Saves the current list of employees to a text file for developers.
		for(Developer developer : employeeDeveloperList) {
			WriteObjectToFileDeveloper(developer);
		}
		
		ArrayList<Manager> testLoadManager = new ArrayList<Manager>();
		
		testLoadManager.add(ReadObjectFromFileManager()); //Throws an error when deserializing.
	} 
		
	

	private static void WriteObjectToFileManager(Object serObj) {	

		try {
			String outputPath = "D:\\Work\\Java Projects\\HR Management System\\Text File Output\\EmployeeListManager.txt";
			
			FileOutputStream fileOut = new FileOutputStream(outputPath);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(serObj);
			objectOut.flush();
			objectOut.close();
			
			System.out.println("Success");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void WriteObjectToFileDeveloper(Object serObj) {	

		try {
			String outputPath = "D:\\Work\\Java Projects\\HR Management System\\Text File Output\\EmployeeListDeveloper.txt";
			
			FileOutputStream fileOut = new FileOutputStream(outputPath);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(serObj);
			objectOut.flush();
			objectOut.close();
			
			System.out.println("Success");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Manager ReadObjectFromFileManager() {
		String InputPath = "D:\\Work\\Java Projects\\HR Management System\\Text File Output\\EmployeeList.txt";
		
		try {
		FileInputStream file = new FileInputStream(InputPath);
		ObjectInputStream in = new ObjectInputStream(file);
		
		Manager object1 =  (Manager)in.readObject();
		
		in.close();
		file.close();
		
		System.out.println("success");
		return object1;
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		return null;
		
	}
}
