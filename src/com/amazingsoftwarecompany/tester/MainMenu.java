package com.amazingsoftwarecompany.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.amazingsoftwarecompany.datastorage.*;
import com.amazingsoftwarecompany.employee.*;

public class MainMenu {

	public static void main(String[] args) {
		boolean exitApp = false;
		int menuChoice = -1;
		Scanner scanner = new Scanner(System.in);

		while(exitApp == false){
			displayMenu();

			if(scanner.hasNextInt()){
				menuChoice = scanner.nextInt();
			}
				
			switch(menuChoice) {
				case 1:
					List<Employee> employeesList = new ArrayList<Employee>();
					employeesList = employeeList.readInEmployeesFromFile();
					break;
				case 2:
					//List all departments
					break;
				case 3:
					//Add a new employee
					break;
				case 4:
					//Edit employee by id
					break;
				case 5:
					//Delete an employee by id
					break;
				case 6:
					//View all managers
					break;
				case 7:
					//list all developers
					break;
				case 8:
					//View number of staff within department
					break;
				case 9:
					//Payments
					break;
				case 10:
					//Help menu
					break;
				case 11:
					System.out.println("Exiting App...");
					exitApp = true;
					break;
			}
		}
		scanner.close();
	}

	private static void displayMenu() {
		System.out.println("___________________/Main Menu\\__________________");
		System.out.println("|                                              |");
		System.out.println("| 1: List all employees                        |");
		System.out.println("| 2: List all departments                      |");
		System.out.println("| 3: Add a new employee                        |");
		System.out.println("| 4: Edit an employee by ID                    |");
		System.out.println("| 5: Delete an employee by ID                  |");
		System.out.println("| 6: View all managers                         |");
		System.out.println("| 7: List all developers                       |");
		System.out.println("| 8: View number of staff withing department   |");
		System.out.println("| 9: Payment                                   |");
		System.out.println("|10: Show Help                                 |");
		System.out.println("|11: Exit Menu                                 |");
		System.out.println(" ----------------------------------------------");
	}

}
