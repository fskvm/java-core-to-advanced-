package L5_OOPconcept;

public class L5Challenge {
    public static void main(String[] args) {
        L5Customer customer = new L5Customer("Tim", 1000, "tim@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        L5Customer customer2 = new L5Customer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());

        L5Customer customer3 = new L5Customer("Bob", "bob@gmail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());
    }
}
