package L5_OOPconcept;

import java.util.Objects;

public class L10Fish extends L10Animal {
    private int gills;
    private int fins;

    public L10Fish(String type, double weight, int gills, int fins) {
        super(type,"small", weight);
        this.gills = gills;
        this.fins= fins;
    }

    private void moveMuscles() {
        System.out.print("muscles moving ");
    }
    private void moveBackFins() {
        System.out.print("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(Objects.equals(speed, "fast")) {
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "L10Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}

//*  Types of Inheritance(Mainly 3 types and Multiple inheritance is supported via Interfaces)
/*
 * --------------------------------------------------------------------
 * ## 1. Single Inheritance ##
 * --------------------------------------------------------------------
 *
 * Description: One subclass inherits from exactly one superclass. This
 * is the simplest and most fundamental form of inheritance in Java.
 *
 * - Diagram:
 *
 * +-----------+
 * |  Animal   |  (Superclass)
 * +-----------+
 * ^
 * | (extends)
 * |
 * +-----------+
 * |    Dog    |  (Subclass)
 * +-----------+
 *
 *
 * - Syntax Example:
 *
 * // Superclass
 * class Animal {
 * // methods and fields
 * }
 *
 * // Subclass
 * class Dog extends Animal {
 * // methods and fields
 * }
 *
 */

/*
 * --------------------------------------------------------------------
 * ## 2. Multilevel Inheritance ##
 * --------------------------------------------------------------------
 *
 * Description: A class inherits from a superclass, which itself is a
 * subclass of another class. This forms an inheritance chain.
 *
 * - Diagram:
 *
 * +-----------+
 * |  Animal   |  (Grandparent)
 * +-----------+
 * ^
 * | (extends)
 * |
 * +-----------+
 * |    Dog    |  (Parent)
 * +-----------+
 * ^
 * | (extends)
 * |
 * +-----------+
 * |   Puppy   |  (Child)
 * +-----------+
 *
 *
 * - Syntax Example:
 *
 * // Grandparent class
 * class Animal {
 * // ...
 * }
 *
 * // Parent class
 * class Dog extends Animal {
 * // ...
 * }
 *
 * // Child class
 * class Puppy extends Dog {
 * // ...
 * }
 *
 */

/*
 * --------------------------------------------------------------------
 * ## 3. Hierarchical Inheritance ##
 * --------------------------------------------------------------------
 *
 * Description: Multiple subclasses inherit from a single, common
 * superclass.
 *
 * - Diagram:
 *
 * +-----------+
 * |  Animal   | (Superclass)
 * +-----------+
 * |           |
 * +-----------+
 * | (extends) | (extends)
 * v           v
 * +-----------+ +-----------+
 * |    Dog    | |    Cat    | (Subclasses)
 * +-----------+ +-----------+
 *
 *
 * - Syntax Example:
 *
 * // Superclass
 * class Animal {
 * // ...
 * }
 *
 * // Subclass 1
 * class Dog extends Animal {
 * // ...
 * }
 *
 * // Subclass 2
 * class Cat extends Animal {
 * // ...
 * }
 *
 */

/*
 * --------------------------------------------------------------------
 * ## Multiple Inheritance (Not Supported via Classes) ##
 * --------------------------------------------------------------------
 *
 * Description: A single subclass attempts to inherit from multiple
 * superclasses. This is NOT allowed for classes in Java to prevent
 * the "Diamond Problem" ambiguity.
 *
 * - Diagram:
 *
 * +-----------+   +-----------+
 * |   Swimmer |   |  Mammal   | (Superclasses)
 * +-----------+   +-----------+
 * ^           ^
 * | (extends) | (extends)
 * +-----------+
 * |
 * +-----------+
 * |  Dolphin  | (Subclass)  --> ILLEGAL SYNTAX
 * +-----------+
 *
 */
 /*
 *  NOTE: Java achieves multiple inheritance of type through Interfaces.
 *  A class can "implement" multiple interfaces.
 */