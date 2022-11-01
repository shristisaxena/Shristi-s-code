package javafiles;
import java.util.Scanner;

 
class A{




public static void main(String[] args) {
    

    
        
        int a = 10;
        float b = 15;
        char c = 'V';
        boolean d = true;
        String e = "Beta";
        double f = 11.6;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter int value ");
        a = sc.nextInt();

        System.out.println("enter float value ");
        b = sc.nextFloat();

        System.out.println("enter char value ");
        c = sc.next().charAt(0);

        System.out.println("enter boolean value ");
        d = sc.nextBoolean();

        System.out.println("enter string value ");
        e = sc.next();

        System.out.println("enter double value ");
        f = sc.nextDouble();

        System.out.println("int -> " + a);
        System.out.println("float -> " + b);
        System.out.println("char -> " + c);
        System.out.println("boolean -> " + d);
        System.out.println("string -> " + e);
        System.out.println("double -> " + f);



    }
        
}


