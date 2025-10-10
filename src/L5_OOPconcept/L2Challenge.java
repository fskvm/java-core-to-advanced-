package L5_OOPconcept;

public class L2Challenge {
    public static void main(String[] args) {

        L2Account bobsAccount = new L2Account();

        bobsAccount.setNumber("12790");
        bobsAccount.setBalance(0.0);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.setCustomerPhone("7502-345-439");

        System.out.println(bobsAccount.getCustomerName());

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250.0);
        bobsAccount.withdrawFunds(50);
        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46); //  Extra penny (trying to check all test cases is working properly)
        bobsAccount.withdrawFunds(54.45);
    }
}
