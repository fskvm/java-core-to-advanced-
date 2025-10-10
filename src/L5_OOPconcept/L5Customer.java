package L5_OOPconcept;

public class L5Customer {
    private String name;
    private double creditLimit;
    private String email;

    public L5Customer() {
        this("Nobody", "Nobody@gaming.com");
    }

    public L5Customer(String name, String email) {
        this(name, 1000, email);
    }

    public L5Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
