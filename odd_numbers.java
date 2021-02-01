import java.util.Scanner;

public class odd_numbers {

	public static void main(String[] args) {
		// Odd Numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range : ");
		int n = sc.nextInt();
		System.out.print("Odd numbers : ");
		for(int i=1; i<=n; i++) {
			if(i%2 != 0)
				System.out.print(i+" ");
		}
	}
}
