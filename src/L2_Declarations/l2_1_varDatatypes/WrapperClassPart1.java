package L2_Declarations.l2_1_varDatatypes;

public class WrapperClassPart1 {
    // Wrapper class is a class whose object wraps or contains primitive data types.There are basically two types
    // 1) Autoboxing : The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing.
    // 2) Unboxing : The automatic conversion of wrapper class object into primitive data type is known as unboxing.
            public static void main(String[] args)
            {
                //? byte data type
                byte a = 1;

                // wrapping around Byte object

                //todo_First method of wrapping below works with Java 8 not above
                //! Byte byteobj = new Byte(a); works with Java 8

                //todo_Second method of wrapping below works with Java 9 and above
                Byte byteobj = Byte.valueOf(a);

                //? int data type
                int b = 10;

                // wrapping around Integer object
                //! Integer intobj = new Integer(b);
                // Use with Java 9
                Integer intobj = Integer.valueOf(b);

                //? float data type

                // wrapping around Float object
                //! Float floatobj = new Float(c);
                // Use with Java 9
                Float floatobj = Float.valueOf(18.6f);

                //? double data type
                double d = 250.5;

                // Wrapping around Double object
                //! Double doubleobj = new Double(d);
                // Use with Java 9
                Double doubleobj = Double.valueOf(d);

                //? char data type
                char e = 'a';

                // wrapping around Character object
                Character charobj = e;  //todo_Not mostly used third method of wrapping

                // printing the values from objects
                System.out.println(
                        "Values of Wrapper objects (printing as objects)");
                System.out.println("\nByte object byteobj: "
                        + byteobj);
                System.out.println("\nInteger object intobj: "
                        + intobj);
                System.out.println("\nFloat object floatobj: "
                        + floatobj);
                System.out.println("\nDouble object doubleobj: "
                        + doubleobj);
                System.out.println("\nCharacter object charobj: "
                        + charobj);

                // objects to data types (retrieving data types from
                // objects) unwrapping objects to primitive data
                // types
                byte bv = byteobj;
                int iv = intobj;
                float fv = floatobj;
                double dv = doubleobj;
                char cv = charobj;

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
