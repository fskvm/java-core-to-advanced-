package L2_Declarations.l2_2_tokens;

public class L8StringConcatenation {
    public static void main(String[] args) {

        //* String concatenation operator (+)
        //todo String concatenation is the process of combining two or more Strings into a single String.


        //todo String + anything else, gives us a String as a result, concatenating anything after the String as text to the initial String.
        int myIntValue = 50 , mySecondIntValue = 100 , myThirdIntValue = 150 , myFourthIntValue = 200;
        String StringValue = " <-- before calculated value AND after concatenation happens --> ";
        System.out.println(myIntValue + mySecondIntValue + StringValue +myThirdIntValue + myFourthIntValue);
         System.out.println("this is result: " + myIntValue + mySecondIntValue + StringValue +myThirdIntValue + myFourthIntValue);   //? this is result : 50100 <-- before calculated value AND after concatenation happens --> 150200 (initial calculation is not done because string literal is present at the start of the statement)


// Strings are immutable. Immutable means that you can't change a String object after it's created, as shown below
        String myString1 = "This is a String"; // Creates a String object
        myString1 = "This is a new String"; // This creates a NEW String object and assigns it to myString1. The original String object becomes eligible for garbage collection since no variable references it anymore.
        System.out.println(myString1);
        // If we try to change the characters within the String object directly, it will give an error.
        // myString1[0] = 'H'; // Error: java: array required, but java.lang.String found
        // Therefore, we cannot modify the content of a String object once it's created - this proves Strings are IMMUTABLE.
        // When we reassign the variable, we're not changing the original String object; we're creating a completely new one.
        // The variable can point to different String objects, but each individual String object cannot be modified.
        // We can use StringBuilder class to avoid creating multiple String objects when we need to modify string content frequently.


        //! Difference between 1st and 2nd : In the 1st, we are changing the value of the variable myString, but in the 2nd, we are just printing the value of the variable myString2.
        //!                                  Hence, in the 1st all statements are printing the updated value of the variable myString, but in the 2nd, all statements are printing the initial value plus string literals and not updating the value of the variable myString2.
        //!                   1st
        String myString = "This is a String";
        System.out.println("myString is equal to : " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to : " + myString);
        myString = myString + " \u00A9 2021";
        System.out.println("myString is equal to : " + myString);
        //!                   2nd
        String myString2 = "this is a string";
        System.out.println("myString is equal to : " + myString2);
        System.out.println("myString is equal to : " + myString2 + ", and this is more.");
        System.out.println("myString is equal to : " + myString2 + "\u00A9 2021");


        //? Concatenation of Strings with other data types
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is : " + numberString);
        int myInt = 50;
        String lastString = "10";
        lastString = lastString + myInt;
        System.out.println("LastString is equal to : " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value : " + lastString);
        boolean isTrue = true;
        lastString = lastString + isTrue;
        System.out.println("LastString value : " + lastString);
        lastString = lastString + " This is the end of the String";
        System.out.println("LastString value : " + lastString);
        char myChar = 'A';
        lastString = lastString + myChar;
        System.out.println("LastString value : " + lastString);
        char myChar2 = '\u00A9';
        lastString = lastString + myChar2;
        System.out.println("LastString value : " + lastString);
        char myChar3 = '\u00AE';
        lastString = lastString + myChar3;
        System.out.println("LastString value : " + lastString);

        //todo    Note Character concatenation is different from String concatenation
        //todo    In Character concatenation, the character is added to the ASCII value of the character, but in String concatenation, the character is added as a text to the String.

        char myChar4 = 'A';
        char myChar5 = 'B';
        System.out.println("The result is : "+ lastString + myChar4 + myChar5); //! The result is : AB
        System.out.println("The result is : " + lastString + (myChar4 + myChar5)); //! The result is : 131 (ASCII value of A + ASCII value of B) = 65 + 66 = 131
                                                                      //! here parenthesis is used to add the ASCII values of the characters and then concatenate it to the String.

    }
}
