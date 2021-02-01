import java.util.Scanner;

public class Sum_even_odd {

	public static void main(String[] args) {
		// Sum the even numbers and odd numbers in a given number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scan.nextInt();
		int es = 0, os = 0;
		while(num != 0) {
			int rem = num % 10; 
			if(rem%2 == 0) {
				es = es + rem;
			} else {
				os = os + rem;
			}
			num = num / 10;
		}
		System.out.println("Sum of even numbers in a given number : " + es);
		System.out.println("Sum of odd numbers in a given number : " + os);
	}

}
