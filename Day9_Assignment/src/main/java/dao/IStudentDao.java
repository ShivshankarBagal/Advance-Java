package dao;

import java.util.List;

import pojos.Course;
import pojos.Student;

public interface IStudentDao {
	//for Register new student
	String studentRegistration(Student s)throws RuntimeException;
	//for loginStudent
	Student loginStudent (String email,String password)throws RuntimeException;
	//for showing list of students belong from same course (group by)
	List<Student>getStudentFromCourse(Course course1)throws RuntimeException;
	//for giving scholarship to student based on student id
	String giveScholerShip(int id)throws RuntimeException;

}
