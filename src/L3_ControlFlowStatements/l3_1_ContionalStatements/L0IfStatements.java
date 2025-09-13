package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L0IfStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // If statement
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        //todo_ To check if number is positive or negative ?
        // If-else statement
        int n = -10;
        if (n >= 0) {
            System.out.println("n is positive");
        } else {
            System.out.println("n is negative");
        }
        //! OR note that n < 0 that is negative conditions and n >= 0 is positive condition
        int N = 10;
        if (N < 0) {
            System.out.println("n is negative");
        } else {
            System.out.println("N is positive");
        }

        // Real world example
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        sc.close();

    }
}

