package L5_OOPconcept;

public class L3Constructor {
    public static void main(String[] args) {

        L2Account bobsAccount = new L2Account(); //! Here you are acually calling the constructor of the class.

//*        Using setters to set the values of the variables
//        bobsAccount.setNumber("12790");
//        bobsAccount.setBalance(500);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("7502-345-439");
//!       OR Most efficient way using constructor to set the values of the variables
        L2Account bobsAccount2 = new L2Account("12790",500,"Bob Brown","myemail@bob.com","7502-345-439");
        System.out.println(bobsAccount2.getNumber());
        System.out.println(bobsAccount2.getBalance());
    }
}
