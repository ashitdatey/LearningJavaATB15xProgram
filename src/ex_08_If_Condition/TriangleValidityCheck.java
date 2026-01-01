package ex_08_If_Condition;

import java.util.Scanner;

public class TriangleValidityCheck { //Triangle is valid only when sum of 3 side angles is 180 degree
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter side 1 Angle: ");
        int side_1 = Scan.nextInt();
        System.out.println("Enter side 2 Angle: ");
        int side_2 = Scan.nextInt();
        System.out.println("Enter side 3 Angle: ");
        int side_3 = Scan.nextInt();

        if(side_1 + side_2 + side_3 == 180)
        {
            System.out.println("it is a valid triangle");
        }
        else
        {
            System.out.println("It is not valid triangle");
        }
        Scan.close();
    }
}
