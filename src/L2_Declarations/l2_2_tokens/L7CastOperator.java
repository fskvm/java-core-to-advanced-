package L2_Declarations.l2_2_tokens;

public class L7CastOperator {
    public static void main(String[] args) {

        //* Type casting operator : is used to convert a value of one data type to another.
        //* Type casting is of two types:

        //? 1. Widening casting or Down Casting or Implicit Type Casting : The Lower data type is transformed into a higher one by a process known as widening type casting.
        //?                                                                It occurs automatically. Since there is no chance of data loss, it is secure.
        //?                                                                Widening Type casting occurs when:
        //?                                                                1.The target type must be larger than the source type.
        //?                                                                2.Both data types must be compatible with each other (boolean and char are not allowed in type casting)
        int i = 10;

        // from int to long
        long l = i;

        // from int to double
        double d = i;

        System.out.println("Integer :" + i);
        System.out.println("Long :" + l);
        System.out.println("Double :" + d);


        //? 2. Narrowing casting or Up Casting or Explicit Type Casting  : The process of downsizing a bigger data type into a smaller one is known as narrowing type casting.
        // ?                                                               It doesn’t just happen by itself. If we don’t explicitly do that, a compile-time error will occur.
        // ?                                                               Narrowing type casting is unsafe because data loss might happen due to the lower data type have Smaller range as compared to Bigger data type.
        double a = 100.245;

        // Narrowing Type Casting
        short j = (short) a;
        int k = (int) a;

        System.out.println("Original Value before Casting :"
                + a);
        System.out.println("After Type Casting to short :"
                + j);
        System.out.println("After Type Casting to int :"
                + k);

        //todo  SPECIAL CASE : Explicit type Casting

        int BigIntLiteralValue = 2_147_483_647;
        byte BigByteLiteralValue = 127;
        short BigShortLiteralValue = 32767;
        long BigLongLiteralValue = 9223372036854775807L;

        int myNewIntValue = (BigIntLiteralValue / 2); // ? by Default an expression or calculation is treated as int datatype

        //*  byte myNewByteValue = ( 127 / 2);  Won't throw error , If your calculation or expression uses Literal values, Java can figure out the end result at compile time, and weather it fits into the variable, and won't throw an error if it does.
        //*                                     This statement works, because the result of (127 / 2) is an int, but when calculations use only literal values, the compiler can determine the result immediately, and knows the value fits into a byte.

        //!  byte myNewByteValue = (myByteLiteralValue / 2); Throws Error here , Java compiler does not attempt to evaluate the value in a "Variable", When it is used in a 'calculation or expression'.
        //!                                                 so it doesn't know if the value fits and throws an error. To solve this explicit type casting is done below
        byte myNewByteValue = (byte) (BigByteLiteralValue / 2);

        //!  short myNewShortValue = (BigShortLiteralValue / 2); Same Throws Error , another way to explain is that, The expression (myMinShortValue / 2) is an int and an int can't be assigned to a short, because the compiler won't guess the result.
        short myNewShortValue = (short) (BigShortLiteralValue / 2);

        long myNewLongValue2 = (BigLongLiteralValue / 2); //?  here expression is by default int type, Output of the expression can be easily stored in long data type with range of 9223372036854775807

        System.out.println(myNewIntValue);
        System.out.println(myNewByteValue);
        System.out.println(myNewShortValue);
        System.out.println(myNewLongValue2);

        //?  Types of Explicit Casting

        //?      a) Explicit Up casting.
        //?      b) Explicit Down casting.

        /* Don't remember it !
        Explicit Up casting
                         Upcasting is the process of casting a subtype to a supertype in the inheritance tree’s upward direction.
                         When a sub-class object is referenced by a superclass reference variable, an automatic process is triggered
                         without any further effort.

        Explicit Down casting
                         When a subclass type refers to an object of the parent class, the process is referred to as downcasting.
                         If it is done manually, the compiler issues a runtime ClassCastException error. It can only be done by using
                         the instanceof operator. Only the downcast of an object that has already been upcast is possible.
         */
    }
}
