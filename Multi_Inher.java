class A{
    String name;
    int rollno;
    String branch;
}

class B extends A{
    B(String n,int r,String b){
        super.name = n;
        super.rollno = r;
        branch = b;
    }
}
class C extends B{
    C(String n,int r,String b){
        super(n,r,b);
    }
    void display2(){
        System.out.println("Name : "+super.name);
        System.out.println("Roll no : "+super.rollno);
        System.out.println("Branch : "+branch);
    }
}

public class Multi_Inher{
    public static void main(String args[]){
        C s = new C("Annahari",503,"CSE");
        s.display2();
    }
}