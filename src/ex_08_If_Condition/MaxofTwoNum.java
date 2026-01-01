package ex_08_If_Condition;

import java.util.Scanner;

public class MaxofTwoNum {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter digit A");
        int A = Scan.nextInt();
        System.out.println("Enter digit B");
        int B = Scan.nextInt();
        if(A>B)
        {
            System.out.println("Number A is max");
        }
        else
        {
            System.out.println("Number B is Max");
        }
        Scan.close();
    }
}
