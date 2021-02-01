public class Practise{
    public static void main(String[] args) {
        dostuff();
    }
    public static void dostuff(){
        domorestuff();
    }
    public static void domorestuff(){
        try{
        System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("+--------------------+");
            System.out.println("ZeroDivisionException");
            System.out.println("+--------------------+");
        }
    }
}