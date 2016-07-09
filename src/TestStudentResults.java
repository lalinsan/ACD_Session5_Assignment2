/*
 * Student: Eduardo Aguirre
 * Session 5
 * Assignment 2
 * Java Programs that allows to enter a Student, 2 (Subjects), 2 Marks and calculate the grades and GPA
 */

import java.util.Scanner;//Imports the Scanner Class from Java API Library, to allows User's Input
 
public class TestStudentResults {
 
       public static void main(String[] args) { //Main Method to run the Program
              String choice = "Y"; //Variable to store the User's choice
                           
            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in); //Initiates the Scanner Instance
              
              //Executes the code below as long as choice = Y or Yes
              while (choice.equalsIgnoreCase("Y")||choice.equalsIgnoreCase("Y"))
              {
            	  
            	                   
                  FirstSemesterResults student1 = new FirstSemesterResults (); //Create a Instance of Semester 1
                  System.out.print("Enter Student Name: "); //Prompts user to Enter Student Name
                  String studentName=sc.next(); //Stores the values entered by the User
                  System.out.print("Enter Registration Number: "); //Prompts user to Enter Student Registration Number
                  String studentRegistrationNumber=sc.next(); //Stores the values entered by the User
                  System.out.print("Enter Student Roll: "); //Prompts user to Enter Student Roll
                  int studentRoll=sc.nextInt(); //Stores the values entered by the User
                  
                  student1.setStudentName(studentName); //Sets Student Name
                  student1.setStudentRegistrationNumber(studentRegistrationNumber); //Sets Student Registration Number
                  student1.setStudentRoll(studentRoll); //Sets Student Roll
                  
                  //Print out Student Info
                  System.out.println("+++++++++++++++ STUDENT INFO +++++++++++++++++");
                  System.out.println("Student Name : " +student1.getStudentName());           	  
                  System.out.println("Registration Number :" +student1.getStudentRegistrationNumber());  
                  System.out.println("Roll : " +student1.getStudentRoll());
                  System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
            	  
                  //Capture information for Semester 1
                  System.out.println("++++++ First Semester +++++++");
                  
                  //Enter Subject
            	  System.out.print("Enter Subject 1: "); //Prompts user to Enter Subject 1
                  String subject1=sc.next(); //Stores value entered by user
                  System.out.print("Enter Mark 1: "); //Prompts user to Enter Mark 1
                  float mark1=sc.nextFloat(); //Stores value entered by user
                  System.out.print("Enter Subject 2: "); //Prompts user to Enter Subject 2
                  String subject2=sc.next(); //Stores value entered by user
                  System.out.print("Enter Mark 2: "); //Prompts user to enter Mark 2
                  float mark2=sc.nextFloat(); //Stores value entered by user
                  
                  //Executes Methods
                  student1.setSubject(subject1, subject2); //Sets Subjects
                  student1.setMarks(mark1, mark2); //Sets Marks
                  student1.calculateGradePoint(mark1); //Calculates Grade for Mark 1
                  student1.calculateGradePoint(mark2); //Calculates Grade for Mark 2
                  student1.calculateGPA(); //Calculate GPA
                  System.out.print(student1.toString()); //Call toString method to print Grades
                  
                  System.out.print("Do yo want to enter information for Semester 2 : "); //Prompts user to try info for Semester 2
                  String semester2=sc.next();
                  while (semester2.equalsIgnoreCase("Yes")|| semester2.equalsIgnoreCase("Y"))
                		  {
		                	  System.out.println("++++++ Second Semester +++++++");
		                      
		                	  //Enter Subject
		                	  SecondSemesterResults student2 = new SecondSemesterResults(); //Create a Instance of Semester 2
		                	  System.out.print("Enter Subject 1: ");//Prompts user to Enter Subject 1
		                      String subject3=sc.next(); //Stores value entered by user
		                      System.out.print("Enter Mark 1: ");//Prompts user to Enter Mark 1
		                      float mark3=sc.nextFloat();  //Stores value entered by user
		                      System.out.print("Enter Subject 2: ");//Prompts user to Enter Subject 2
		                      String subject4=sc.next(); //Stores value entered by user
		                      System.out.print("Enter Mark 2: "); //Prompts user to enter Mark 2
		                      float mark4=sc.nextFloat(); //Stores value entered by user
		                      
		                      student2.setSubject(subject3, subject4); //Sets Subjects
		                      student2.setMarks(mark3, mark4); //Sets Marks
		                      student2.calculateGradePoint(mark3); //Calculates Grade for Mark 3
		                      student2.calculateGradePoint(mark4); //Calculates Grade for Mark 4
		                      student2.calculateGPA(); //Calculates GPA
		                      System.out.println(student1.toString()); //Call toString method to print Grades
		                      semester2="N"; //Sets semester value to N
                		  }
                                   
                  System.out.print("Do you want to enter another Student ? "); //Ask student to enter another student
                  choice=sc.next(); //Captures user entered by user
                  System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                       
              }
              	  System.out.println("Thank you !"); //Good bye message
              
       }
 
}
