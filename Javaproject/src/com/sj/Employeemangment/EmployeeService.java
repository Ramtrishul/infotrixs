package com.sj.Employeemangment;
import java.util.*;

public class EmployeeService {
	HashSet<Employee> empset=new HashSet<Employee>();
	Employee emp1= new Employee(101, "Ram", 24, "jrdevloper", "backend", 20000);
	Employee emp2= new Employee(102, "Trishul", 25, "srdevloper", "UI", 30000);
	Employee emp3= new Employee(103, "chathur", 22, "AWS", "cloud", 250000);
	Employee emp4= new Employee(104, "sriram", 27, "HR", "HR", 40000);
	Employee emp5= new Employee(105, "srieesha", 26, "SAP MM", "tool", 650000);
	
	Scanner sc=new Scanner(System.in);
	boolean found =false;
	int id;
	String name;
    int age;
    String designation;
    String department;
    double salary;
    
    public EmployeeService() {
    	empset.add(emp1);
    	empset.add(emp2);
    	empset.add(emp3);
    	empset.add(emp4);
    	empset.add(emp5);
    }
    public void viewAllEmps() {
    	for(Employee emp:empset) {
    	System.out.println(emp);
    	}
    }
    public void viewEmp() {
    	boolean found=false;
    	System.out.println("Enter the id: ");
    	id=sc.nextInt();
    	for(Employee emp:empset) {
    	if(emp.getId()==id) {
    		System.out.println(emp);
    		found=true;
    	}
    		
    		
    	}
    	
    }
    public void UpdateEmp() {
    	System.out.println("Enter id: ");
    	id= sc.nextInt();
    	for(Employee emp:empset) {
    		if(emp.getId()==id) {
    			System.out.println("enter the name: ");
    			name=sc.next();
    			System.out.println("enter the department:");
    			department= sc.next();
    			System.out.println("enter the salary:");
    			salary=sc.nextDouble();
    			emp.setName(name);
    			emp.setDepartment(department);
    			emp.setSalary(salary);
    			System.out.println("update Employee details are: ");
    			System.out.println(emp);
    			found=true;
    			
    			}
    	}
    	if(!found) {
    		System.out.println("enter details not found");
    		}
    	else {
    		System.out.println("update Employee details successfully");
    		
    	}
    }
    public void DeleteEmp() {
    	System.out.println("enter the id:");
    	id=sc.nextInt ();
    	boolean found =false;
    	Employee empdelete=null;
    	for(Employee emp:empset) {
    	if(emp.getId()==id) {
    		empdelete=emp;
    		found=true;
    		
    	}
    		
    	}
    	if(!found) {
    		System.out.println("employee is not found");
    		
    	}
    	else {
    		System.out.println("delete successfully");
    	}
    	
    }
    public void Addemp() {
    	System.out.println("enter id:");
    	id=sc.nextInt();
    	System.out.println("enter name");
    	name=sc.next();
    	System.out.println("enter age:");
    	age=sc.nextInt();
    System.out.println("enter designation: ");
    designation=sc.next();
    System.out.println("enter department: ");
    department= sc.next();
    System.out.println("enter salary:");
    salary=sc.nextDouble();
    
    Employee emp=new Employee(id, name, age, designation, department, salary);
    empset.add(emp);
    	System.out.println(emp);
    	System.out.println("employee add successfully: ");
    }
    	
	

}
