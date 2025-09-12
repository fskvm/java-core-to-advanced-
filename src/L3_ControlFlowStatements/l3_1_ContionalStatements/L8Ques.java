package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L8Ques {
    public static void main(String[] args) {

        // WAP to enter a month of the year 2024 and display the number of days in that month (considering leap year and using a switch case)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January has 31 days");
                break;
            case 2:
                System.out.println("February has 29 days");
                break;
            case 3:
                System.out.println("March has 31 days");
                break;
            case 4:
                System.out.println("April has 30 days");
                break;
            case 5:
                System.out.println("May has 31 days");
                break;
            case 6:
                System.out.println("June has 30 days");
                break;
            case 7:
                System.out.println("July has 31 days");
                break;
            case 8:
                System.out.println("August has 31 days");
                break;
            case 9:
                System.out.println("September has 30 days");
                break;
            case 10:
                System.out.println("October has 31 days");
                break;
            case 11:
                System.out.println("November has 30 days");
                break;
            case 12:
                System.out.println("December has 31 days");
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }

        //! or

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("29 days");
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }

        //! or

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("29 days");
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }
    }
}
