package L5_OOPconcept;

public class L8StaticAndInstanceMethod {
    /*
        A static method belongs to the class itself, not to a specific object. It's declared with the static keyword and is typically used for utility(use by everyone) functions that don't rely on an object's state.
        Because of this, a static method cannot access instance members directly but can access static members, and it cannot use this keyword.
        You call a static method using the class name (e.g., ClassName.methodName()) or  or You call a static method from another method within the same class, you don't need to specify the class name(methodName()).

        The fundamental reason you don't create an object for a static method is that static methods belong to the class, not to any individual object.

        An instance method belongs to a specific instance (object) of a class. An instance method's main purpose is to interact with the object's state,
        so it can directly access both instance members and static members of class.
        To call it, you must first create an object using the new keyword.

        Deciding Which Method to Use
        Ask yourself: "Does this method need to access any instance variables (fields) or other instance methods?"
          If YES, make it an instance method.
          If NO, it should probably be a static method.
     */
    public static void main(String[] args) {

        Calculator.printSum(5, 10);
        printHello(); //! shorter form of L8StaticAndInstanceMethod.printHello(); if both are in same class
        Dogg rex = new Dogg();
        rex.bark();
    }
    public static void printHello() {
        System.out.println("Hello");
    }
}

class Calculator {
    public static void printSum(int a, int b) {
        System.out.println("sum= " + (a + b));
    }
}
class Dogg {
    public void bark() {
        System.out.println("woof");
    }
}
