package pojos;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="Student_details")
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
   
   @Column(name="first_Name", length=30)
	private String firstName;
   
   @Column(name="last_Name", length=30)
	private String lastName;
   
   @Column(name="email_Id", length=30)
	private String email;
   
   @Column( length=30)
	private String password;
   
   @Transient
	private String conformPassword;
   
   @Column(name="date_Of_Birth", length=30)
	private LocalDate dob;
   
   @Enumerated(EnumType.STRING)
	private Course choosenCourse;
   
   @Column(name="course_Fees")
	private double fees;
   
   @Lob
	private byte[] image;
   
   //default Constructor
   public Student() {
	   
   }
    
   //Constructor with fieldSet
	public Student( String firstName, String lastName, String email, String password, String conformPassword,
			LocalDate dob, Course choosenCourse, double fees) {
		super();
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.conformPassword = conformPassword;
		this.dob = dob;
		this.choosenCourse = choosenCourse;
		this.fees = fees;
		
	}

	
		//Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConformPassword() {
		return conformPassword;
	}

	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Course getChoosenCourse() {
		return choosenCourse;
	}

	public void setChoosenCourse(Course choosenCourse) {
		this.choosenCourse = choosenCourse;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	
		//toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", conformPassword=" + conformPassword + ", dob=" + dob
				+ ", choosenCourse=" + choosenCourse + ", fees=" + fees + ", image=" + Arrays.toString(image) + "]";
	}


}
