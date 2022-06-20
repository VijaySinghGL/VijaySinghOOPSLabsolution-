package service;

import java.util.Random;

import model.Employee;


public class CredentialService {
	
	 public char[] generatePassword()
	 {
		 String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		 String numbers ="0123456789";
		 String specialCharacters ="!@#$%^&*_+-/>?<>)";
		 
		 String values = capitalLetters = smallLetters + numbers + specialCharacters;
		 
		 //Random
		 Random random = new Random();
		 
		 char[] password = new char[8];
		 
		 for (int a = 0; a<8; a++) {
			 
			 password[a] = values.charAt(random.nextInt(values.length()))	;		 
			 
		 }
		 return password;
		 
		 
	 }
	 
	 public String generateEmailAddress(String firstName, String lastName,String department) {
		 
		 return firstName+lastName+"@"+department+".abc.com";
	 }
	 
	 public void showCredentials(Employee employee, String email, char[] generatedpassword) {
		 
		 System.out.println("Dear "+employee.getFirstName()+ " your generated Credentials are");
		 System.out.println("Email --->>>"+ email);
		 System.out.println("Password --->>> 1" +" ");
		 System.out.println(generatedpassword);
	 }
}
