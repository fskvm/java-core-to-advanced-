package L3_ControlFlowStatements.l3_2_LoopStatements;

public class L8ChallengeDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of digits in number 125 is " + sumDigits(1234));
        System.out.println("Sum of digits in number -125 is " + sumDigits(-12));
        System.out.println("Sum of digits in number 4 is " + sumDigits(4));
        System.out.println("Sum of digits in number 32123 is " + sumDigits(32123));

    }

    public static int sumDigits(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;
//        while (number > 0) {
//?                        extract the least-significant(Right most) digit i.e           num % 10
//            int digit = number % 10;
//            sum += digit;
//?                       drop the least-significant digit i.e          num / 10
//            number /= 10;
//        }

        while (number > 0) {
            sum += number % 10;             //?  10 ) 4 ( 0
            number /= 10;                   //?       0
        }                                   //?      ----
                                            //?       4
        return sum;
    }
}
