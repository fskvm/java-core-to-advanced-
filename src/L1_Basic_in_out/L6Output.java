package L1_Basic_in_out;

//! In java, there are three ways to print output:
//! 1. System.out.print() - prints the output but does not move to the next line
//! 2. System.out.println() - prints the output and moves to the next line
//! 3. System.out.printf() - prints the output and allows multiple formatting options

public class L6Output {
    public static void main(String[] args) {

        long x = 25;
        long y = 50;

        //* 1. System.out.print() --> print() method of PrintStream class
        //*                        --> prints the output but does not move to the next line
        //*                        --> This method only works with argument, otherwise it is a syntax error.
        //?                            System.out.print();  Syntax error
        //*                        --> \n is used to move to the next line(i.e escape sequence)
        System.out.print("The value of x is ");
        System.out.print(x);
        System.out.print(", and the value of y is ");
        System.out.print(y);
        System.out.print(".\n");
        //!  or
        System.out.print("The Value of x is " + x + ", and the value of y is " + y +".\n");



        //*  2. System.out.println() --> println() method of PrintStream class
        //*                          --> prints the output and moves to the next line
        //*                          -->It can work without arguments.
                                        System.out.println();
        //*                          --> \n is used to move to the next line(i.e escape sequence)
        System.out.println("The value of x is currently \n" + x + ".");
        System.out.println("The value of y is currently \n" + y + ".");



        //*  3. System.out.printf()
        //*                          --> prints the output without moving to the next line and allows multiple formatting options

        //         Format Specifiers - These are used to format the output in a specific way.They begin with a percent character (%) and
        //                              end with a type character that indicates the type of data.
        // 3.0. %n - New Line
        System.out.printf("1 \n2 \n3 \n4 \n5 \n");
        // 3.1. %d - Decimal integer
        System.out.printf("The value of x is %d, and the value of y is %d.\n", x, y);

        // 3.2. %f - Decimal floating-point
        float num1 = 6.6666666666666666f;
        double num2 = 6.6666666666666666;
        System.out.println(num1); //? by default precision is 7
        System.out.println(num2); //? by default precision is 15

        System.out.printf("%f %n",num1); //? by default precision is 6 in printf
        System.out.printf("%f %n ",num2);//? by default precision is 6 in printf

        System.out.printf("%.2f %n",num1);
        System.out.printf("%.15f %n",num2);
        System.out.printf("%.25f %n",num2); //? we can increase the precision

        // 3.3  %e and %E - Scientific notation
        System.out.printf("%e %n", 123.1234567);
        System.out.printf("%E %n", 123.1234567);
        System.out.printf("%.2e %n", 123.1234567);
        System.out.printf("%.4E %n", 123.1234567);

        // 3.5 %s and %S - String
        System.out.printf("%s %n", "Hello World");
        System.out.printf("%S %n", "Hello World");
        //? vise versa is not possible
        System.out.printf("%S %n","HELLO");
        System.out.printf("%s %n","HELLO");

        System.out.printf("%.15s %n", "Hello World Akhtar raza"); //? Call only 15 characters

        // 3.6 %c - Character
        System.out.printf("%c %n", '%');
        System.out.printf("%C %n", 'a');
        System.out.printf("%c %n", 67); //? ASCII value of 65 is A

        // 3.7 %b and %B - Boolean
        int num3 = 10;
        int num4 = 20;
        int num5 = 30;
        boolean num6 = false;
        System.out.printf("%b %n",10 < 20);
        System.out.printf("%B %n",10 > 20);
        System.out.printf("%B %n",num5);
        System.out.printf("%b %n",num6);

        // 3.8 %h and %H - Hash code
        System.out.printf("%h %n", "white");
        System.out.printf("%H %n", "black");
        //?he hash code is a unique identifier for the object, often used in hashing data structures like hash tables.

        // 3.9 %a and %A - Hexadecimal floating-point
        System.out.printf("%a %n", 123.1234567);
        System.out.printf("%A %n", 123.1234567);
        /*  These specifiers are used to print floating-point numbers in hexadecimal format, which can be useful for debugging or
         when a precise representation of the floating-point value is needed.*/

        // 3.10 %o - Octal integer
        System.out.printf("%o %n", 8);
        System.out.printf("%o %n", 9);
        System.out.printf("%o %n", 16);

        // 3.11 %x and %X - Hexadecimal integer
        System.out.printf("%x %n", 10);
        System.out.printf("%X %n", 15);
        System.out.printf("%X %n", 168);

        // 3.12 %% - Percent
        System.out.printf("The value of x is %d%%, and the value of y is %d%%.\n", x, y);

        // 3.13 %t and %T - Date/Time
        System.out.printf("%tF %n", System.currentTimeMillis()); //? yyyy-MM-dd
        System.out.printf("%tD %n", System.currentTimeMillis()); //? MM/dd/yy
        System.out.printf("%tT %n", System.currentTimeMillis()); //? HH:mm:ss
        System.out.printf("%tr %n", System.currentTimeMillis()); //? hh:mm:ss AM/PM
        System.out.printf("%tR %n", System.currentTimeMillis()); //? HH:mm
        System.out.printf("%tY %n", System.currentTimeMillis()); //? yyyy
        System.out.printf("%tj %n", System.currentTimeMillis()); //? Day of the year
        System.out.printf("%tm %n", System.currentTimeMillis()); //? Month
        System.out.printf("%td %n", System.currentTimeMillis()); //? Day of the month
        System.out.printf("%tH %n", System.currentTimeMillis()); //? Hour
        System.out.printf("%tM %n", System.currentTimeMillis()); //? Minute
        System.out.printf("%tS %n", System.currentTimeMillis()); //? Second
        System.out.printf("%tz %n", System.currentTimeMillis()); //? Timezone
        System.out.printf("%tZ %n", System.currentTimeMillis()); //? Timezone
        System.out.printf("%tp %n", System.currentTimeMillis()); //? AM/PM
        System.out.printf("%tB %n", System.currentTimeMillis()); //? Month
        System.out.printf("%tb %n", System.currentTimeMillis()); //? Month
        System.out.printf("%ta %n", System.currentTimeMillis()); //? Day of the week

        System.out.printf("%tc %n", System.currentTimeMillis()); //? Complete date and time


        // 3.14 Width, Precision, and Flags

        System.out.printf("%010d %n", 786); //? Zero Padding Specifier
        System.out.printf("|%10d| %n", 786); //? Width Specifier
        System.out.printf("|%-10d| %n", 786); //? Left Justify
        System.out.printf("|%20.5f| %n", 786.123456);
        System.out.printf("|%-20.5f| %n", 786.123456); //? Left Justify
        //! Width specifier is used to set the width of the output and left justify is used to left justify the output

        System.out.printf("%,d %n",50_000_000); //? Comma Specifier
        //! comma specifier is used to make the number more readable by adding commas

        System.out.printf("% d %n",-50567); //? Space Specifier
        System.out.printf("% d %n",50567); //? Space Specifier
        //! space specifier is use in a way that positive and negative number get aligned

        System.out.printf("%+d %n",10000); //? Sign Specifier has only effect on positive numbers
        System.out.printf("%+d %n",-10000); //? Sign Specifier has no effect on negative numbers
        //! Sign specifier is used to show the sign of the number

        System.out.printf("%(d %n",-500); //? Parentheses Specifier puts negative numbers in parentheses
        System.out.printf("%(d %n",500); //? Parentheses Specifier has no effect on positive numbers
        //! Parentheses specifier is used to put negative numbers in parentheses


    }
}
