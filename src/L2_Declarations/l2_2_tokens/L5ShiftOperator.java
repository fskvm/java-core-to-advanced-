package L2_Declarations.l2_2_tokens;

public class L5ShiftOperator {
    public static void main(String[] args) {

        //*    Shift Operators: Shift operators are used to shifts all bits towards left or right by a certain number of specified bits.
//        todo in most significance bit - 0 for positive number and 1 for negative number.i
//          if a number is positive we add 0 and if a number is negative we add 1 in most significant side, so as to fill the remaining spaces with 4-sets while shifting.


        //? 1. Signed Left Shift Operator: shifts all bits towards left by a certain number of specified bits.it is equivalent to multiplying the number by 2^n.
        //?                         Syntax: number << n (where n is the number of bits to be shifted) and  number << n = number * 2^n

        //?    a. Positive Number
        int a = 10; // 10 = 1010
        System.out.println("a << 2 : " + (a << 2)); // 1010 << 2
        // Process:  0000 1010 (According to System architecture zeros are added to the right side i.e most significant bits or leftmost bits. here to explain we take in 8 bits)
        //           0 010 1000 (After shifting 2 bits towards left)

        //           calculation by binary to decimal conversion : 2^3 + 2^5 = 8 + 32 = 40 ( 0*2^0 + 0*2^1 + 1*2^2 + 0*2^3 + 1*2^4 + 0*2^5 + 0*2^6 + 0*2^7)
        //           calculation by Formula : 10 * 2^2 = 10 * 4 = 40

        //! Most significant bits is used to represent the sign of the number. If it is 0 then the number is positive and if it is 1 then the number is negative.
        //! MSB side: To fill the remaining bits 0 is added to the left side if the number is positive and 1 is added to the left side if the number is negative.
        //! LSB side: To fill the remaining bits 0 is added to the right side always.

        //?    b. Negative Number
        int b = -10;
        System.out.println("b << 2 : " + (b << 2)); // -10 << 2
        // 1)Process : -10 << 2
        // To find the binary of negative number we have to find the binary of positive number and then take 2's complement of that number.
        //             0000 1010 (10)

        //                    1
        // 1's com   : 1111 0101 (inverting the bits)
        // 2's com   : +       1 (Adding 1 to the inverted bits) note while adding: 1 + 1 = 10 (0 carry 1), 0 + 1 = 1 ,1 + 0 = 1 ,0 + 0 = 0
        //            -----------
        //             1111 0110
        //             1111 0110 ( -10)

        // 2) Process: 1111 0110
        //             1 101 1000 (After shifting 2 bits towards left)

        // calculation by binary to decimal conversion : - 2^6 + 2^4 + 2^3 = -64 + 8 + 32 = -40 ( 1*2^0 + 0*2^1 + 0*2^2 + 1*2^3 + 0*2^4 + 1*2^5 + 1*2^6 + 0*2^7 and 2^0 = 1,2^1 = 2 etc)
        // calculation by Formula : -10 * 2^2 = -10 * 4 = -40

        //? 2. Signed Right Shift Operator: shifts all bits towards right by a certain number of specified bits.it is equivalent to dividing the number by 2^n.
        //?                          Syntax: number >> n (where n is the number of bits to be shifted) and  number >> n = number / 2^n

        //?    a. Positive Number
        int c = 17; // 17 = 10001
        System.out.println("c >> 2 : " + (c >> 2)); // 10001 >> 2
        // Process:  0001 0001
        //           0000 0100 (After shifting 2 bits towards right)

        // calculation by binary to decimal conversion : 2^2 = 4
        // calculation by Formula : 17 / 2^2 = 17 / 4 = 4

        //?    b. Negative Number
        int d = -17;
        System.out.println("d >> 2 : " + (d >> 2)); // -17 >> 2
        // 1)Process : -17 >> 2
        // To find the binary of negative number we have to find the binary of positive number and then take 2's complement of that number.
        //             0001 0001 (17)

        // 1's com   : 1110 1110 (inverting the bits)
        // 2's com   : +       1
        //            -----------
        //             1110 1111
        //             1110 1111 ( -17)

        // 2) Process: 1110 1111
        //             1 111 1011 (After shifting 2 bits towards right)

        // calculation by binary to decimal conversion : - 2^6 +  2^5 + 2^4 + 2^3 + 2^1 + 2^0 = -64 + 32 + 16 + 8 + 2 + 1 = -5
        // calculation by Formula : -17 / 2^2 = -17 / 4 = -5

        //? 3. Unsigned Right Shift Operator or Zero Fill Right Shift Operator: shifts all bits towards right by a certain number of specified bits. It always fills the leftmost bits with 0.
        //?                          Syntax: number >>> n (where n is the number of bits to be shifted) and  number >>> n = number / 2^n

        //?    a. Positive Number(same as signed right shift operator)
        int e = 17; // 17 = 10001
        System.out.println("e >>> 2 : " + (e >>> 2)); // 10001 >>> 2
        // Process:  0001 0001
        //           0000 0100 (After shifting 2 bits towards right)

        // calculation by binary to decimal conversion : 2^2 = 4
        // calculation by Formula : 17 / 2^2 = 17 / 4 = 4

        //?    b. Negative Number (Different from signed right shift operator as it fills the leftmost bits with 0)
        int f = -17;
        System.out.println("f >>> 2 : " + (f >>> 2)); // -17 >>> 2
        // 1)Process : -17 >>> 2

        // note: That it requires 32 bits to represent the negative number in binary form.
        //             0000 0000 0000 0000 0000 0000 0001 0001 (17)

        // 1's com   : 1111 1111 1111 1111 1111 1111 1110 1110 (inverting the bits)
        // 2's com   : +                                     1
        //            -----------------------------------------
        //             1111 1111 1111 1111 1111 1111 1110 1111

        // 2) Process: 1111 1111 1111 1111 1111 1111 1110 1111

        //            0 011 1111 1111 1111 1111 1111 1111 1011 (After shifting 2 bits towards right)
        //!            above two zero added to the left side to fill the remaining bits.

        // calculation by binary to decimal conversion : 2^30 + 2^29 + 2^28 + 2^27 + 2^26 + 2^25 + 2^24 +
        // 2^23 + 2^22 + 2^21 + 2^20 + 2^19 + 2^18 + 2^17 + 2^16 + 2^15 + 2^14 + 2^13 + 2^12 + 2^11 + 2^10 + 2^9 + 2^8 + 2^7 + 2^6 + 2^5 + 2^4 + 2^3 + 2^1 + 2^0 = 1073741823
        // calculation by Formula : NOT POSSIBLE TO CALCULATE

    }
}
