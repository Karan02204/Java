import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Hello Everyone");

        //int age = 20;
        //Data types

        // 1.boolean ->1 bit
        // 2. byte->-128 to 127 -> 1 byte
        // 3. short -> 2 byte
        // 4. int -> 4 byte
        // 5. long -> 8 byte
        // 6. float -> 4 byte
        // 7. double -> 8 byte
        // 8. char -> 2 byte

        int age = 20;
        byte b = 10;
        short c = 22;
        long d = 34;

        boolean e =true;
        float f = 22.5f;
        double g = 22.555;
        char h = 'a';

        int num = 10/3;

        // System.out.println(num);
        // System.out.println(e);
        // System.out.println(age);
        // JRE - Java runtime Environment

        Scanner myobj = new Scanner(System.in);
        
        String name = myobj.nextLine();
        System.out.println(name);

        // float a= myobj.nextFloat();
        // System.out.println("The number is "+a);
    }
}
