package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L18EnhancedSwitchCase {
    public static void main(String[] args) {

        // Traditional Switch Case
        int switchValue = 3;

        switch (switchValue) {
                case 1:
                System.out.println("Value was 1");
                break;
                case 2:
                System.out.println("Value was 2");
                break;
                case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
                default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }

        // Enhanced Switch Case (It requires JDK 14 or higher version)
        //! it removes the need for break statement and also the case label is replaced with -> operator

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3 , 4 or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4 or 5");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month: ");
        String month = in.nextLine().toUpperCase();

        System.out.print(month + " has " + getDaysInMonth(month) + " days.");
    }
    public static String getDaysInMonth(String month) {
        // Traditional way
        switch (month) {
            case "JANUARY":
            case "MARCH":
            case "MAY":
            case "JULY":
            case "AUGUST":
            case "OCTOBER":
            case "DECEMBER":
                return "31";
            case "APRIL":
            case "JUNE":
            case "SEPTEMBER":
            case "NOVEMBER":
                return "30";
            case "FEBRUARY":
                return "28 or 29";
        }
        return " 0 ";
    }
}


