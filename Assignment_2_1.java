import java.util.Scanner;

public class Assignment_2_1 {

	public static void main(String[] args) {
		// Day 2 - Assignment 2
		Scanner s = new Scanner(System.in);
		System.out.println("<--Enter Employeer Details-->");
		System.out.print("Enter Employer name : ");
		String name = s.next();
		System.out.print("Enter Date of Birth : ");
		int date = s.nextInt();
		System.out.print("Enter Month of Birth : ");
		int month = s.nextInt();
		System.out.print("Enter Year of Birth : ");
		int year = s.nextInt();
		System.out.print("Enter Monthly Salary : ");
		int sal = s.nextInt();
		
		int ansal = sal*12, l = 100000, age = 2020 - year, tax;
		
		System.out.println("\n<--Employeer Details-->");
		System.out.println("\nEmployeer Name : "+name);
		System.out.println("Employeer Age : "+age);
		System.out.println("Annual Salary : "+ansal);
		
		if(ansal > 5*l) {
			tax = ansal*20/100;
			System.out.println("You have to pay tax  : "+tax);
		} else if(ansal > 4*l) {
			tax = ansal*15/100;
			System.out.println("You have to pay tax  : "+tax);
		} else if(ansal > 3*l) {
			tax = ansal*10/100;
			System.out.println("You have to pay tax  : "+tax);
		} else if(ansal > 2*l) {
			tax = ansal*5/100;
			System.out.println("You have to pay tax  : "+tax);
		}
	}

}
