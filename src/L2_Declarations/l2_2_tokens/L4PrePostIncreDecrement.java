package L2_Declarations.l2_2_tokens;

public class L4PrePostIncreDecrement {
    public static void main(String[] args) {

        //*  Increment and Decrement Operators: used to increase or decrease the value of a variable by 1.

        int a = 10;
        int b = 0;
        b = a++; // post-increment i.e assign the value of a to b and then increment a by 1
        System.out.println("a = " + a + " b = " + b);

        int c = 10;
        int d = 0;
        d = ++c; // pre-increment i.e increment c by 1 and then assign the value of c to d
        System.out.println("c = " + c + " d = " + d);

        int e = 10;
        int f = 0;
        f = e--; // post-decrement i.e assign the value of e to f and then decrement e by 1
        System.out.println("e = " + e + " f = " + f);

        int g = 10;
        int h = 0;
        h = --g; // pre-decrement i.e decrement g by 1 and then assign the value of g to h
        System.out.println("g = " + g + " h = " + h);

    }
}
