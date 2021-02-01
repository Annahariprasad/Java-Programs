
public class Test {
	Test(double d){
		this(10);
		System.out.println("Double arguement");
	}
	Test(int i){
		this();
		System.out.println("Int arguement");
	}
	Test(){
		System.out.println("NO arguement");
	}

	public static void main(String[] args) {
		Test t = new Test(10.5f	);
		//Test t1 = new Test(10);
		//Test t2 = new Test();

	}

}
