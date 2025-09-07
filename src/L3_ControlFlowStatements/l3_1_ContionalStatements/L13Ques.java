package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L13Ques {
    public static void main(String[] args) {

        //todo_ Write a program to calculate bill of Internet browsing. The conditions are given below.
        //todo_ (a) 1 Hour Rs. 20. (b) ½ Hour Rs. 10. (c) Hours Rs. 90.

        //todo_ Use if-else statement to calculate the amount of the bill.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();
        int amount = 0;
        if (minutes == 60) {
            amount = 20;
            System.out.println("Amount: " + amount);
        } else if (minutes == 30) {
            amount = 10;
            System.out.println("Amount: " + amount);
        } else {
            amount = 90;
            System.out.println("Amount: " + amount);
        }
    }
}
