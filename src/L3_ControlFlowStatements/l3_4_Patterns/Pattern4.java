package L3_ControlFlowStatements.l3_4_Patterns;

public class Pattern4 {
    public static void main(String[] args) {

        //todo_        Right Angle Triangle

        //*            for Simple Right angle triangle
        //?                 for(int i = 1; i <= n; i++)
        //?                     for(int j = 1; j <= i; j++)

        //?                 for(int i = 0; i < n; i++)              BEST
        //?                     for(int j = 0; j < i + 1; j++)

        //?                 for(int i = 0; i < n; i++)
        //?                     for(int j = 0; j <= i; j++)

        //*            for inverted Right angle triangle
        //?                 for(int i = n; i > 0; i--)              BEST
        //?                      for(int j = 0; j < i; j++)
        /*
             *
             * *
             * * *
             * * * *
         */

        int n = 4;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //! Or starting simply from one so we can exclude + 1 ,
        System.out.println();


        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //! Or
        System.out.println();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        /*
            * * * *
            * * *
            * *
            *
         */

        int N = 4;
        for(int i = N; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
