package L1_Basic_in_out;

import java.sql.SQLOutput;

public class L8CommandOtherThanSring {
    //* Command Line Arguments : Other than string type example such as integer, float, double, etc.
    public static void main(String[] args) {
        if(args.length < 3) {
            System.out.println("Please provide 3 arguments : an integer, a float, and a double.");
            return;
        }
        try {
            int a = Integer.parseInt(args[0]);
            float b = Float.parseFloat(args[1]);
            double c = Double.parseDouble(args[2]);
            System.out.println("Integer Argument: " + a);
            System.out.println("Float Argument: " + b);
            System.out.println("Double Argument: " + c);
            System.out.println("Sum of all arguments: " + (a + b + c));
            //? we can also use a, b and c in calculations
            int sum = a + (int)b + (int)c;
            System.out.println("Sum of all arguments (cast to int): " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid arguments."); //? if any argument is string type cause to exception
        }

    }

}
