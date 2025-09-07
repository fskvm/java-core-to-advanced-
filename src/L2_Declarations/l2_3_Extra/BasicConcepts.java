package L2_Declarations.l2_3_Extra;

public class BasicConcepts {
    public static void main(String[] args) {
// indentation is used to make the code more readable.Added before the begginning of the line.
        int myVariable = 50;

        myVariable++;
        myVariable--;

        // This is a statement
        System.out.println("This is a test");
        // Whitespace ( which is ignored by the compiler) is the space between the words and the semicolon.
        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50 + 45 + myVariable; // This is an expression and 50 , 45 and myVariable are operands. + is the operator.
        System.out.println("anotherVariable = " + anotherVariable);
        myVariable--;
        System.out.println("myVariable = " + myVariable);
    }

}
