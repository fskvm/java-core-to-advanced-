package L5_OOPconcept;

public class L4CtorOverloadingAndChaining {
    public static void main(String[] args) {
        L4Accounts bobsAccount = new L4Accounts();
        System.out.println("Account No: " + bobsAccount.getNumber() + " Balance: " + bobsAccount.getBalance());
        L4Accounts AliceAccount = new L4Accounts("Alice", "alice@gmail.com", "7520-102-234");
        System.out.println("Account No: " + AliceAccount.getNumber() + " Balance: " + AliceAccount.getBalance());

    }
}

