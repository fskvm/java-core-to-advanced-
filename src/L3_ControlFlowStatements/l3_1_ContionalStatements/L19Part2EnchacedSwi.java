package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L19Part2EnchacedSwi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month: ");
        String month = in.nextLine().toUpperCase();

        System.out.print(month + " has " + getDaysInMonth(month) + " days.");
    }
    public static String getDaysInMonth(String month) {
        // Enhanced way
        return switch (month) {
               case "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER" -> {yield "31";}
                case "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" -> "30";
                case "FEBRUARY" -> "28 or 29";
                default -> {
                    String badResponse =  month + "Invalid month";
                    yield badResponse;
                }
        };

        //todo_ or 1st use of yield keyword - yield is used to return the value from the switch expression.
        //     yield switch (month) {
        //         case "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER" -> "31";
        //         case "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" -> "30";
        //         case "FEBRUARY" -> "28 or 29";
        //         default -> "Invalid month";
        //!     }; // Semi-colon is used here because yield is a statement and it requires a semi-colon at the end.

        //todo_ or 2nd use of yield keyword - your  case label uses a code block with opening and closing braces
        //     return switch (month) {
        //         case "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER" -> "31";
        //         case "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" -> "30";
        //         case "FEBRUARY" -> "28 or 29";
        //         default -> {
        //             yield "Invalid month";
        //         }
        //!    }; // Semi-colon is used here because yield is a statement and it requires a semi-colon at the end.
    }
}
