package Admission;
import java.util.Scanner;
public class Library{
	String book_name, issue_date, return_date;
	public Library(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book name : ");
		book_name = sc.nextLine();
		System.out.print("Enter Issue Date : ");
		issue_date = sc.nextLine();
		System.out.print("Enter Return Date : ");
		return_date = sc.nextLine();
	}
	public void display(){
		System.out.printf("Book Name : %s\nIssue Date : %s\nReturn Date : %s\n",book_name,issue_date,return_date);
	}
}