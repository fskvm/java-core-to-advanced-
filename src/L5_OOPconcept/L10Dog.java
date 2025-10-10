package L5_OOPconcept;

//todo    super() - This is a special call made from within a child class's constructor to invoke a constructor from its parent class.
//        1) Crucial Rule: The call to super() must be the very first statement inside a child's constructor.
//        2) When It's Mandatory: If the parent class (Animal) has a constructor that requires arguments, and it does not have a default no-argument constructor,
//           then every child class (Dog) must explicitly call super() with the required arguments.
//! To establish an inheritance relationship in Java, you use the extends keyword in the child class's declaration. This specifies which class it is inheriting from.
//!  A class in Java can only extend one parent class.


import java.util.Objects;

public class L10Dog extends L10Animal {

    private String earShape;
    private String tailShape;

    public L10Dog() {
//      super();  //either one of the following or below
        super("Mutt", "Big", 50);
//!        By default, if you don't write a constructor, Java secretly adds one for you that calls the parent's empty, no-argument constructor.
//todo    What Java tries to do for you	   Why it fails in this case	                                                       What you must do instead or (create a default constructor to L10Animal class)
//        public Dog() {                   The Animal class has no empty Animal() constructor to call.                          public Dog() {
//            super();                     It only has Animal(type, size, weight). This causes a compiler error.                 super("Mutt", "big", 50);
//        }	                                                                                                                  }
    }

    public L10Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public L10Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : weight < 35 ? "medium" : "large", weight); //! A technique to calculate a value for a parent class constructor by embedding the logic directly within the super() call's arguments as super should be the first statement in the constructor(before it we can perform any other logic).
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "L10Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }


//! Overriding a method is when you create a method on a subclass, which has the same signature as a method on a super class. You override a parent class method when you want the child class to show different behavior for that method.
//todo An overridden method in a subclass can perform one of three actions:
//       1) Replace: It can provide a completely new implementation, effectively replacing the superclass's original logic.
//       2) Extend: It can call the superclass's method using super and then add its own code before or after that call, augmenting the original behavior.
//       3) Invoke (this is default created by java code generate) : It can simply call the superclass's method using super with no additional code. This is functionally redundant, as it offers no change from the original inherited behavior.
//                                                                   As for the case where an override only contains super.methodName(), it's rarely kept in final code but can be useful during development for:
//                                                            i) Debugging ️: Placing a breakpoint in the override to see exactly when and how the method is being called without changing its behavior.
//                                                            ii)Placeholders: A programmer might create the override as a reminder to add custom logic there later.
//                                                            iii)Annotations: To apply a specific annotation to the subclass's method without altering the parent's logic.
    public void makeNoise(){
        if(Objects.equals(type, "wolf")) {
            System.out.print("Ow Wooooo! ");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.print(this.getType() + " walk, run and wag their tails");
        if(Objects.equals(speed, "slow")) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.print("Woof! ");
    }
    private void run() {
        System.out.print("Running ");
    }
    private void walk() {
        System.out.print("Walking ");
    }
    private void wagTail() {
        System.out.print("Tail Wagging ");
    }
}

