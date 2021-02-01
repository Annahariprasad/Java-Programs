import java.util.Scanner;

public class Power_Value {

	public static void main(String[] args) {
		//count two digits of numbers and multiply with same number how many digits its have
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = scan.nextInt();
		System.out.println("Enter power value : ");
		int p = scan.nextInt();
		int n = 1;
		for(int i=0; i<p; i++) {
			n = n*num;
		}
		System.out.println("Power value of "+num+" is : "+n);
	}

}
