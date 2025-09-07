package L3_ControlFlowStatements.l3_4_Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        /*
                     A
                   A B
                 A B C
               A B C D
         */

        int n = 4;
        for(int i = 0; i < n; i++) {
            char ch = 'A';
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for(int k = 0; k <= i; k++ ) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();

        /*
             A B C D
               A B C
                 A B
                   A
         */

        int N = 4;
        for(int i = N; i > 0; i--) {
            char ch = 'A';
            for(int j = N; j > i; j--) {
                System.out.print("  ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
