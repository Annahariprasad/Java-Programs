import java.io.*;
import java.util.Scanner;

class Std_details implements Serializable{
    String name,branch;
    int rollno;
    Std_details(String name,int rollno, String branch){
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
    }
}
public class Seri_Deseri {
         public static void main(String[] args){
            serialization();
            deserialization();
        }

        public static void serialization(){
            String name,branch;
            int rollno;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter name : ");
            name = s.next();
            System.out.print("Enter rollno : ");
            rollno = s.nextInt();
            System.out.print("Enter branch : ");
            branch = s.next();
            Std_details sd = new Std_details(name,rollno,branch);
            //Serialization
            try{
                FileOutputStream fout = new FileOutputStream("C:\\Users\\annah\\Desktop\\File1.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);
                out.writeObject(sd);
                out.close();
                fout.close();
                System.out.println("Successfully Serializable\n");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
        public static void deserialization(){
            try{
                FileInputStream fin = new FileInputStream("C:\\Users\\annah\\Desktop\\File1.txt");
                ObjectInputStream in = new ObjectInputStream(fin);
                Std_details sd1 = (Std_details)in.readObject();
                in.close();
                fin.close();
                System.out.println("Successfully Deserializable");
                System.out.println("Name : "+sd1.name);
                System.out.println("Rollno : "+sd1.rollno);
                System.out.println("Branch : "+sd1.branch);
                 
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }


