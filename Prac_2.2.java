/*
Created by 21CE125 Kaivan Shah
Design a class named Account that contains:
A private int data field namedid for the account (default 0).0
A private double data field named balance for the account (default 500₹).
A  private  double  data  field  named  annualInterestRate  that  stores  the  currentinterest rate (default 7%).
Assume all accounts have the same interest rate.
A  private  Date  data  field  named  dateCreated  that  stores  the  date  when  theaccount was created.
A no-arg constructor that creates a default account.
A constructor that creates an account with the specified id and initial balance.
The accessor and mutator methods for id, balance, and annualInterestRate.
The accessor method for dateCreated.
A method named getMonthlyInterestRate() that returns the monthlyinterest rate.
A method named getMonthlyInterest() that returns the monthly interest.
A method named withdraw that withdraws a specified amount from theaccount.
A method named deposit that deposits aspecified amount to the account.

*/
class account{
    int id;
    double balance;
    double annualInterestRate;
    String dateCreated;
   
    account()
    {
        id  = 0;
        balance = 500;
        annualInterestRate = 0.07;
    }
   
    account(int id, double balance, double annualInterestRate,String dateCreated)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }
   
    public void get(int id, double balance, double annualInterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }
   
    public void date(String date)
    {
        this.dateCreated = dateCreated;
    }
   
    public double InterestRate(){
        return this.annualInterestRate;
    }
   
    public double balance(){
        return this.balance;
    }
   
    double deposite(double i)
    {
        balance = balance + i;
        return balance;
    }
   
    double withdrawl(double w)
    {
        balance = balance - w;
        return balance;
    }

    double getMonthlyInterest()
    {
        return annualInterestRate * balance;
    }

    public String toString(){//overriding the toString() method  
        return  "\nbalance - " + balance +  "\naccoutno - " + id + "\nAnnualInterestRate - " + annualInterestRate + "\nDate - "+ dateCreated;
    }
}

class Main{
public static void main(String[] args) {
account a = new account(1,1000,2.3,"10/11/22");
a.withdrawl(900.0);

System.out.println(a);
  System.out.println("21CE125 Kaivan Shah");
}
}
