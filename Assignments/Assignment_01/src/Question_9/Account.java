package Question_9;

import java.util.Date;

class Account
{
    // attributes
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    // constructors
    public Account() {}
    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    // getters
    public int getId() { return id; }
    public double getBalance() { return balance; }
    public double getAnnualInterestRate() { return annualInterestRate; }
    public Date  getDateCreated() { return dateCreated; }

    // setters
    public void setId(int id) { this.id = id; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setAnnualInterestRate(double annualInterestRate) { this.annualInterestRate = annualInterestRate; }

    // methods
    public double getMonthlyInterestRate() { return annualInterestRate / 12; }
    public double getMonthlyInterest() { return balance * getMonthlyInterestRate(); }
    public void withdraw(double withdrawalAmount) { balance -= withdrawalAmount; }
    public void deposit(double depositAmount) { balance += depositAmount; }
}