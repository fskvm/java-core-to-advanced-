package L4_MethodsRelatedConcepts;

public class L4StimulateDefaults {
    public static void main(String[] args) {
//*        Method Overloading to Simulate Default Parameters as Java does not support default parameters.
        makeTea("Green");               // milk=false, sugar=true
        makeTea("Masala", true);        // milk=true, sugar=true
        makeTea("Black", false, false); // milk=false, sugar=false
    }

    public static void makeTea(String type, boolean milk, boolean sugar) {
        System.out.println("Making " + type + " tea with milk: " + milk + ", sugar: " + sugar);
    }

    public static void makeTea(String type, boolean milk) {
        makeTea(type, milk, true); //? here true acts as default parameter.
    }

    public static void makeTea(String type) {
        makeTea(type, false, true); //? here false and true acts as default parameters.
    }
}
