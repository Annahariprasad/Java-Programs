import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		//Check the number is palindrome or not
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scan.nextInt();
		int temp = num, sum = 0;
		while(temp != 0) {
			int rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}
		if(num == sum) {
			System.out.println("Yes,this is palindrome number.");
		} else {
			System.out.println("No,this is not a palindrome number.");
		}
	}

}
