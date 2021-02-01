
public class Method {

	public static void main(String[] args) {
		// Methods
		Math a = new Math();
		a.sum(5,5);
		a.sub(5,5);
		a.mul(5,5);
		a.div(5,5);
	}
}

class Math{
	
void sum(int a,int b) {
	System.out.println("Addition is : "+(a+b));
	}
void sub(int a,int b) {
	System.out.println("Subtraction is : "+(a-b));
}
void mul(int a,int b) {
	System.out.println("Multiplication is : "+(a*b));
}
void div(int a,int b) {
	System.out.println("Division is : "+(a/b));
}
}