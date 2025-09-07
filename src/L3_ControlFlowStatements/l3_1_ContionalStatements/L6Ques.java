package L3_ControlFlowStatements.l3_1_ContionalStatements;

public class L6Ques {
    public static void main(String[] args) {
        // ternary operator
        int a = 10;
        System.out.println(a >= 0 ? "a is positive" : "a is negative");
        int b = -10;
        System.out.println(b < 0 ? "b is negative" : "b is positive");

        System.out.println(a%2 == 0 ? "a is even" : "a is odd");
        System.out.println(b%2 == 0 ? "b is even" : "b is odd");
    }
}
