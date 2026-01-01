package ex_08_If_Condition;

import java.util.Scanner;

public class MultipleOf3And7 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the Digit to check");
        int Digit = Scan.nextInt();
        if(Digit % 3 == 0 && Digit % 7 == 0)
        {
            System.out.println("It is multiple of 3 and 7: " +Digit);
        }
        else
        {
            System.out.println("Not multiple of 3 and 7 :" +Digit);
        }
    }
}
