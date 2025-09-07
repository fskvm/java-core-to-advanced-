package L1_Basic_in_out;

//todo                                          3) Using Console class
//? Console class is used to read password and other sensitive data from the console. It is not used to read general data from the console.

import java.io.Console;
//! or
//! import java.io.*;
public class L5InputUsingConsole {
    public static void main(String[] args) {
          // Create a Console object
        Console con = System.console(); //? System is a class in java.lang package and console() is a static method of System class that returns the Console object

          // types of Console methods to take input(mostly used)

          // readLine() method
        System.out.print("Enter yours Username: ");
        String username = con.readLine();

          // readPassword() method
        System.out.print("Enter yours Password: ");
        char[] password= con.readPassword();

        System.out.println("Yours Username is: " + username);
        System.out.println("Yours Password is: " + new String(password));
    }

}
