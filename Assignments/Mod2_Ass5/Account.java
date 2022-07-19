package Assignments.Mod2_Ass5;
import java.util.Date;
public class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    public Account()
    {
       
    }

    public Account(int id, double balance)
    {
      this.id = id;
      this.balance = balance;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getAIR()
    {
        return annualInterestRate;
    }

    public void setAIR(double userAIR)
    {
        this.annualInterestRate = userAIR;
    }

    public void setDate()
    {

    }
    public String getDateCreated()
    {
        return dateCreated.toString();
    }
    
    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 100 / 12;
    }

    public double getMonthlyInterest()
    {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double userAmount)
    {
        balance -= userAmount;
    }

    public void deposit(double userAmount)
    {
        balance += userAmount;
    }

    public static void main(String[] args) 
    {
        Account account = new Account(1122, 20000);
        account.setAIR(4.5);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("balance is " + account.getBalance());
        System.out.println("Montly interest is " + account.getMonthlyInterest());
        System.out.println("This account was created at " + account.getDateCreated());
    }
}
   
