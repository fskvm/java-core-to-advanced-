package L5_OOPconcept;

public class L9POJOAndRECORD {
    public static void main(String[] args) {

        //? POJO
        for (int i = 1; i <= 5; i++) {
            L9Student s = new L9Student(
                    "S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous"; // Required for switch expressions
                    },
                    "05/11/1985",
                    "Java Masterclass"
            );
            System.out.println(s); //! Output is inside the curly braces and values are inside single quotes.
            //todo I have not even called the toString method because it is not required. When you try to print an object using System.out.println(), Java automatically calls
            // its toString() method behind the scenes. The method then returns a formatted string—usually containing the values of the object's variables—which is what gets displayed in the console
        }

        //? RECORD
        for (int i = 1; i <= 5; i++) {
            L9LPAStudent s = new L9LPAStudent(
                    "S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass"
            );
            System.out.println(s); //! Output is inside the square brackets and values are not inside single quotes.
        }

//*     Difference between POJO and Record
        L9Student pojoStudent = new L9Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        L9LPAStudent recordStudent = new L9LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

//*     1) Modifying Data (Immutability in Action) A POJO is mutable, meaning you can change its state using setters. A record is immutable and has no setters.
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//!     recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829"); // There is no setName() method, with or without a prefix. Trying to call one will result in a compile error.

//*     2) Accessing Data - While a POJO uses the standard get prefix for its getters, a record's accessor(getters) method is simply the name of the field.
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

/*

    Use a record when:
    - You need a simple, immutable container for data.
    - You are modeling things like database records, API responses, or events.
    - You want to reduce boilerplate and improve code readability.

    Use a traditional class (POJO) when:
    - You need to change an object's state after it has been created (mutability).
    - You need more complex logic

 */
    }
}
