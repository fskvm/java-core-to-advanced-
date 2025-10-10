package L5_OOPconcept;

//? This single line can replace a 40-line POJO class:
public record L9LPAStudent(String id, String name, String dateOfBirth, String classList) {
//?    This single line tells the compiler to do, The section in the parentheses is called the record header, and the parameters within it are the record components
//?     For each component you declare, Java automatically generates

//?    - A private final field: The final keyword ensures the field cannot be modified after the object is created, enforcing immutability
//?    - A public accessor method(getters): This method has the same name as the field (e.g., id(), not getId())
//?    - A constructor that takes all the components as arguments to initialize the fields
//?    - An implementation of toString() that prints the components in a clean, formatted way
//?    - Proper implementations of equals() and hashCode(), allowing records to work correctly in collections like HashMaps and HashSets

}



//todo  A record is a special, concise type of class designed to be a "plain data carrier."
//      Its primary goal is immutability — it creates objects whose data is not meant to be altered after creation. Best of all, the compiler generates all the
//      fundamental methods for you, eliminating the boilerplate.