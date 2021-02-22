import java.io.PrintWriter;
import java.util.Scanner; 
import java.io.*;

class Tex
{
public static void main(String args[]) throws IOException
{
Scanner input=new Scanner(new File("C:\\sample.txt")); 
String line=input.nextLine();
String[] tokens=line.split("[.,?!]"); 
for(int i=0;i<tokens.length;i++)
System.out.println("text.part"+i+"	"+tokens[i]);

}	}
