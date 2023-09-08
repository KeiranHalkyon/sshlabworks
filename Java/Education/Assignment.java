package Education;
import java.util.Scanner;

public class Assignment{
	String assignment_subject;
	int marks_on_assignment, assignment_number;
	public Assignment(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Assignment Subject : ");
		assignment_subject = sc.nextLine();
		System.out.print("Enter Assignment Number : ");
		assignment_number = Integer.parseInt(sc.nextLine());
		System.out.print("Enter marks on assignment : ");
		marks_on_assignment = Integer.parseInt(sc.nextLine());
	}
	public void display(){
		System.out.printf("Assignment Subject : %s\nAssignment Number : %s\nMarks on Assignment : %s\n",assignment_subject,assignment_number,marks_on_assignment);
	}
}