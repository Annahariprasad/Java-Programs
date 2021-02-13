import java.io.*;
import java.util.Scanner;

class Std_details implements Serializable{
    String name,branch;
    int rollno;
    Scanner s = new Scanner(System.in);
    Std_details(){
        System.out.print("Enter name : ");
        this.name = s.next();
        System.out.print("Enter rollno : ");
        this.rollno = s.nextInt();
        System.out.print("Enter branch : ");
        this.branch = s.next();
    }
}
public class Seri_Deseri {
    public static void main(String[] args){
        Std_details sd = new Std_details();
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\annah\\Desktop\\File.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(sd);
            out.close();
            fout.close();
        }
        catch(IOException e){
            System.out.println("Successfully Serializable");
        }

        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\annah\\Desktop\\File.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Std_details sd1 = (Std_details)in.readObject();
            in.close();
            fin.close();
            System.out.println("Name : "+sd1.name);
            System.out.println("Rollno : "+sd1.rollno);
            System.out.println("Branch : "+sd1.branch);
         }
        catch(Exception e){
            System.out.println("Successfully Deserializable");
        }
    }
}
