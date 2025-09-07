package L3_ControlFlowStatements.l3_4_Patterns;

public class Pattern1 {
    public static void main(String[] args) {
       /*
            1 2 3 4
            1 2 3 4
            1 2 3 4
            1 2 3 4
        */
        //todo_   for each 'outer loop',the 'inner loop' runs "completely".

        int n = 4;
//        for(int i = 1; i <= n; i++) {          It is not most common way as it is not starting from 0 ( array index starts from 0)
//        for(int i = 0; i <= n - 1; i++) {      It is okay but why to use -1 when we can ignore equal to sign <= and use < only
        for (int i = 0; i < n; i++) {     //! outer loop responsible for columns printing and most common way
            for (int j = 1; j <= n; j++) {  //! inner loop responsible for rows printing
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*
            1 2 3
            4 5 6
            7 8 9

         */

        int N = 3;
        int num = 1;                     //! if you don't want to reset to 1 for each row then put just above the outer loop
        for (int i = 0; i < N; i++) {
                                         //! if you want reset to 1 for each row then put just below the outer loop
            for (int j = 0; j < N; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }
}
