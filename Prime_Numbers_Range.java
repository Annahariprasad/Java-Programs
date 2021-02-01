import java.util.Scanner;

public class Prime_Numbers_Range {

	public static void main(String[] args) {
		// Print the prime numbers in a given range
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter range number : ");
		int rn = scan.nextInt();
		System.out.print("Prime numbers : 1 2 ");
		for(int num=1; num<=rn; num++) {
			for(int i=2; i<=num; i++) {
				if(num%i == 0){
					break;
				} else {
					System.out.print(num+" ");
					break;
				}}}}}
