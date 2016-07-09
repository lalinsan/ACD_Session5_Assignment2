/*
 * Student: Eduardo Aguirre
 * Session 5
 * Assignment 2
 * Java Class that extends the Student Class and implements the Results Interface
 *  * Methods for Second Semester
 */

public class SecondSemesterResults extends Student implements Results 
{
	
	private String subject1; //Variable to store Subject 1
	private String subject2; //Variable to store Subject 2
	private float mark1 , mark2;  //Variable to store Mark 1 and 2
	private float grade1, grade2;  //Variable to store Grade 1 and  2
	private float credit1, credit2; //Variable to store Subject 1
	
	
	//Constructor extended from Student Super Class
	public SecondSemesterResults(String studentName, String studentRegistrationNumber, int studentRoll) {
		super(studentName, studentRegistrationNumber, studentRoll);
		
	}
	
	public SecondSemesterResults()  //Default Constructor
	{
		
	}
		
	//Methods implemented from Results
	@Override
	public void setSubject(String subject1, String subject2) //Sets Subject
	{
		this.subject1=subject1;
		this.subject2=subject2;
		credit1=(float)2.0;
		credit2=(float)3.0;
	}
	
	
	@Override
	public void setMarks(float mark1, float mark2) //Sets Marks
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.grade1=calculateGradePoint(mark1); //Returns gradePoint 
		this.grade2=calculateGradePoint(mark2);
		
	}
	
	@Override
	public float calculateGPA() //Calculate GPA
	{
		return (grade1 * credit1 + grade2 * credit2)/(credit1+credit2); //Returns the result of the opration
		
	}
	
	//Getters 
	public String getSubject1() 
	{
		return subject1;
	}

	public String getSubject2() 
	{
		return subject2;
	}

	public float getMark1() 
	{
		return mark1;
	}

	public float getMark2() {
		return mark2;
	}

	public float getGrade1() {
		return grade1;
	}

	public float getGrade2() {
		return grade2;
	}

	public float getCredit1() {
		return credit1;
	}

	public float getCredit2() {
		return credit2;
	}

	@Override
	public String toString() //Prints out the results
	{
		return "==================================="+"\n"+
		       "Student Subject: " +getSubject1()+"\n"+
		       "Student Mark: "    +getMark1()+"\n"+
		       "Student Grade: "   +getGrade1()+"\n"+
		       "Student Credit: "  +getCredit1()+"\n"+
		       "Student Subject: " +getSubject2()+"\n"+
		       "Student Mark: "    +getMark2()+"\n"+
		       "Student Grade: "   +getGrade2()+"\n"+
		       "Student Credit: "  +getCredit2()+"\n"+
		       "Student Credit: "  +calculateGPA()+"\n"+
		       "==================================="+"\n";
	}
	
	
}
