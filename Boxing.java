public class Boxing{
    public static void main(String[] args){
        //Autoboxing
        Integer n1 = 100;
        Float n2 = 15.3f;
        Double n3 = 1232.31232;
        System.out.println("Converting from Primitive type to Wrapper object");
        System.out.println("<-----Autoboxing----->");
        System.out.println("Integer value : "+n1);
        System.out.println("Float value : "+n2);
        System.out.println("Double value : "+n3);
        //AutoUnboxing
        int m1 = n1;
        float m2 = n2;
        double m3 = n3;
        System.out.println("Converting from Wrapper object to Primitive type");
        System.out.println("<-----AutoUnboxing----->");
        System.out.println("Integer value : "+n1);
        System.out.println("Float value : "+n2);
        System.out.println("Double value : "+n3);
        
    }
}