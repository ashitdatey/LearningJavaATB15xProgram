package ex_08_If_Condition;

import java.util.Scanner;

public class CharVowelOrConsonant {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a char");
        char ch = Scan.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("It is a Vowel " + ch);
        }
        else
        {
            System.out.println("Not a vowel " + ch);
        }
        Scan.close();
    }
}
