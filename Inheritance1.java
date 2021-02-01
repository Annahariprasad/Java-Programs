import java.util.Scanner;

class Inheritance1 {
  public static void main(String[] args) {
   S st = new S();
   st.print();
  }
}

class P{
  public void getInput(){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter Name : ");
  String name = scan.nextLine();
  System.out.println("Enter Marks : ");
  int marks = scan.nextInt();
}
}

class S extends P{
  public void print(){
  System.out.println("Name : " + super.name);
  System.out.println("Marks : " + super.marks);
  super.getInput();
}
}