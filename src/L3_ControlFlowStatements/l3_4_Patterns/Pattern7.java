package L3_ControlFlowStatements.l3_4_Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        /*
           A
           B B
           C C C
           D D D D
         */

        int n = 4;
        int alpha = 65;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print((char)(alpha + i) + " ");
            }
            System.out.println();
        }


        /*
           1
           2 2
           3 3 3
           4 4 4 4
        */
         int N = 4;
         for(int i = 1; i <= N; i++) {
             for(int j = 1; j <= i; j++) {
                 System.out.print(i + " ");
             }
             System.out.println();
         }
         }


    }
