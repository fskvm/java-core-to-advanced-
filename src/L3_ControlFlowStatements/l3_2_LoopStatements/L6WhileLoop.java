package L3_ControlFlowStatements.l3_2_LoopStatements;

public class L6WhileLoop {
    public static void main(String[] args) {

        // Part 1: While loop
        //! Simple while loop example
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        //! Another example with while loop where we can break the loop
        int j = 1;
        boolean isReady = true;
        while (isReady) {
            if(j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }

        // Part 2 : While loop
        //! while loop to print numbers from 0 to 50 with increment of 5
        int number = 0;
        while (number < 50) {
            number += 5;
            System.out.print(number + "_");
        }
        System.out.println();
        //! while loop to print numbers from 0 to 50 with skipping number divisible by 25
        int number2 = 0;
        while (number2 < 50) {
            number2 += 5;
            if(number2 % 25 == 0) {
                continue;
            }
            System.out.print(number2 + "_");
        }

    }
}
