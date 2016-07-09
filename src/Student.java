/*
 * Student: Eduardo Aguirre
 * Session 5
 * Assignment 2
 * Java Class Student that stores the Student info and calculates the Grade Point
 */


public class Student 
{
	private String studentName;
	private String studentRegistrationNumber;
	private int studentRoll;
	
	public Student() //Default Constructor
	{
		
	}
	
	public Student (String studentName, String studentRegistrationNumber, int studentRoll) //Constructor
	{
		this.studentName=studentName;
		this.studentRegistrationNumber=studentRegistrationNumber;
		this.studentRoll=studentRoll;
	}
	
	
	//Setter		
	public void setStudentName(String studentName) {  //Set Student Name
		this.studentName = studentName;
	}

	public void setStudentRegistrationNumber(String studentRegistrationNumber) { //Set Student Registration Number
		this.studentRegistrationNumber = studentRegistrationNumber;
	}

	public void setStudentRoll(int studentRoll) { //Set Student Roll
		this.studentRoll = studentRoll;
	}

	public float calculateGradePoint(float mark) //Calculates Grade Point based on the passed Mark
	{
		float gradePoint;
		if (mark>=80 && mark <=100) //Set Grade Point to 4.0 if mark between 100 and 80 
		{
			gradePoint=4.0f;
		}
		else if (mark>=75 && mark <=79) //Set Grade Point to 3.75 if mark between 79 and 75
		{
			gradePoint=3.75f;
		}
		else if (mark>=70 && mark <=74) //Set Grade Point to 3.50 if mark between 74 and 70
		{
			gradePoint=3.50f;
		}
		else if (mark>=65 && mark <=69) //Set Grade Point to 3.25 if mark between 69 and 65
		{
			gradePoint=3.25f;
		}
		else if (mark>=60 && mark <=64) //Set Grade Point to 3.00 if mark between 64 and 60
		{
			gradePoint=3.00f;
		}
		else if (mark>=55 && mark <=59) //Set Grade Point to 2.75 if mark between 59 and 55
		{
			gradePoint=2.75f;
		}
		else if (mark>=50 && mark <=54) //Set Grade Point to 2.50 if mark between 54 and 50
		{
			gradePoint=2.50f;
		}
		else if (mark>=45 && mark <=49) //Set Grade Point to 2.25 if mark between 49 and 45
		{
			gradePoint=2.25f;
		}
		else if (mark>=40 && mark <=44) //Set Grade Point to 2.00 if mark between 44 and 40
		{
			gradePoint=2.00f;
		}
		else
		{
			gradePoint=0.00f; //Set Grade Point to 0.00 if if any of the conditions above are not met
		}
		return gradePoint;
	}
    
	//Getter
	public String getStudentName() //Get Student Name
	{
		return studentName;
	}

	public String getStudentRegistrationNumber()  //Get Student Registration Number
	{
		 return studentRegistrationNumber;
	}

	public int getStudentRoll()  //Get Student Roll
	{
		return  studentRoll;
	}
	
	
}
