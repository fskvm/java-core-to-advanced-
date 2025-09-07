package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L11Ques {
    public static void main(String[] args) {

        //todo_  Write a program to calculate the bill of a job work done as follows. Use if-else statement.
        //todo_ (a) Rate of typing 3 Rs./page. (b) Printing of first copy Rs. 5/page and the rate of every copy taken after that as Rs. 3/page.
        // The user should enter the number of pages and printout copies he/she wants.

        // Use if-else statement.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of pages: ");
        int pages = input.nextInt();
        System.out.print("Enter the number of copies: ");
        int copies = input.nextInt();

        int bill;
        if (copies == 1) {
            bill = pages * 3 + 5;
        } else {
            bill = pages * 3 + 5 + (copies - 1) * 3; // printing of second and more copies price is just 3 rupess for whole set of pages
        }
        System.out.println("The bill is: " + bill);
        System.out.println("Thank you for using our service");

    }
}
