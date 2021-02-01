import java.util.Scanner;

public class Palindrome_Range {

	public static void main(String[] args) {
		// Print the palindrome numbers in a given range
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range : ");
		int ran = scan.nextInt();
		for(int num=1; num<=ran; num++) {
			int temp = num, sum = 0;
			while(temp != 0) {
				int rem = temp % 10;
				sum = sum * 10 + rem;
				temp = temp / 10;
			}
			if (num == sum) {
				System.out.println(sum + " is Palindrome number.");
			}
		}
	}

}
