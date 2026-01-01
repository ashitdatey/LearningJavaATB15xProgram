package ex_08_If_Condition;

import java.util.Scanner;

public class PosNegZeroNumber {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the Number to check");
        int Digit = Scan.nextInt();
        if(Digit > 0)
        {
            System.out.println("It is a positive number");
        }
        else if(Digit < 0) {
            System.out.println("it is a neg");
        }
        else
        {
            System.out.println("It is a zero");
        }
        Scan.close();
    }
}
