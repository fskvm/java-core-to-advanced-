package L3_ControlFlowStatements.l3_1_ContionalStatements;

public class L21ChallengePrintNumInWord {
    public static void main(String[] args) {
        printNumberInWord1(0);
        printNumberInWord1(1);
        printNumberInWord1(2);
        printNumberInWord1(3);
        printNumberInWord1(4);
        printNumberInWord1(5);
        printNumberInWord1(6);
        printNumberInWord1(7);
        printNumberInWord1(8);
        printNumberInWord1(9);
        printNumberInWord1(10);

        printNumberInWord2(0);
        printNumberInWord2(1);
        printNumberInWord2(2);
        printNumberInWord2(3);
        printNumberInWord2(4);
        printNumberInWord2(5);
        printNumberInWord2(6);
        printNumberInWord2(7);
        printNumberInWord2(8);
        printNumberInWord2(9);
        printNumberInWord2(10);

    }
    public static void printNumberInWord1(int number) {
        String numberInWord;
        switch (number) {
                case 0 -> numberInWord = "ZERO";
                case 1 -> numberInWord = "ONE";
                case 2 -> numberInWord = "TWO";
                case 3 -> numberInWord = "THREE";
                case 4 -> numberInWord = "FOUR";
                case 5 -> numberInWord = "FIVE";
                case 6 -> numberInWord = "SIX";
                case 7 -> numberInWord = "SEVEN";
                case 8 -> numberInWord = "EIGHT";
                case 9 -> numberInWord = "NINE";
                default -> numberInWord = "OTHER";
            }
            System.out.println(numberInWord);
        }
    //todo_  More precise and concise way to write the above method
    public static void printNumberInWord2(int number) {
        String numberInWord = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(numberInWord);
    }
}

