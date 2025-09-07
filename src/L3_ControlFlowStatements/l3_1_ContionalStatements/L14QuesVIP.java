package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L14QuesVIP {
    public static void main(String[] args) {

        //todo_ Write a program to enter a character through keyboard. Use switch case structure and print appropriate message.
        //todo_ Recognize whether the entered character is a vowel, a consonant, or a symbol?

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vowel");
                break;
            default:
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    System.out.println("Consonant");
                } else {
                    System.out.println("Symbol");
                }
        }
    }
}
