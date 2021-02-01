import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		// Day 3 - Assignment 1
		Scanner s = new Scanner(System.in);
		int maths, science, social, biology, zoology;
		
		System.out.println("<--Enter Student Details-->");
		System.out.print("\nEnter Name : ");
		String name = s.next();
		System.out.print("Enter MATHS marks out of 100 marks: ");
		maths = s.nextInt();
		System.out.print("Enter SCIENCE marks out of 100 marks : ");
		science  = s.nextInt();
		System.out.print("Enter SOCIAL marks out of 100 marks : ");
		social = s. nextInt();
		System.out.print("Enter BIOLOGY marks out of 100 marks : ");
		biology = s.nextInt();
		System.out.print("Enter ZOOLOGY marks out of 100 marks : ");
		zoology = s.nextInt();
		
		int total = maths + science + social + biology + zoology;
		int per = (total*100)/500;
		
		System.out.println("\n<--Student marks details-->");
		System.out.println("\nName  : "+name);
		System.out.println("Total marks out of 500 : "+total);
		System.out.println("Percentage marks out of 100% : "+per+"%");
		
		if(per>=90) {
			System.out.println("Hey, You got 'A' grade");
		} else if(per>=75) {
			System.out.println("You got 'B' grade");
		} else if(per>=45) {
			System.out.println("You got 'C' grade");
		} else if(per>=25) {
			System.out.println("You got 'D' grade");
		} else {
			System.out.println("You failed plz Study well");
		}
		
	}

}

