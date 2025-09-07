package L1_Basic_in_out;

//! In java, there are three ways to read console input. Using the 3 following ways, we can read input data from the console.
//!   1) Using Scanner class
//!   2) Using BufferedReader class
//!   3) Using Console class

//*                                          1) Using Scanner class

import java.util.Scanner;


public class L3InputUsingScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //? making object of Scanner class where System.in is the standard input stream i.e. keyboard

        // Types of Scanner methods to take input
        // nextLine() method
        System.out.print("Enter yours Full Name: ");
        String name = sc.nextLine();
        System.out.println("Yours Full Name is: " + name);

        // next() method
        System.out.print("Enter yours First Name: "); //? if we enter more than one word then it will take only first word
        String firstName = sc.next();
        System.out.println("Yours First Name is: " + firstName);

        // nextInt() method
        System.out.print("Enter yours Age: ");
        int age;
        age = sc.nextInt();
        System.out.println("Yours Age is: " + age);

        // nextDouble() method
        System.out.print("Enter yours Height: ");
        double height = sc.nextDouble();
        System.out.println("Yours Height is: " + height);

        // nextBoolean() method
        System.out.print("Are you Married? (true/false): ");
        boolean isMarried = sc.nextBoolean();
        System.out.println("Are you Married? " + isMarried);

        // nextByte() method
        System.out.print("Enter yours Byte Value: ");
        byte byteValue = sc.nextByte();
        System.out.println("Yours Byte Value is: " + byteValue);

        // nextShort() method
        System.out.print("Enter yours Short Value: ");
        short shortValue = sc.nextShort();
        System.out.println("Yours Short Value is: " + shortValue);

        // nextLong() method
        System.out.print("Enter yours Long Value: ");
        long longValue = sc.nextLong();
        System.out.println("Yours Long Value is: " + longValue);

        // nextFloat() method
        System.out.print("Enter yours Float Value: ");
        float floatValue = sc.nextFloat();
        System.out.println("Yours Float Value is: " + floatValue);

        // Here there is no nextChar() method in Scanner class to take char input
        // so we can use next().charAt(0) method to take char input
        System.out.print("Enter any Character: ");
        char ch = sc.next().charAt(0); //? here we are taking input as string and then converting it to char of 0th index or any index we want
        System.out.println("Yours Character is: " + ch);



        sc.close(); //? why closing the Scanner object ? because it will free the memory of Scanner object




    }
}
