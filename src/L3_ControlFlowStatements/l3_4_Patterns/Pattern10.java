package L3_ControlFlowStatements.l3_4_Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        /*
                  1
                1 2
              1 2 3
            1 2 3 4
         */

        int n = 4;
        for(int i = 0; i < n; i++) {
            int num = 1;
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();
        /*
              1 2 3 4
                1 2 3
                  1 2
                    1
         */

        int N = 4;
        for(int i = N; i > 0; i--) {
            int num = 1;
            for(int j = N; j > i; j--) {
                System.out.print("  ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
