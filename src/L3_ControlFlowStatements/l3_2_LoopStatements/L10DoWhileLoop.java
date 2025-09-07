package L3_ControlFlowStatements.l3_2_LoopStatements;

public class L10DoWhileLoop {
    public static void main(String[] args) {

        // Do-While loop
        //! Simple do-while loop example

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 5);

        //! Another example with do-while loop if the condition is false then also it will execute the loop at least once
        int j = 1;
        boolean isReady = false;
        do {
            if(j > 5) {
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j > 0); //? Again set the value of isReady to true just for fun !
        }while (isReady);
    }
}
