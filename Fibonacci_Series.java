import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// Fibonacci Series
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter limit : ");
		int l = scan.nextInt();
		int a=0,b=1,c;
		for(int i=0; i<l; i++) {
			System.out.print(a + "\t");
			c = a + b;
			a = b;
			b = c;
		}
	}

}
