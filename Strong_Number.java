import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		// Strong Numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scan.nextInt();
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
			System.out.println("Yes,this is strong number.");
		} else {
			System.out.println("NO,this is not a strong number.");
		}
		}
	

}
