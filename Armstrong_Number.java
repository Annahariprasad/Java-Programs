import java.util.Scanner;
import java.lang.Math;

public class Armstrong_Number {

	public static void main(String[] args) {
		// Armstrong Number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = scan.nextInt();
		int n = num, count = 0;
		while(n != 0) {
			n = n/10;
			count++;
		}
		int temp = num; int sum = 0;
		while(temp != 0) {
		int rem = temp % 10;
		int pv = 1;
		for(int i=0; i<count; i++) {
			pv = pv*rem;
		}
			sum = sum + pv;
			temp = temp / 10;
		}
		if (num == sum) {
			System.out.println("Yes,this is armstrong number.");
		} else {
			System.out.println("No,this is not armstrong number.");
		}
		
	}

}
