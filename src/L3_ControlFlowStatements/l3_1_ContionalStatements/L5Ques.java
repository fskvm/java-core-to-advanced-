package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L5Ques {
    public static void main(String[] args) {
        // Find the character that is Uppercase or Lowercase
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is Uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is Lowercase");
        } else {
            System.out.println("The character is not an alphabet");
        }

        //! or Using ASCII(American Standard Code for Information Interchange) values
        //? A-Z: 65-90 and a-z: 97-122 in between 91-96 are special characters namely [ \ ] ^ _ `

        // if (ch >= 65 && ch <= 90) {
        //     System.out.println("The character is Uppercase");
        // } else if (ch >= 97 && ch <= 122) {
        //     System.out.println("The character is Lowercase");
        // } else {
        //     System.out.println("The character is not an alphabet");
        // }
        sc.close();
        //! before checking of char , it first convert the char to ASCII value
        //! that is known as Implicit Type Conversion then it checks the numerical value
    }
}
