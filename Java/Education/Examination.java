package Education;
import java.util.Scanner;

public class Examination{
	String subject;
	int marks;
	public Examination(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Examination Subject : ");
		subject = sc.nextLine();
		System.out.print("Enter Examination Marks : ");
		marks = Integer.parseInt(sc.nextLine());
	}
	public void display(){
		System.out.printf("Examination Subject : %s\nExamination Marks : %s\n",subject,marks);
	}
}