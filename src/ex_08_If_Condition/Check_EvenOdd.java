package ex_08_If_Condition;

import java.util.Scanner;

public class Check_EvenOdd {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the digit to check");
        int Digit = Sc.nextInt();
        if(Digit % 2 == 0)
        {
            System.out.println("It is an Even number");
        }
        else {
            System.out.println("It is an odd number");
        }
        Sc.close();
    }
}
