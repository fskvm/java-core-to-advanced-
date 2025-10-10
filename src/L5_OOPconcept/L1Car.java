package L5_OOPconcept;

public class L1Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "white" ;
    private int doors = 4;
    private boolean convertible = false;

//*    The purpose of these getter and setter methods is to control and protect access to private fields.

//*    A getter is a method on a class that retrieves the value of a private field and returns it.
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        //! naming convention for boolean getter methods is to use "is" prefix instead of "get"
        return convertible;
    }

    //*    A setter is a method on a class that sets the value of a private field. They all have type void because they do not return a value.
    //*    Setters often include validation logic to ensure that only valid data is assigned to the field.

//todo    In Java, the this keyword is a special reference name that points to the current object instance. It allows an object to refer to itself
//         To Distinguish Instance Variables from Local Variables - Primarily seen in constructors and setters. When a method parameter or local variable has the same name as an instance variable, it "shadows" the instance variable. this is used to specify that you mean the instance variable

    public void setMake(String make) {

        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "ford", "honda", "porsche", "tesla" -> this.make = make; //? Without this.make, the line make = make; would just assign the parameter's value to itself, leaving the instance variable unchanged.
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describe() {
        //! if no value is assigned to fields, then the output will be '0-Door null null null false'
        /*
        (Output Explanation) Reference vs. Primitive Types

         Reference Types (e.g., String): A reference type variable stores a reference—a memory address that points to an object's actual location on the heap.
         The variable itself does not contain the object's data. If a reference variable does not point to any object, its value is the special literal null. This applies to all objects, including strings, arrays etc.

         Primitive Types (e.g., int): A primitive type variable directly contains its value within its own allocated memory space.
         A primitive variable can never be null. If declared as a class field without initialization, primitives are assigned a default value, such
         - byte: 0
         - short: 0
         - int: 0
         - long: 0
         - char: 0

         - float: 0.0
         - double: 0.0

         - boolean: false

         */
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : "false"));
    }
}
