package Admission;
import java.util.Scanner;
public class Student_Details{
	String student_name, department, DOB;
	public Student_Details(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		student_name = sc.nextLine();
		System.out.print("Enter department : ");
		department = sc.nextLine();
		System.out.print("Enter date of birth : ");
		DOB = sc.nextLine();
	}
	public void display(){
		System.out.printf("Student Name : %s\nDepartment : %s\nDate of Birth : %s\n",student_name,department,DOB);
	}
}