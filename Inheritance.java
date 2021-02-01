//Child class aquires the properties of the parent class
//But parent class does not aquire the properties of the child class
class Inheritance {
	public static void main(String[] args) {
		// Inheritance
		P p = new P();
		p.m1();
		C c = new C();
		//Child class aquire the properties of the parent class
		c.m1();
		c.m2();
		//Parent class can reference the child class but does not aquire the properties of child class
		P p1 = new C();
		p1.m1();
		//p1.m2(); is not work
	}
}
//Parent Class
class P{
	public void m1(){
		System.out.println("Parent");
	}
}
//Child Class
class C extends P{
	public void m2(){
		System.out.println("Child");
	}
}
