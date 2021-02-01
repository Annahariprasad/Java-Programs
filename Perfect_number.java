import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		// check the number is Perfect number or not
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter Number to check perfect or not : ");
		int num = scan.nextInt(), sum = 0;
		for(int i=1; i<=num/2; i++) {
			if(num%i == 0) {
				sum = sum + i;
			}
		}
		if(num == sum) {
			System.out.println("Yes,this is perfect number.");
		} else {
			System.out.println("No,this is not perfect number.");
		}
	}

}
