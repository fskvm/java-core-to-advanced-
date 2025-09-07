package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L10Ques {
    public static void main(String[] args) {

        //todo_ Write a program to check whether the blood donor is eligible for donating blood. The conditions laid down are as under. Use if statement.
        //todo_ (a) Age should be greater than 18 years but not more than 55 years. (b) Weight should be more than 45 kg.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.print("Enter the weight: ");
        int weight = sc.nextInt();

        if ( age > 18 && age <= 55 && weight > 45) {
            System.out.println("Eligible for donating blood");
        } else {
            System.out.println("Not eligible for donating blood");
        }

        //todo_ Write a program to check whether the voter is eligible for voting. If his/her age is equal to or greater than 18,
        //todo_ display the message "Eligible" otherwise "Non-eligible". Use if statement.

        System.out.print("Enter the age: ");
        int age2 = sc.nextInt();

        if (age2 >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Non-eligible");
        }
    }
}
