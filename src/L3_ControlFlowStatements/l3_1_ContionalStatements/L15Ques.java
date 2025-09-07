package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L15Ques {
    public static void main(String[] args) {

        //todo_ The table given below is a list of gases, liquids, and solids. By entering substances one by one through the keyboard, recognize their state (gas, liquid, and solid).
        //todo_     WATER, OZONE, OXYGEN, PETROL, IRON, ICE, GOLD, MERCURY

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a substance: ");
        String substance = input.nextLine().toUpperCase();  //! toUpperCase() is used to convert the input to uppercase to avoid case sensitivity.
        switch (substance) {
            case "OZONE":
            case "OXYGEN":
                System.out.println("Gas");
                break;
            case "WATER":
            case "PETROL":
            case "MERCURY":
                System.out.println("Liquid");
                break;
            case "IRON":
            case "ICE":
            case "GOLD":
                System.out.println("Solid");
                break;
            default:
                System.out.println("Invalid substance");
        }
    }
}
