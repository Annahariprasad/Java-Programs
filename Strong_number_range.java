import java.util.Scanner;

public class Strong_number_range {

	public static void main(String[] args) {
		// Strong numbers in a given range
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Range : ");
		int ran = scan.nextInt();
		for(int num=1; num<=ran; num++) {
			int temp = num, sum = 0;
			while(temp != 0) {
				int rem = temp % 10;
				int fact = 1;
				for(int i=2; i<=rem; i++) {
				fact = fact*i;
				}
				sum = sum + fact;
				temp = temp / 10;
			}
			if(num == sum) {
				System.out.println(sum + " is strong number.");
			}
		}
		
	}

}
