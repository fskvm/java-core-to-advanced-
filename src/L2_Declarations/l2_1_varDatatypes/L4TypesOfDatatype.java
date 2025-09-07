package L2_Declarations.l2_1_varDatatypes;

public class L4TypesOfDatatype {
    public static void main(String[] args) {

        // 1) Primitive data types
        // byte
        byte varByte = 127;
        System.out.println("Byte: " + varByte);

        // short
        short varShort = 32767;
        System.out.println("Short: " + varShort);

        // int
        int varInt = 2147483647;
        System.out.println("Int: " + varInt);

        // long
        long varLong = 9223372036854775807L;
        System.out.println("Long: " + varLong);

        // float
        float varFloat = 3.4028235E38f;
        System.out.println("Float: " + varFloat);

        // double
        double varDouble = 1.7976931348623157E308;
        System.out.println("Double: " + varDouble);

        // char
        char varChar = 'A';
        System.out.println("Char: " + varChar);

        // boolean
        boolean varBoolean = true;
        System.out.println("Boolean: " + varBoolean);

        // 2) Non-primitive data types
        // String
        String varString = "Hello World!";
        System.out.println("String: " + varString);

        // Array
        int[] varArray = {1, 2, 3, 4, 5};
        System.out.println("Array: " + varArray[0]);

        // Class
        L4TypesOfDatatype varClass = new L4TypesOfDatatype();
        System.out.println("Class: " + varClass);

        // Interface
        // Interface varInterface = new Interface();
        // System.out.println("Interface: " + varInterface);



        //! Detailed explained

        // Float and Double
        int myIntValue = 5 / 3;
        float myFloatValue = 5.00f / 3.00F;//?  this show error without F because by deflaut it is double
        //! or
        float myfloatValue2 = (float)5.25;
        double myDoubleValue = 5.00 / 3;
        double pi = 3.1415927;
        double anotherNumber = 3_000_000.4_567_890;

        double numOfPounds = 200;
        double convertKilo = numOfPounds * 0.45359237;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println(myfloatValue2);
        System.out.println(pi);
        System.out.println(anotherNumber);
        System.out.println("Program to convert given number of Pounds to kilogram ");
        System.out.println("Converted kilograms is " + convertKilo);

        // Character and boolean
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u002f';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);

        char c = 64;
        System.out.println(c);
        c++;
        System.out.println(c);

        // Promotion of datatype in expression
        byte b = 42;
        char chara = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result =  (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);


    }
}
