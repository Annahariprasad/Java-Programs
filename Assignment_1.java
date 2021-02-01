
public class Assignment_1 {

	public static void main(String[] args) {
		// Employee
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println("<---The Employees Details--->\n");
		e1.name = "Annahari";
		e1.age = 20;
		e1.city = "Nandyal";
		e2.name = "Shabareesh";
		e2.age = 20;
		e2.city = "Hyderabad";
		e1.display();
		e2.display();
	}

}

class Employee{
	String name,city = new String();
	int age;
	void display() {
		System.out.println("The Name is "+name);
		System.out.println("The Age is "+age);
		System.out.println("The City is "+city+"\n");
	}
}