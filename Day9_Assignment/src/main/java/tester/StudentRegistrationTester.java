package tester;

import java.time.LocalDate;
import java.util.Scanner;

import dao.StudentImpl;
import pojos.Course;
import pojos.Student;

public class StudentRegistrationTester {

	public static void main(String[] args) {
		
		
		StudentImpl stdimpl= new StudentImpl();
		Student s1;
		
		try(Scanner sc=new Scanner(System.in);)
			{
			System.out.println("Enter student details : fname,lname,email,pass,confmpass.,dob,course,fees");
			s1=new Student(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),LocalDate.parse(sc.next()),
					Course.valueOf(sc.next().toUpperCase()),sc.nextDouble());
			
			System.out.println(stdimpl.studentRegistration(s1));
		}
		
		
		
		
		
	}
}
