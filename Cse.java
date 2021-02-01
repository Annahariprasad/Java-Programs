import java.util.Scanner;

public class Cse {
	
   Cse() {
		System.out.println("Two One Subjects : \n");
		System.out.println("JAVA-Object Oriented Programming Language");
		System.out.println("Python");
		System.out.println("Database Management System");
		System.out.println("Digital Logic Design");
		System.out.println("Design Thinking");
		System.out.println("Human Values");
		System.out.println("Environmental Science\n");
	}

	void sub() {
		String[] s = {"Java, ","Python, ","DBMS, ","DLD, ","DT, ","Human values, ","Environmental Science."};
		System.out.print("Two-One Subjects : ");
		for(int i=0; i<7; i++) {
			System.out.print(s[i]);
		}
	}
	public static void main(String[] args) {
			Cse subjects = new Cse();
			subjects.sub();
	}
	
}
