package L4_MethodsRelatedConcepts;

public class L5OverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("68 inches : " + convertToCentimeters(68) + " centimeters");
        System.out.println("5 feet 8 inches : " + convertToCentimeters(5, 8) + " centimeters");
    }

    public static double convertToCentimeters(int inches) {
        return (inches * 2.54);
    }
    public static double convertToCentimeters(int feet, int inches) {
//! or     return ((feet * 12 * 2.54) + (inches * 2.54));
//! or     return convertToCentimeters((feet * 12) + inches);

        //todo Best Approach
        // More readable solution using intermediate variables
        // These variables are automatically deallocated when the method completes so there is no impact on memory usage.

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return convertToCentimeters(totalInches);
    }
}
