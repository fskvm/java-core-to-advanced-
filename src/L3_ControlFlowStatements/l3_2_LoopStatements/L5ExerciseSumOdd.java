package L3_ControlFlowStatements.l3_2_LoopStatements;

public class L5ExerciseSumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100)); // 2500
        System.out.println(sumOdd(-1, 100)); // -1
        System.out.println(sumOdd(100, 100)); // 0
        System.out.println(sumOdd(13, 13)); // 13
        System.out.println(sumOdd(100, -100)); // -1

    }
        public static boolean isOdd ( int number){
            return number > 0 && number % 2 != 0;
        }

        public static int sumOdd ( int start, int end){

            if (start < 0 || end < 0 || end < start) {
                return -1;
            }

            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }



