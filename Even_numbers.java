import java.util.Scanner;

public class Even_numbers {

	public static void main(String[] args) {
		// Even Numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range : ");
		int n = sc.nextInt();
		System.out.print("Even numbers : ");
		for(int i=1; i<=n; i++) {
			if(i%2 == 0)  
				System.out.print(i+" ");
		}
	}
}
