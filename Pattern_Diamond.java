import java.util.Scanner;

public class Pattern_Diamond {

	public static void main(String[] args) {
		// Pattern Diamond
		//first print the pyramid pattern
		//second print the pyramid pattern in reverse and decrease the user number because of perfection.
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number how many lines of diamond you want : ");
		int n = scan.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
