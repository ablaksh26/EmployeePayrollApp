package com.main;
import java.util.*;


import com.employee.User;
import com.salary.Item;
import com.salary.PayRollService;
import com.salary.PaySlip;
import com.auth.Auth;
import com.data.EmployeeData;
import com.employee.Employee;
import com.validation.ValidationException;
import com.validation.Validator;


/*
 * 
 * @author: Abhilaksh
 * @version: 6.0
 * 
 * */



public class Main {

	public static void main(String[] args) throws ValidationException {
		
			System.out.println("=============Pay Roll App=============");
		
			Scanner sc = new Scanner(System.in);
			


			User user = new User("John","John123","regular");
			Employee emp = new Employee("John","john@gmail.com","9786989898","john5657");

			User user2 = new User("Rock42","Rock422","manager");
			Employee emp2 = new Employee("Rock","rock@gmail.com","7896789877","rock8787");
			
			EmployeeData.userMap.put(user.getUserName(), user);
			EmployeeData.empMap.put(emp.getEmpId(), emp);
			
			EmployeeData.userMap.put(user2.getUserName(), user2);
			EmployeeData.empMap.put(emp2.getEmpId(), emp2);
			
			System.out.println("----------Login-----------");
			System.out.print("Enter your UserName: ");
			String u = sc.nextLine();
			System.out.print("Enter your Password: ");
			String p = sc.nextLine();
			
			boolean logedIn = Auth.auth(u, p);
			
			if(logedIn) System.out.println("Login Succesfull!!");
			
			PaySlip slip = PayRollService.generatePayslip(emp,"January",600000,30000,10000,12500);
			PaySlip slip1 = PayRollService.generatePayslip(emp,"February",700000,35000,11000,12500);
			PaySlip slip2 = PayRollService.generatePayslip(emp,"March",650000,32000,10500,12500);

			for(int i=0;i<PayRollService.pay.size() && i<3;i++) {
				Item item = PayRollService.pay.get(i);
				System.out.print(item.month + " --> " + item.value);
				System.out.println();
			}

			
	}

}
