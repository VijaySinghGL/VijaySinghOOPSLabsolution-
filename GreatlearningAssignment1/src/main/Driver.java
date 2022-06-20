package main;

import java.util.Scanner;

import model.Employee;
import service.CredentialService;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee("Vijay","Singh"); 
		
		CredentialService cs = new CredentialService();
		
		String generatedEmail;
		char[] generatedPassword;
		
		
		System.out.println("Welcome to the Home Page\n-----------------------------\n");
		
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		;
		Scanner sc = new Scanner(System.in);
		int option = sc. nextInt();
		
		
		switch(option)
		
 {
			
		case 1 :	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),			   
			        employee.getLastName().toLowerCase(),"technical");
			
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee,generatedEmail, generatedPassword);
		
			    break;
		
		case 2 :
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),			   
			employee.getLastName().toLowerCase(),"admin");
			
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee,generatedEmail, generatedPassword);
			
		break;
		
		case 3:
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),			   
			employee.getLastName().toLowerCase(),"hr");
			
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			
		break;
		
		case 4 :
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),			   
			employee.getLastName().toLowerCase(),"legal");
			
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee,generatedEmail, generatedPassword);
			
		break;
		
		default :
			System.out.println("Wrong option");
 }
		
		
		sc.close();
		
	}
}

