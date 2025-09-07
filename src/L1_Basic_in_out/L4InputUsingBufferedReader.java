package L1_Basic_in_out;

//*                                       2) Using BufferedReader class

import java.io.BufferedReader; //? BufferedReader class of java.io package is used to read the text from a character-based input stream
import java.io.IOException;    //? IOException is a checked exception that must be handled
import java.io.InputStreamReader; //? InputStreamReader is a class of java.io package that is used to read bytes and decodes them into character

//! or
//! import java.io.*;  // It will import all the classes of java.io package

public class L4InputUsingBufferedReader {
    public static void main(String[] args) throws IOException {

           // Creating InputStreamReader object to read input from the keyboard i.e. System.in and converting byte stream to character stream hence reading character by character
        InputStreamReader in = new InputStreamReader(System.in); //? System is a class in java.lang package, "in" is a static member of System class and it is an object of InputStream class

           // Creating BufferedReader object to read input from the InputStreamReader object and converting character stream to buffered character stream hence reading line by line not character by character
           // (Buffered character stream is faster than character stream hence performance is better)
        BufferedReader br = new BufferedReader(in); //? BufferedReader is a class in java.io package, "br" is an object of BufferedReader class and it is taking InputStreamReader object as an argument

           //! or
           // ! BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // it is more concise way to create BufferedReader object

           // Types of BufferedReader methods to take input

        System.out.print("Enter yours Full Name: ");
        String name = br.readLine(); //? readLine() method of BufferedReader class is used to read a line of text
        System.out.println("Yours Full Name is: " + name);

        System.out.print("Enter any Character: ");
        char ch1 = br.readLine().charAt(0);
        System.out.println("Entered Character is: " + ch1);

        System.out.print("Enter yours Age: ");
        int age = Integer.parseInt(br.readLine()); //? readLine() method of BufferedReader class is used to read a line of text and parseInt() method of Integer class is used to convert string to int
        System.out.println("Yours Age is: " + age);

        System.out.print("Enter yours Height: ");
        double height = Double.parseDouble(br.readLine());
        System.out.println("Yours Height is: " + height);

        System.out.print("Are you Married? (true/false): ");
        boolean isMarried = Boolean.parseBoolean(br.readLine());
        System.out.println("Are you Married? " + isMarried);

        System.out.print("Enter yours Byte Value: ");
        byte byteValue = Byte.parseByte(br.readLine());
        System.out.println("Yours Byte Value is: " + byteValue);

        System.out.print("Enter yours Short Value: ");
        short shortValue = Short.parseShort(br.readLine());
        System.out.println("Yours Short Value is: " + shortValue);

        System.out.print("Enter yours Long Value: ");
        long longValue = Long.parseLong(br.readLine());
        System.out.println("Yours Long Value is: " + longValue);

        System.out.print("Enter yours Float Value: ");
        float floatValue = Float.parseFloat(br.readLine());
        System.out.println("Yours Float Value is: " + floatValue);


        br.close();
        in.close();

    }
}
