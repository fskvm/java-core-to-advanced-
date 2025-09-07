package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L16Ques {
    public static void main(String[] args) {

        //todo_ Write a program to calculate telephone bill based on the following:
        //todo_ (a) Calls 0 to 100: Rs. 1/call. (b) Calls 101 to >=500: Rs. 0.75/call. (c) More than 500 calls: Rs. 0.50/call.

        // else if ladder
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of calls: ");
        int calls = input.nextInt();
        double bill;
        if (calls >= 0 && calls <= 100) {
            bill = calls * 1;
            System.out.println("Bill: " + bill);
        } else if (calls >= 101 && calls <= 500) {
            bill = calls * 0.75;
            System.out.println("Bill: " + bill);
        } else if (calls > 500) {
            bill = calls * 0.50;
            System.out.println("Bill: " + bill);
        } else {
            System.out.println("Invalid number of calls");
        }
    }
}
