package L3_ControlFlowStatements.l3_4_Patterns;

public class Pattern6 {
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
            for(int j = 0; j < i + 1; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();

        /*
           A
           B C
           D E F
           G H I J
        */

        int N = 4;
        char ch2 = 'A';
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print(ch2 + " ");
                ch2++;
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

         int H = 4;
//         char ch3 = 'A';   //for pattern  A B C D
//                                        E F G
//                                        H I
//                                        J
         for(int i = H; i > 0; i--) {
             char ch3 = 'A';
             for(int j = 0; j < i; j++) {
                 System.out.print(ch3 + " ");
                 ch3++;
             }
             System.out.println();
         }
    }
}
