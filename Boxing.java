public class Boxing{
    public static void main(String[] args){
        //Autoboxing
        Integer n1 = 100;
        Long n2 = 233432432L;
        Short n3 = 20;
        Float n4 = 15.3f;
        Double n5 = 1232.31232;
        Character n6 = 'A';
        Boolean n7 = true;
        System.out.println("Converting from Primitive type to Wrapper object\n");
        System.out.println("<-----Autoboxing----->\n");
        System.out.println("Integer value : "+n1);
        System.out.println("Long value : "+n2);
        System.out.println("Short value : "+n3);
        System.out.println("Float value : "+n4);
        System.out.println("Double value : "+n5);
        System.out.println("Char value : "+n6);
        System.out.println("Boolean value : "+n7);
        //AutoUnboxing
        int m1 = n1;
        long m2 = n2;
        short m3 = n3;
        float m4 = n4;
        double m5 = n5;
        char m6 = n6;
        boolean m7 = n7; 
        System.out.println("\nConverting from Wrapper object to Primitive type\n");
        System.out.println("<-----AutoUnboxing----->\n");
        System.out.println("int value : "+m1);
        System.out.println("long value : "+m2);
        System.out.println("short value : "+m3);
        System.out.println("float value : "+m4);
        System.out.println("double value : "+m5);
        System.out.println("char value : "+m6);
        System.out.println("boolean value : "+m7);    
    }
}