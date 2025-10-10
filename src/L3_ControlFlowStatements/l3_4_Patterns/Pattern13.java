package L3_ControlFlowStatements.l3_4_Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        printSquareStar(11);
    }

    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {

                boolean isFirstRowOrColumn = row == 1 || column == 1;
                boolean isLastRowOrColumn = row == number || column == number;
                boolean isDiagonal = (row == column) || (column == (number - row + 1));

                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
}


