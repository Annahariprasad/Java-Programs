import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// Normal Number Changing into Reverse Number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = scan.nextInt();
		int sum = 0;
		while(num != 0) {
		int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse Number is : "+sum);
	}

}
