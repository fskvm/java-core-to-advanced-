package L3_ControlFlowStatements.l3_4_Patterns;

public class Pattern8 {
    public static void main(String[] args) {

        //todo_   Left Angle Triangle

        //*         for Simple Left angle triangle
        //?             for(int i = 0; i < n; i++)
        //?                 for(int j = 0; j < n - i - 1; j++)
        //?                     System.out.print("  ");
        //?                 for(int j = 0; j <= i; j++)
        //?                     System.out.print( Alphabet or numeric or "Star" + " ");

        //*         for inverted Left angle triangle
        //?             for(int i = n; i > 0; i--)
        //?                 for(int j = n; j > i; j--)
        //?                     System.out.print("  ");
        //?                 for(int j = 0; j < i; j++)
        //?                     System.out.print( Alphabet or numeric or "Star" + " ");



        /*
                *
              * *
            * * *
          * * * *

         */

        int n = 4;
        for (int i = 0; i < n; i++) {

            // Loop to print spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Loop to print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //! OR  with spaces in print statement            BEST

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); //? spaces includes here
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* "); //? spaces includes here (one space for space and one character spaces)
            }
            System.out.println();
        }
        System.out.println();

        //!OR   with spaces included same as above by including spaces for 2 times in conditions
        int  N = 4;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 2 * (N - i - 1); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}