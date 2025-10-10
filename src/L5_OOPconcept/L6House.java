package L5_OOPconcept;

public class L6House {
    /*
     * Class vs. Object vs. Instance vs. Reference
     *
     * - Class: A blueprint or template for creating objects (e.g., the architectural plan for a house).
     *
     * - Object / Instance: A concrete entity created from a class. These terms are used interchangeably.
     * An object is an "instance of" a class (e.g., an actual house built from the plans).
     *
     * - Reference: A variable that holds the memory address of an object. It's how we access the object.
     * (e.g., a piece of paper with the house's address).
     *
     * Key takeaway: Copying a reference variable does NOT copy the object itself; it only copies the
     * address. This means multiple references can point to the very same object.
     */

    private String color;

    public L6House(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
