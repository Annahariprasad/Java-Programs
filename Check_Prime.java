import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		// Check the number is prime or not
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = scan.nextInt();
		for(int i=2; i<=n; i++) {
			if(n%i==0) {
				System.out.println("No,this is not a prime number.");
				break;
			} else {
				System.out.println("Yes,this is a prime number.");
				break;
			}
		}
	}

}
