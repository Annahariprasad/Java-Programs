import java.util.Scanner;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		// Arithmetic Operators
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int  x = sc.nextInt();
		System.out.print("Enter second number : ");
		int y = sc.nextInt();
		int sum = x + y, sub = x - y, mul = x * y, div = x / y;
		System.out.println("Addition of x and y : " + x + " + " + y + " = " + sum);
		System.out.println("Subtraction of x and y : " + x + " - " + y + " = " +sub);
		System.out.println("Multiplication of x and y : " + x + " * " + y + " = " +mul);
		System.out.println("Divison of x and y : " + x + " / " + y + " = " +div);
	}
}
