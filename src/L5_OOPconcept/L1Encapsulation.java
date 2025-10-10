package L5_OOPconcept;

public class L1Encapsulation {
    public static void main(String[] args) {

//?     L1Car car;  // an uninitialized reference variable causes a compile error if we try to use it
//?     L1Car car = null;  // a reference variable that is explicitly set to null causes a runtime NullPointerException if we try to use it
//*     Bottom line is that we must always initialize reference variables with new keyword, name of class and parentheses to create a new object before we can use them
//!     For Primitive Variables: we use a primitive data type keyword (int, double, boolean, etc.). The variable directly holds a simple value
//!     For Reference Variables: we use a class name (like Car, String, or Scanner) as the type. The variable holds a reference (a memory address) to an object.

        L1Car car = new L1Car();


//!       since private fields we can't use dot notation to access them (but valid for public, protected, default).
//        car.make = "Porsche";
//        car.model = "Carrera";
//        System.out.println("make = " + car.make);
//        System.out.println("model = " + car.model);
//?     Using setter methods to modify private fields
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

//?     Using getter methods to access private fields
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describe();
        
        L1Car targa = new L1Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(4);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describe();

        //?  But this way to assign data to private fields is not recommended.
        //?  Instead, we can use the constructor to assign data to private fields. We see in future videos..
    }
}


//TODO    INTERVIEW DEFINE
//   [ Class ]
//    A class is a blueprint or template that defines the structure and behavior of objects. It specifies:
//            - Attributes (data/properties) that objects will have
//            - Methods(functions/behaviors) that objects can perform
// .
//    Think of it as a cookie cutter - it defines the shape, but isn't the actual cookie.
//    [ Object ]
//    An object is a concrete instance of a class. It's a real entity in memory that:
//            - Has actual values for the attributes defined in its class
//            - Can invoke the methods defined in its class
//            - Maintains its own state independently from other objects of the same class
// .
//    It's the actual cookie made from the cookie cutter.
//    [ Polymorphism ]
//            Polymorphism means "many forms" - it's the ability of different objects to respond to the same interface in their own specific way. It allows:
//            - The same method call to behave differently depending on the object type
//            - Writing code that works with multiple types without knowing their specific implementation
//            - Runtime determination of which method implementation to use
// .
//    Like asking different animals to "make a sound" - each responds appropriately (dog barks, cat meows, cow moos).
//    [ Inheritance]
//            Inheritance is a mechanism where a new class (child/derived/subclass) acquires properties and behaviors from an existing class (parent/base/superclass). It enables:
//            - Code reuse by extending existing functionality
//            - Hierarchical relationships between classes
//            - Specialization where child classes add or modify parent behavior
//            - "Is-a" relationships (e.g., Car is-a Vehicle)
// .
//    Like a child inheriting traits from parents, but also developing their own unique characteristics.
//    [ Encapsulation ]
//            Encapsulation is the bundling of data and methods together while controlling access to them. It provides:
//            - Data hiding by making internal details private
//            - Controlled access through public interfaces (getters/setters)
//            - Protection of object integrity by preventing unauthorized modification
//            - Implementation hiding - users don't need to know internal workings
// .
//    Like a capsule that contains medicine - you can use it without knowing its internal composition.
//    [ Abstraction ]
//            Abstraction is the process of hiding complex implementation details while showing only essential features. It involves:
//            - Simplifying complexity by focusing on what an object does, not how
//            - Creating models that represent real-world entities in simplified form
//            - Defining contracts through interfaces without specifying implementation
//            - Reducing cognitive load by providing clear, simple interfaces
// .
//    Like driving a car - you use the steering wheel and pedals without needing to understand the engine mechanics.

//todo    The class as the blueprint
//            The class describes the data (fields), and the behavior (methods), that are relevant to the real-world object we want to describe.
//            These are called class members.
//    Class -
//    Instance Members   |    Static Members
//    Fields | Methods   |    Fields | Methods
//    A class member can be a field or a method, or some other type of dependent element(Nested class, Constructor, Nested interface, Nested enums, Initializer block).

//todo    Static vs Instance Fields and Methods
// Instance Field (don't use static keyword)
//            • Belongs to an individual object.
//            • Each object has its own copy and can store a different value.
// Static Field
//            • Belongs to the class, not any specific object.
//            • Shared across all objects.
// Instance Method (don't use static keyword)
//            • Can access instance fields because it operates on a specific object.
//            • Follows the key rule: if a method needs to work with instance fields, it must be non-static.
// 	Static Method
//            • Belongs to the class, not any specific object.
//            • Cannot access instance fields directly because it doesn’t operate on a specific object.


//todo    Organizing Classes in Java with Packages
// 	Packages are used to group related classes logically.
//  You declare a package using the  statement at the top of your class file.
//  If no package is declared, the class automatically belongs to the default package.

//todo    Access modifiers for the class
//    A class may be a top-level class if it is defined in the source code file and not enclosed in the body of another class, type, or method.
//    .
//    Top-level classes only have two valid access modifier options: public or none (NOT private or protected).
//    1) public - public means any other class in any package can access this class.
//    2) default - When the modifier is omitted, this has special meaning, called package access, meaning the class is accessible only to classes in the same package.
//    .
//    It can contain multiple top-level classes, but with restrictions:
//    Only one top-level class can be public, and its name must match the filename and other top-level classes in the same file must use default.
//    .
//    Inner class or Nested class can have all four type of access modifier: public, none, private, protected.


//todo    Access modifiers for class members
//        An access modifier at the member level allows granular control over class members.
//        The valid access modifiers are shown in this table from the least restrictive to the most restrictive.
// .
//    Access keyword    |             Description
//    public	           public means any other class in any package can access this members.
//    protected	           protected allows classes in the same package, and any subclasses in other packages, to have access to the member.
//    (omitted)	           When the modifier is omitted, this has special meaning, called 'package access', meaning the member is accessible only to classes in the same package.
//    private	           private means that no other class can access this member.
//    .
//      +-----------------+--------------+----------------+------------------------------------+-----------------+
//      | Access Modifier | within class | within package | outside package by subclass only | outside package |
//      +-----------------+--------------+----------------+------------------------------------+-----------------+
//      | Private         |      Y       |        N       |                 N                  |        N        |
//      +-----------------+--------------+----------------+------------------------------------+-----------------+
//      | Default         |      Y       |        Y       |                 N                  |        N        |
//      +-----------------+--------------+----------------+------------------------------------+-----------------+
//      | Protected       |      Y       |        Y       |                 Y                  |        N        |
//      +-----------------+--------------+----------------+------------------------------------+-----------------+
//      | Public          |      Y       |        Y       |                 Y                  |        Y        |
//      +-----------------+--------------+----------------+------------------------------------+-----------------+
//!    Static and Instance: The "How" - "How does this exist in memory?"
//!    Access Modifiers: The "Who" -  "Who has permission to see or use this?"
