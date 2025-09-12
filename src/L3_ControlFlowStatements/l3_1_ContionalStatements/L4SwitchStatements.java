package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L4SwitchStatements {
    public static void main(String[] args) {
        // Check marks using switch statement
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        // Switch statement is used to compare the value of a variable to multiple values
        // It is like a if-else-if ladder but more readable

        switch(marks/10){ //! Condition or expression should not be of Long, Float, Double, Boolean.
            case 10:
            case 9:
                System.out.println("A+ Grade");
                break;
            case 8:
                System.out.println("A Grade");
                break;
            case 7:
                System.out.println("B Grade");
                break;
            case 6:
                System.out.println("C Grade");
                break;
            case 5:
                System.out.println("D Grade");
                break;
            case 4:
                System.out.println("E Grade");
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid marks");
        }

        //! or

        switch(marks) {

            case 10, 9:
                System.out.println("A+ Grade");
                break;
            case 8:
                System.out.println("A Grade");
                break;
            case 7:
                System.out.println("B Grade");
                break;
            case 6:
                System.out.println("C Grade");
                break;
            case 5:
                System.out.println("D Grade");
                break;
            case 4:
                System.out.println("E Grade");
                break;
            case 3, 2, 1, 0:
                System.out.println("Fail");
                break;
        }
    }
}
