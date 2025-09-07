package L0_Rough_Codes;

public class Challenge {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myTotalValue = (myFirstValue + mySecondValue) * 100.00d; //? ( ) is important here to get the correct result i.e operator precedence
        System.out.println("myTotalValue = " + myTotalValue);
        double theRemainder = myTotalValue % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}