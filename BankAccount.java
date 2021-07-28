
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class BankAccount
{
    private double balance;
    public BankAccount()
    {
        balance = 0;
    }

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    public void deposit(double amount)
    {
        balance+= amount;
    }

    public void withdraw(double amount)
    {
        balance-= amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public void transfer(double amount, BankAccount other)
    {
        balance-=amount;
        other.deposit(amount);
    }

    public abstract void close(BankAccount other);
    
}
