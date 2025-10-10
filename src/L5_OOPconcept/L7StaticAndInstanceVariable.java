package L5_OOPconcept;

public class L7StaticAndInstanceVariable {
    /*
    A static variable(or class variable) belongs to the class itself, not to any individual object. This means there's only one copy of the variable,
    and it's shared among all instances of that class. If one object changes the static variable's value, all other objects will see that change because they are tied to the class
    They are useful for constants (like PI), counters, or managing a shared resource like a database connection.

    An instance variable (or field) belongs to a specific object. Each time a new object is created, it gets its own separate copy of all instance variables.
    This allows every object to have its own unique state. For example, if a Dog class has an instance variable for name, each Dog object can have a different name ("Rex", "Fluffy").
    This is the most common type of variable, used to define the properties and state of an object.
     */
    public static void main(String[] args) {

//!     An instance or object isn't required to create or exist to access the value of a static variable
        System.out.println("breed = " + Dog.breed);

        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.printName();                 // prints fluffy
        fluffy.printName();              // prints fluffy

        Dog2 rex1 = new Dog2("rex");
        Dog2 fluffy2 = new Dog2("fluffy");
        rex1.printName();                 // prints rex
        fluffy2.printName();              // prints fluffy
    }


}
class Dog {

    private static String name;
    static String breed = "Mixed";

    public Dog(String name) {
//!     It is considered best practice to use the Class name and not a reference variable to access a static variable (Class.variableName rather than this.variableName)
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name = " + name); //! Using Dog.name would have made this code less confusing.
    }
}

class Dog2 {

    private String name;

    public Dog2(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}
