package com.sj.Employeemangment;
import java.util.Scanner;
public class Main {
	EmployeeService service= new EmployeeService();
	static boolean ordering= true;
	public static void menu() {
		System.out.println("Wellcome to the EmployeService"
	 + "/n1.Add Employe"
		+ "/n2.View Employe"
		+ "/n3. update Employe"
		+ "/n4. Delete Employe"
		+ "/n5. view AllEmploye");
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeService();
		do {
			menu();
			System.out.println("Enter the choice");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Add Employee");
				service.Addemp();
				break;
			case 2:
				System.out.println("view Employee");
				service.viewEmp();
				break;
			case 3:
				System.out.println("Update Employee");
				service.UpdateEmp();
				break;
			case 4:
				System.out.println("Delete Employee");
				service.DeleteEmp();
				break;
			
			case 5:
				System.out.println("view all employee");
				service.viewAllEmps();
				break;
			case 6:
				System.out.println("Thank you for using Employeeservice");
				break;
			default:
				System.out.println("pleser enter the valid choice");
				break;
			
			}
			
		}while(ordering);
			
	}

}
