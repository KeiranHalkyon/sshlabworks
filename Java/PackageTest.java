import Admission.*;
import Education.*;
import java.util.Scanner;

class PackageTest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student_Details std = null;
		Library lib = null;
		Assignment assgn = null;
		Examination exam = null;
		int ch = 0;
		while(ch!=5){
			System.out.print("\n\n1) Print Student details\n2) Print Library details\n3) Print Assignment details\n4) Print Examination details\n5) Exit\nEnter Choice : ");
			ch = Integer.parseInt(sc.nextLine());
			System.out.println("");
			switch(ch){
				case 1:
					if(std == null){
						System.out.println("\nNo student details present\nTaking input for first time\n");
						std = new Student_Details();
					}
					std.display();
					break;
				case 2:
					if(lib == null){
						System.out.println("\nNo library details present\nTaking input for first time\n");
						lib = new Library();
					}
					lib.display();
					break;
				case 3:
					if(assgn == null){
						System.out.println("\nNo assignment details present\nTaking input for first time\n");
						assgn = new Assignment();
					}
					assgn.display();
					break;
				case 4:
					if(exam == null){
						System.out.println("\nNo examination details present\nTaking input for first time\n");
						exam = new Examination();
					}
					exam.display();
					break;
				case 5:
					System.out.println("\nExiting\n");
					break;
				default:
					System.out.println("\nInvalid Input\n");
			}
		}
	}
}