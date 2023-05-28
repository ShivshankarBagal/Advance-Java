package tester;

import java.util.Scanner;

import dao.StudentImpl;

public class LoginStdUsingEmailPassword {
	
	public static void main(String[] args) {
		StudentImpl std=new StudentImpl();
		
		
		
		try(Scanner sc=new Scanner(System.in)){
			
			System.out.println("Enter student mail and password ");
			
			String mail=sc.next();
			String password=sc.next();
			
			System.out.println(std.loginStudent(mail, password));
			
		}
	}

}
