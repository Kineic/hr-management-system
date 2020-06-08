package com.amazingsoftwarecompany.datastorage;

import com.amazingsoftwarecompany.employee.Employee;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {

	public static List<Employee> readInEmployeesFromFile(){
		List<Employee> employees = new ArrayList<Employee>();

		try{
			String inputPath = "savedLists\\EmployeeList.txt";
			
			FileInputStream fileIn = new FileInputStream(inputPath);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);

			while(true){
				Employee employee = (Employee)objectIn.readObject();

				if(employee == null){
					break;
				}

				employees.add(employee);
			}

			objectIn.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return employees;
	}

	public static void writeEmployeesToFile(List<Employee> employees){
		try {
			String outputPath = "savedLists\\EmployeeList.txt";
			
			FileOutputStream fileOut = new FileOutputStream(outputPath);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			
			for(Employee employee : employees){
				objectOut.writeObject(employee);
			}

			objectOut.writeObject(null);
			objectOut.flush();
			objectOut.close();
			
			System.out.println("Success Writing Manager File");
		}catch (IOException e) {
			System.out.println("Fail Writing Manager File");
			e.printStackTrace();
		}
	}
}
