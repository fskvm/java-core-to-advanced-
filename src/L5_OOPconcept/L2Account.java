package L5_OOPconcept;

public class L2Account {

//*   private instance variables
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

//todo      CONSTRUCTOR
//      A constructor is used in the creation of an object.
//      It is a special type of code block that has a specific name and parameters, much like a method.
//      It has the same name as the class itself, and it doesn't return any values. You never include a return type from a constructor, not even void.
//      You can, and should, specify an appropriate access modifier to control who should be able to create new instances of the class, using this constructor.

//!    A constructor's main job is to assign initial values to an object's instance variables (its "state") by accepting arguments when the object is created.

//todo    Constructor Overloading (Same as Method Overloading)
//     Constructor overloading is declaring multiple constructors with different parameters.
//     The number of parameters can be different between constructors.
//     (or) if the number of parameters is the same between two constructors, parameter types, or order of the types must differ.

/*
   Types of Constructors in Java
   1) No-argument Constructor

      a) Default Constructors (implicit)
   If you don't declare any constructor in your class, the Java compiler implicitly creates one for you. This automatically generated constructor is called the default constructor.
   This constructor is public, has no parameters (it's a "no-args" constructor), and its body is empty.
   Although you can't see it in your source code, it's added to the bytecode during compilation, allowing you to create objects using new ClassName().
   However, the moment you explicitly declare any constructor in your class (even one with parameters),
   the compiler will not create the default constructor for you. If you still need a no-args constructor in that case, you must define it yourself.

    public L2Account() {

    }
*/

//     b) User-Defined No-Args constructors (explicit)
    public L2Account() {
        System.out.println("No-args Account Constructor called");
    }

//  2) Parameterized Constructor (explicit)
    public L2Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email; //! Since the parameter name defined with different from the instance variable name, you can use it directly.
        customerPhone = phone;
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
