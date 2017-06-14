package boot.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table (name = "Student")
public class Student {  
    private int studentid;  
    private String firstname;  
    private String lastname;  
    private char grade;  
    private int courseid;  
    private int yearjoined; 
    private int zipcode; 

    
    public Student() {}  
    
    public Student(int studentid, String firstname, String lastname,char grade,int courseid,int yearjoined,int zipcode) {  
    super();  
    this.studentid = studentid;  
    this.firstname = firstname;  
    this.lastname = lastname;
    this.grade = grade;  
    this.courseid = courseid;  
    this.yearjoined = yearjoined;  
    this.zipcode = zipcode;  
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "studentid")
    public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	
	public String getFirstname() {
		return firstname;
	}
    
    @Column(name = "firstname")
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

    @Column(name = "lastname")
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public char getGrade() {
		return grade;
	}

    @Column(name = "grade")
	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int getCourseid() {
		return courseid;
	}

    @Column(name = "courseid")
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public int getYearjoined() {
		return yearjoined;
	}

    @Column(name = "yearjoined")
	public void setYearjoined(int yearjoined) {
		this.yearjoined = yearjoined;
	}

	public int getZipcode() {
		return zipcode;
	}
    @Column(name = "zipcode")
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
  }  