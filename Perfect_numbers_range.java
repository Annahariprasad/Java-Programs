import java.util.Scanner;

public class Perfect_numbers_range {

	public static void main(String[] args) {
		// Perfect Numbers in a given range
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range : ");
		int ran = scan.nextInt();
		for(int i=1; i<=ran; i++) {
			int sum = 0;
			for(int j=1; j<=i/2; j++) {
				if(i%j == 0) {
					sum = sum + j;
				}
			}
			if(i == sum) {
				System.out.println(sum + " is Perfect");
			}
		}
		
	}

}
