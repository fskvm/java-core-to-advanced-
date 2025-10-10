package L5_OOPconcept;

public class L6Ref_Obj_Inst_Cls {
    public static void main(String[] args) {

//todo  Unreferenced Objects and Garbage Collection
        new L6House("red");
        /*
         * If an object is created without being assigned to a reference, it
         * becomes immediately inaccessible to the code.
         *
         * e.g., new L6House("green");
         *
         * That "green" L6House object exists in memory but is useless because
         * we have no way to refer to it. It is immediately "eligible for
         * garbage collection".
         *
         * Java's automatic Garbage Collector (GC) is a process that runs in
         * the background, finds these unreferenced objects, and removes them
         * to free up memory.
         *
         * While there are rare cases where you might create an object just to
         * call a single method on it, 99% of the time you will want to assign
         * a new object to a reference variable to use it later.
         *
         */

        L6House blueHouse = new L6House("blue"); //? L6House object is created and assigned it's location(reference) to blueHouse
        L6House anotherHouse = blueHouse; //? Copying the reference, not the object itself

        System.out.println(blueHouse.getColor()); // prints blue
        System.out.println(anotherHouse.getColor());// blue

        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor()); // red
        System.out.println(anotherHouse.getColor());// red

        L6House greenHouse = new L6House("green");
        anotherHouse = greenHouse; //! Dereferencing the old object and referencing a new object

        System.out.println(blueHouse.getColor()); //red
        System.out.println(greenHouse.getColor());// green
        System.out.println(anotherHouse.getColor());// green
    }
}
