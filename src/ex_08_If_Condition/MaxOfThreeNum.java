package ex_08_If_Condition;

import java.util.Scanner;

public class MaxOfThreeNum {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter Digit A");
        int A = Scan.nextInt();
        System.out.println("Enter Digit B");
        int B = Scan.nextInt();
        System.out.println("Enter Digit C");
        int C = Scan.nextInt();

        if(A >= B && A >= C)
        {
            System.out.println("Max between 3 num is:" + A);
        }
        else if(B >= A && B >= C)
        {
            System.out.println("Max between 3 num is:" + B);
        }
        else
        {
            System.out.println("Max between 3 num is:" + C);
        }
        Scan.close();
    }
}
