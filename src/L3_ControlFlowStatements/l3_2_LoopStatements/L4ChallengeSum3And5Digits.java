package L3_ControlFlowStatements.l3_2_LoopStatements;

public class L4ChallengeSum3And5Digits {
    public static void main(String[] args) {
        int countOfMatches = 0;
        int sumOfMatches = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                countOfMatches++;
                sumOfMatches += i;
                System.out.println("Found number = " + i);
            }
            if (countOfMatches == 5) {
                break;
            }
        }
        System.out.println("Total Sum of 3 and 5 divisible numbers = " + sumOfMatches);
    }

}
