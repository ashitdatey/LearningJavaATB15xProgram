package ex_08_If_Condition;

import java.util.Scanner;

public class NumDivisibleBy_5 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a digit to divide by 5");
        int Digit = Scan.nextInt();
        if(Digit%5 == 0)
        {
            System.out.println("Num is divisible by 5");
        }
        else
        {
            System.out.println("Num is not divisible by 5");
        }
        Scan.close();
    }
}
