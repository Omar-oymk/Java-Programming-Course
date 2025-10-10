package Question_9;

import java.util.Date;

class Account
{
    // attributes
    private int id;
    private double balance;
    private static double annualInterestRate;
    private final Date dateCreated;     // final because it only indicates when the acc was created

    // constructors
    public Account() { dateCreated = new Date(); }
    public Account(int id, double balance)
    {
        this();
        this.id = id;
        this.balance = balance;
    }

    // getters
    public int getId() { return id; }
    public double getBalance() { return balance; }
    public static double getAnnualInterestRate() { return annualInterestRate; }
    public Date getDateCreated() { return dateCreated; }

    // setters
    public void setId(int id) { this.id = id; }
    public void setBalance(double balance) { this.balance = balance; }
    public static void setAnnualInterestRate(double annualInterestRate) { Account.annualInterestRate = annualInterestRate; }

    // methods
    public double getMonthlyInterestRate() { return (annualInterestRate/100) / 12; }
    public double getMonthlyInterest() { return balance * getMonthlyInterestRate(); }
    public void withdraw(double withdrawalAmount) { if (withdrawalAmount <= balance) balance -= withdrawalAmount; }
    public void deposit(double depositAmount) { if (depositAmount > 0) balance += depositAmount; }
}