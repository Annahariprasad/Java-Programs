import java.util.Scanner;

public class Pattern_Pyramid {

	public static void main(String[] args) {
		// Pattern Pyramid
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number how many lines of pyramid you want : ");
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
		
	}

}
