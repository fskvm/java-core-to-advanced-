package L2_Declarations.l2_1_varDatatypes;

public class WrapperClassPart1 {
    // Wrapper class is a class whose object wraps or contains primitive data types.There are basically two types
    // 1) Autoboxing: The automatic conversion of a primitive data type into its corresponding wrapper class is known as autoboxing.
    // 2) Unboxing: The automatic conversion of a wrapper class object into a primitive data type is known as unboxing.
    public static void main(String[] args) {
        //? byte data type
        byte a = 1;

        // wrapping around a Byte object

        //todo_First method of wrapping below works with Java 8 not above
        //! Byte byteObj = new Byte(a); works with Java 8

        //todo_Second method of wrapping below works with Java 9 and above
        /* in most cases, you can simply rely on autoboxing (`Float floatObj = 18.6f;`) which is more concise and equally efficient
           since the compiler automatically calls `valueOf()` behind the scenes.
         */
        Byte byteObj = Byte.valueOf(a);
        //! Or
//      Byte byteObj = a; //todo_Mostly used third method of wrapping

        //? int data type
        int b = 10;

        // wrapping around Integer object
        //! Integer intObj = new Integer(b);
        // Use with Java 9
        Integer intObj = b;

        //? float data type

        // wrapping around a Float object
        //! Float floatObj = new Float(c);
        // Use with Java 9
        Float floatObj = 18.6f;

        //? double data type
        double d = 250.5;

        // Wrapping around Double object
        //! Double doubleObj = new Double(d);
        // Use with Java 9
        Double doubleObj = d;

        //? char data type
        char e = 'a';

        // wrapping around a Character object
        Character charObj = e;

        // printing the values from objects
        System.out.println(
                "Values of Wrapper objects (printing as objects)");
        System.out.println("\nByte object byteObj: "
                + byteObj);
        System.out.println("\nInteger object intObj: "
                + intObj);
        System.out.println("\nFloat object floatObj: "
                + floatObj);
        System.out.println("\nDouble object doubleObj: "
                + doubleObj);
        System.out.println("\nCharacter object charObj: "
                + charObj);

        // objects to data types (retrieving data types from
        // objects) unwrapping objects to primitive data
        // types
        byte bv = byteObj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;

        // printing the values from data types
        System.out.println(
                "\nUnwrapped values (printing as data types)");
        System.out.println("\nbyte value, bv: " + bv);
        System.out.println("\nint value, iv: " + iv);
        System.out.println("\nfloat value, fv: " + fv);
        System.out.println("\ndouble value, dv: " + dv);
        System.out.println("\nchar value, cv: " + cv);
    }

}
