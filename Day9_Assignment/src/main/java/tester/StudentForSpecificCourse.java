package tester;

import java.util.Scanner;

import dao.StudentImpl;
import pojos.Course;

public class StudentForSpecificCourse {
	
	public static void main(String[] args) {
		
		StudentImpl std=new StudentImpl();
		
		try(Scanner sc= new Scanner(System.in)){
			
			System.out.println("Enter course");
			Course course=Course.valueOf(sc.next().toUpperCase());
			
			System.out.println(std.getStudentFromCourse(course));
			
		}
	}

}
