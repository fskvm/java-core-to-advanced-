package L5_OOPconcept;

public class L10_Inheritance {
    public static void main(String[] args) {

        L10Animal animal = new L10Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        L10Dog dog = new L10Dog();
        doAnimalStuff(dog, "fast");

        L10Dog yorkie = new L10Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        L10Dog retriever = new L10Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        L10Dog wolf = new L10Dog("wolf", 40);
        doAnimalStuff(wolf, "slow");

        L10Fish goldie = new L10Fish("Goldfish", 0.25, 2, 3); //! This is called polymorphism. I passed fish to a method that never even had to know a fish class existed that is a subclass of animal.
        doAnimalStuff(goldie, "fast");

        /*
        Polymorphism makes our code
        1.Simpler Code:
                You can write general methods that operate on a superclass type, without needing to know anything about its specific subclasses.
                This eliminates messy code that checks an object's type to decide which method to call, because Java automatically figures out the correct method to execute at runtime.

        2.Easier Extensibility:
                Your code becomes highly extensible because new subclasses can be added at any time. These new classes, with their own unique method behaviors, will seamlessly work with
                the existing code written for the superclass, requiring no modifications.
         */

    }


    public static void doAnimalStuff(L10Animal animal, String speed){

//?  All subclasses can execute methods even though the code is declared on the parent class - though it is coded for the parent class only, but it will work for all subclasses(because they inherit from the parent class)
        animal.makeNoise();
        animal.move(speed);
        System.out.println();
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}

//todo Inheritance is a fundamental concept in programming that allows one class (the child/subclass/derived) to receive—or inherit—the attributes and methods from
//     another class (the parent/superclass/base).
//     - Main Goal: Its primary purpose is code reuse. You write common code once in a parent class, and multiple child classes can use it without rewriting it.
//     - The "is-a" Relationship: Inheritance creates an "is-a" relationship. For example, a Dog is an Animal. This relationship is key to understanding how inherited objects can be used interchangeably.
