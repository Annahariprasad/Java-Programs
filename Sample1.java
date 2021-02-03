import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

interface One{
    public void add(int a,int b);
}
interface Two{
    public void add(int a,int b,int c);
}

class NewFile{
    public void createFile(){
        try {
            File f = new File("C:\\Users\\annah\\Desktop\\NewTextFile.txt");
            File f1 = new File("C:\\Users\\annah\\Desktop\\File.txt");
            FileWriter fw1 = new FileWriter(f1);
            String str;
            if(f.createNewFile()){
                System.out.println("File is created successfully\n");
            } else{
                System.out.println("File exists\n");
            }
            FileWriter fw = new FileWriter(f);
            fw.write("Files in Java might be tricky, but it is fun enough! Hello World!");
            System.out.println("Successfully written into the file\n");
            fw.close();
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                str = sc.nextLine();
                fw1.write(str);
                fw1.close();
                System.out.println(str);
            }
            System.out.println("\nSuccessfully read data from the file\n");
            sc.close();
         }catch (Exception e) {
            e.printStackTrace();
         }
    }
}
class MulInher implements One,Two{
    public void add(int a,int b){
        System.out.println("I am Outer Interface\n");
        System.out.println("Addition of two numbers : "+(a+b)+"\n");
    }
    public void add(int a,int b,int c){
        System.out.println("I am Inner Interface\n");
        System.out.println("Addition of three numbers : "+(a+b+c)+"\n");
    }
}

public class Sample1{
    public static void main(String[] args){
        //strInt();
        //MulInher m = new MulInher();
        //m.add(2,5);
        //m.add(6,2,2);
        NewFile n = new NewFile();
        n.createFile();
    }
    public static void strInt(){
        int i = 100;
        String s = Integer.toString(i);
        String k = "100";
        int j = Integer.parseInt(k);
        System.out.println("This is integer : "+i);
        System.out.println("This is string from integer : "+(s+100));
        System.out.println("This is integer from string : "+(j+100)+"\n");
    }
}