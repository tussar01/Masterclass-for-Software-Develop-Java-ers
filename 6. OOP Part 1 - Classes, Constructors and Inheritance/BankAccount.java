/*
- Create a new class for a bank account
- Create fields for the account number, balance, customer name, email and phone number.
- Create getter and setter for each field

-- Create two additional methods
1. To allow the customer to deposit funds (this should increment the balance field).
2. To allow the customer withdrawal funds, This should deduce from the balance field.
- You will want to create various code in the Main class to confirm your code is working.
- Add some System.out.println's in the two methods above as well.
 */


import java.sql.SQLOutput;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor parameter called");
        this.number = number;
        this.balance= balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal (double withdrawalAmount) {
        if(this.balance - withdrawalAmount <0) {
            System.out.println("Only " + this.balance + " available. Withdrawal is not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

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

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

/*
Main.java
*/
public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount("1234", 0.00, "Bob Brown", "myemail@bob.com", "(880)1714449007");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());


        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}

/*
OUTPUT
Account constructor parameter called
1234
0.0
Only 0.0 available. Withdrawal is not processed
Deposit of 50.0 made. New balance is 50.0
Only 50.0 available. Withdrawal is not processed
Deposit of 51.0 made. New balance is 101.0
Withdrawal of 100.0 processed. Remaining balance = 1.0

*/




