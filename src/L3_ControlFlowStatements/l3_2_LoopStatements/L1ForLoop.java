package L3_ControlFlowStatements.l3_2_LoopStatements;

public class L1ForLoop {
    public static void main(String[] args) {

        //! Simple for loop example
        for(int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        //! Using for loop to calculate interest
        for(double rate = 2.0; rate <= 8.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("Interest on 10000 at " + rate + "% is " + interestAmount);
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }
}
