public class NestedTryCatch {
    public static void main(String[] args){
        try{
            System.out.println("<---Outer Try Block--->");
            try{
                System.out.println("<---Inner Try block--->");
                throw new NullPointerException();
            }
            catch(NumberFormatException p){
                System.out.println("<---Inner Catch Block--->");
                System.out.println(p);
            }
        }
        catch(NullPointerException a){
            System.out.println("<---Outer Catch Block--->");
            System.out.println(a);
        }
    }
}
