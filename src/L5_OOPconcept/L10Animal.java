package L5_OOPconcept;

public class L10Animal {
    protected String type; //?Using the protected modifier provides conditional encapsulation by granting subclasses and other classes within the same package access to a field.
    private String size;
    private double weight;

//?    A no-argument constructor is needed so subclasses with no constructor, In this case an implicit default constructor with super() is created automatically by the compiler so that super() will not cause a compile error.
    public L10Animal() {
    }
    public L10Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "L10Animal{" +
                "name='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }

    //* getters


    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }
}
