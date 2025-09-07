package L2_Declarations.l2_1_varDatatypes;

public class L2TypesOfDeclarationOfVar {
    public static void main(String[] args) {

        // 1) We can declare a variable and then assign a value later to it.
        int var0;
        var0 = 5;
        System.out.println(var0);

        // 2) We can declare and assign a value to a variable in the same line.
        byte var1 = 5;
        int var2 = var1 * 10;
        byte var3 = 15;
        int var4 = var1 + var2 - var3;
        System.out.println(var4);
        int var5 = 1000 - var4;
        System.out.println(var5);

        // 3) We can declare multiple variables of the same type in a single line and then assign value later.
        int var6, var7, var8;
        var6 = 10;
        var7 = 20;
        var8 = 30;
        System.out.println(var6 + var7 + var8);

        // 4) We can declare and assign a value to each variable in a single line of the same type.
        int var9 = 10, var10 = 20, var11 = 30;
        System.out.println(var9 + var10 + var11);
    }
}
