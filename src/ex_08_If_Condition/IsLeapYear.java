package ex_08_If_Condition;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a year to check");
        int Year = Scan.nextInt();

        if (Year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (Year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (Year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        Scan.close();

    }
}
