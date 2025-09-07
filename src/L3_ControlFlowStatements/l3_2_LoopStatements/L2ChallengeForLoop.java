package L3_ControlFlowStatements.l3_2_LoopStatements;

public class L2ChallengeForLoop {
    public static void main(String[] args) {

        for(double i = 7.5; i <= 10; i += 0.25) {
            double interestAmount = calculateInterest(100.0, i);
            if(interestAmount > 8.5) { // as soon as interest amount is greater than 8.5 that is 8.75, the loop break before printing the 8.5 interest amount
                break;
            }
            System.out.println("Interest on 100 at " + i + "% is " + interestAmount);
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }
}
