import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		// Counting the Digits
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scan.nextInt(), count = 0;
		while(num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println("No. of digits : "+count);
	}

}
