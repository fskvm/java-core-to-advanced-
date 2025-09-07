package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L7NestedIfElse {
    public static void main(String[] args) {
        // Nested if else
        //todo_ WAP to find the largest number among three number ( note without using logical operators )
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Third number: ");
        int num3 = sc.nextInt();
        System.out.println("Using Nested if else statement,");
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the largest among three.");
            } else {
                System.out.println(num3 + " is the largest among three.");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is the largest among three.");
            } else {
                System.out.println(num3 + " is the largest among three.");
            }
        }
        // if else if
        //todo_ WAP to find the largest number among three number.
        System.out.println("Using if-else-if statement,");
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest among three.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest among three.");
        } else {
            System.out.println(num3 + " is the largest among three.");
        }

        //todo_ WAP to p\display the days of week using switch case
        System.out.println("Enter the day of week(in number form 1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;


        }
    }
}
