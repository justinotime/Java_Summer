package Assignments.Mod2_Ass5;

//import java.sql.Date;

public class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    //private Date dateCreated = null;

    public Account()
    {
       
    }

    public Account(int accountId, double accountBalance)
    {
        accountId = id;
        accountBalance = balance;  
    }

    static void setAnnualInterestRate(double userAIR)
    {
        userAIR = annualInterestRate;
    }

    

    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
    }
}
   
