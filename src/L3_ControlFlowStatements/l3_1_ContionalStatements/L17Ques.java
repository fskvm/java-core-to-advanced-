package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L17Ques {
    public static void main(String[] args) {

        //todo_   Write a program to find the incentive to be offered to a salesman based
        //todo_   on the sales of number of items/turnover. Use else if ladder.

        //? What is meaning of incentive and turnover?
        //? Incentive is a payment or concession to stimulate greater output or investment.
        //? Turnover is the amount of money taken by a business in a particular period.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items sold: ");
        int items = input.nextInt();
        System.out.println("Enter the turnover: ");
        double turnover = input.nextDouble();

        double incentive;
        if (items > 500 && turnover > 10000) {
            incentive = turnover * 0.1;
            System.out.println("Incentive: " + incentive);
        } else if (items > 300 && turnover > 5000) {
            incentive = turnover * 0.07;
            System.out.println("Incentive: " + incentive);
        } else if (items > 100 && turnover > 1000) {
            incentive = turnover * 0.05;
            System.out.println("Incentive: " + incentive);
        } else {
            incentive = turnover * 0.03;
            System.out.println("Incentive: " + incentive);
        }
    }
}
