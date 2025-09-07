package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L9NestedSwitchCase {
    public static void main(String[] args) {

        // Nested Switch Case
        //todo_ WAP to show odd or even using nested switch case
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.println("Number is zero");
                break;
            default:
                switch (num % 2) {
                    case 0:
                        System.out.println("Number is even.");
                        break;
                    case 1:
                        System.out.println("Number is odd.");
                        break;
                }
        }

    }
}
