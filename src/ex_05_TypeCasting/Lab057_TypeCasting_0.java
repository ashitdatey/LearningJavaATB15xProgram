package ex_05_TypeCasting;

public class Lab057_TypeCasting_0 {

    public static void main(String[] args) {

        byte b  = 10;
        int a = b;  //  Valid syntax - Implicit - Casting Widening - JVM/ JAVA
        int a1 = (int)b;  //  Valid syntax - Explicit - Widening
        System.out.println(a);
        System.out.println("Value of a1 is:" + a1);




    }

}
