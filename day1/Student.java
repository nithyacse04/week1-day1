package week1.day1;

public class Student {
	
	
	private String studentName;
	private int rollno;
	private String collegename;
	private double markscored;
	private float cgpa;

public static void main(String[] args) {
	
	 // Create a new student instance
    Student stu = new Student();
    
    // Assign values to the attributes
    stu.studentName = "Nithya";
    stu.rollno = 620061048;
    stu.collegename = "Anna university";
    stu.markscored = 75d;
    stu.cgpa = 7.5f;
    
    // Print the attributes
    System.out.println("Student Name: " + stu.studentName);
    System.out.println("Roll Number: " + stu.rollno);
    System.out.println("College Name: " + stu.collegename);
    System.out.println("Marks Scored: " + stu.markscored);
    System.out.println("CGPA: " + stu.cgpa);

	
}
	
	
}


	