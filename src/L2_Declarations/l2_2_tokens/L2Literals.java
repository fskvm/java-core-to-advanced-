package L2_Declarations.l2_2_tokens;

public class L2Literals {
    public static void main(String[] args) {
        //!                                  6) Literals
        //?            Literals are the constant values that are assigned to variables.

        //* Integer Literals (4 types)
        int a = 101; // Decimal , 101 is decimal literal so on for all other literals below.
        int b = 0101; // Octal
        int c = 0x101; // Hexadecimal
        int d = 0b101; // Binary

        //* Floating Point Literals
        float e = 101.0f; // float
        double f = 101.0e-24; // double

        //* Character Literals (4 types)
        char g = '?'; // 1) Using Single quote or single character

        char h = '\u0410'; // 2) Unicode representation

        // 3) char literals as Integer Literals
        // decimal
        char i = 2979;
        // octal
        char j = 055;
        // hexadecimal
        char k = 0x4A;

        // 4) Escape Sequences (8 types but used here, mostly used in string literals)
        char l = '\n'; // New Line
        char m = '\t'; // Tab
        char n = '\b'; // Backspace
        char o = '\r'; // Carriage Return
        char p = '\f'; // Form Feed
        char q = '\''; // Single Quote
        char r = '\"'; // Double Quote( we can use only double quotes char as it is " )
        char s = '\\'; // Backslash

        System.out.println("Integer Literals: " + a + ", " + b + ", " + c + ", " + d);
        System.out.println("Floating Point Literals: " + e + ", " + f);
        System.out.println("Character Literals: " + g + ", " + h + ", " + i + ", " + j + ", " + k);
        System.out.println("Escape Sequences: " + l + ", " + m + ", " + n + ", " + o + ", " + p + ", " + q + ", " + r + ", " + s);

        //* String Literals (2 types)

        // 1) Using Double Quotes

        String t = "Hello World!";
        System.out.println("String Literals: " + t);

        // 2) Using escape sequences in string literals

        // Newline and tab
        System.out.println("Hello,\nworld!\tThis is a tab.");

        // Backspace and carriage return
        System.out.println("Backspace: Hello\bworld!");
        System.out.println("Carriage return: Hello\rworld!");

        // Double and single quotes
        System.out.println("Double quote: \"Hello\"");
        System.out.println("Single quote: \'Hello\'"); // Single quote( we can use only single quotes char as it is ' )

        // Displaying a literal backslash
        System.out.println("Backslash: \\");

        // Form feed
        System.out.println("Form feed: Hello\fworld!");


        //* Boolean Literals

        boolean u = true;
        boolean v = false;
        System.out.println("Boolean Literals: " + u + ", " + v);


    }
}
