package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;


public class L2OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // Check the number is even or odd using the modulo operator
        // if a number is divisible by 2 then provide remainder 0 if other than 0 then it is odd
        if(num % 2 == 0){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
