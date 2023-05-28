package tester;

import java.util.Scanner;

import dao.StudentImpl;

public class ScholershipTester {
	
	
	public static void main(String[] args) {
		StudentImpl std=new StudentImpl();
		
		
		try(Scanner sc= new Scanner(System.in)){
			
			System.out.println("Enter student id");
			
			int id=sc.nextInt();
			
			System.out.println(std.giveScholerShip(id));
		}
	}

}
