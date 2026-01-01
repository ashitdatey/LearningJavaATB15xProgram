package ex_08_If_Condition;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1");
        int side_1 = sc.nextInt();
        System.out.println("Enter side 2");
        int side_2 = sc.nextInt();
        System.out.println("Enter side 3");
        int side_3 = sc.nextInt();
        if(side_1 == side_2 && side_2 == side_3 && side_3 == side_1)

//        If:
//        side_1 == side_2
//        side_2 == side_3
//        then side_1 == side_3 is already guaranteed.
//        So the third comparison is unnecessary.

        {
            System.out.println("It is a Equilateral triangle");
        }
        else if(side_1 == side_2 || side_2 == side_3 || side_3 == side_1)
        {
            System.out.println("It is a isosceles triangle");
        }
        else
        {
            System.out.println("It is an scalene");
        }

    }
}