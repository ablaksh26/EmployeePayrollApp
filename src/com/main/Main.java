package com.main;
import java.util.*;

import com.employee.User;
import com.employee.Employee;
import com.validation.ValidationException;
import com.validation.Validator;


/*
 * 
 * @author: Abhilaksh
 * @version: 1.0
 * 
 * */


public class Main {

	public static void main(String[] args) {
		System.out.println("////////////////////// EMPLOYEE PAYROLL ////////////////////");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter your Name: ");
			String name = sc.nextLine();
			System.out.print("Enter your UserName: ");
			String userName = sc.nextLine();
			System.out.print("Enter your Password: ");
			String password = sc.nextLine();
			System.out.print("Enter your Email: ");
			String email = sc.nextLine();
			Validator.isValidEmail(email);
			System.out.print("Enter your PhoneNumber: ");
			String phoneNumber = sc.nextLine();
			Validator.isValidPhoneNumber(phoneNumber);
			System.out.print("Enter your EmpID: ");
			String empID = sc.nextLine();
			Validator.isValidEmpId(empID);
			
			User user = new User(userName,password,"regular");
			Employee employee = new Employee(name,email,phoneNumber,empID);
			
		}
		catch(ValidationException e) {
			System.out.println(e.getMessage());
		}

	}

}