package L5_OOPconcept;

//todo     A Plain Old Java Object (POJO) is a simple Java class designed primarily to hold data. Its main purpose is to group instance fields(it can also hold static members
//         but try to avoid in pojo) into a single object, which can then be easily passed between different parts of an application. Think of it as a custom, "super" data type
//         you define yourself. Typically, a POJO has very few methods beyond the getters and setters required to access and modify its instance fields. Because of their
//         simplicity in representing data, frameworks often use POJOs to read from or write to databases, files, and streams.
// .
//   - Several related terms are often used interchangeably with POJO, though they sometimes have subtle differences:
//        JavaBean: A POJO that follows a stricter set of rules (e.g., must have a no-argument constructor, be serializable).
//                  These rules create a standard that allows Java frameworks to inspect and manage the objects automatically.
//        Entity: This term is common when a POJO directly mirrors a table in a database. Each instance of the POJO corresponds to a row in the entity's table.
//        Data Transfer Object (DTO): A name that emphasizes the role of the object: to transfer data between processes or layers of an application.

//!  The code for constructors, getters, setters, and toString() is highly repetitive and follows a predictable pattern. Recognizing this, The Java introduced a new,
//!  more concise type called a Record. Officially added in JDK 16, a record provides a compact syntax for creating immutable data-carrier classes, automatically
//!  generating the constructor, field accessors, toString(), equals(), and hashCode() methods for you, drastically reducing boilerplate.

public class L9Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public L9Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override       //todo   The toString() method is a special method you add to a Java class to provide a clear, text description of an object's current state.
    public String toString() {
        return "L9Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

}


