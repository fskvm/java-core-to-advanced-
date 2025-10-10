package L5_OOPconcept;

public class L4Accounts {

    //*   private instance variables
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

//todo    Constructor chaining is when one constructor explicitly calls another overloaded constructor.
//        You can only use constructor chaining, within constructors.
//        You must use the special statement this() to execute another constructor, passing it arguments if required.
//        And this() must be the first executable statement if it's used from another constructor.


    public L4Accounts() {
        this("12345", 100.0, "Ak", "ak@gmail.com", "7502-345-439"); //! Constructor chaining but this() is the first statement always.
        System.out.println("No-args Account Constructor called");
    }

    public L4Accounts(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with 5 parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email; //! Since the parameter name defined with different from the instance variable name, you can use it directly.
        customerPhone = phone;
    }

    public L4Accounts(String customerName, String email, String phone) {
        this("54321", 50.0, customerName, email, phone); //! Using constructor chaining to set default values.
        System.out.println("Account constructor with 3 parameters called");
//!       Rather than assigning values in this constructor, you can assign values and default values in the other constructor.
//        customerName = customerName;
//        this.customerEmail = email;
//        this.customerPhone = phone;
    }



    //*    public methods
    public void depositFunds(double depositAmout) {
        balance += depositAmout;
        System.out.println("Deposit of $ " + depositAmout + " made. New balance is $ " + balance);
    }
    public void withdrawFunds(double withdrawalAmount) {
        if(balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $ " + balance + " in your account");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $ " + withdrawalAmount + " processed, Remaining balance = $ " + balance);

        }
    }

    //*    getter and setter methods
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
