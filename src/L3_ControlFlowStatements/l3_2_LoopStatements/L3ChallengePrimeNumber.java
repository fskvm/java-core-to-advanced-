package L3_ControlFlowStatements.l3_2_LoopStatements;

public class L3ChallengePrimeNumber {
    public static void main(String[] args) {
        // Challenge: Prime Number within range -5 to 50 but break if we founded three prime numbers

        int count = 0;
// or   for (int i = 10; count == 3 && i <= 50; i++) { // this will also work but excluding if block, it is more readable if block
        for (int i = -5; i <= 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if (count == 3) {
                    System.out.println("Exiting the loop.");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2); // it will return true if wholeNumber is 2, otherwise false
        }

        //! error for(int divisor = 2; divisor <= wholeNumber; divisor++)   the loop will incorrectly check if wholeNumber is divisible by itself (which it always is), thus always returning false.
        // or   for(int divisor = 2; divisor <= wholeNumber / 2; divisor++)   More optimized
        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}


/*   Efficiency Impact:
First Loop: By only checking up to wholeNumber / 2, the number of iterations is halved, making the algorithm faster and more efficient. This optimization leverages the mathematical fact that any non-trivial divisor of a number will be less than or equal to half of that number.

Second Loop: This loop runs more checks, which means more computational effort is required, especially for larger numbers.

Prime Check Logic:
Prime Number: A prime number is a number greater than 1 that has no divisors other than 1 and itself. So, for a number to be prime, none of the numbers in the divisor range should divide the number completely (wholeNumber % divisor == 0).

Efficient Check: By limiting the checks to wholeNumber / 2, the first loop ensures that we quickly find any potential divisors and determine non-primality

For wholeNumber = 10:

First Loop: Checks divisors 2, 3, 4, 5 (because 10 / 2 = 5).

Second Loop: Checks divisors 2, 3, 4, 5, 6, 7, 8, 9.*/