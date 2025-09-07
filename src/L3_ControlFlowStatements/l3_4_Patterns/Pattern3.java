package L3_ControlFlowStatements.l3_4_Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        /*
             A B C D
             A B C D
             A B C D
             A B C D
        */

        int n = 4;
//!         char ch = 'A';                  if you don't want to reset to 'A' for each row then put just above the outer loop
        for (int i = 0; i < n; i++) {
            char ch = 'A';              //! if you want reset to 'A' for each row then put just below the outer loop
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();

        /*
             A B C
             D E F
             G H I
        */

        int N = 3;
        char ch2 = 'A';                     //! if you don't want to reset to 'A' for each row then put just above the outer loop
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(ch2 + " ");
                ch2++;
            }
            System.out.println();
        }



    }
}
