
/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends BankAccount
{
    private double interestRate;
    public SavingsAccount(double rate)
    {
        super();
        interestRate = rate;
    }

    public SavingsAccount(double rate, double initialBalance)
    {
        super(initialBalance);
        interestRate = rate;
    }

    public void addInterest()
    {
        double balance = super.getBalance();
        super.deposit(interestRate*balance); 
    }

    public void close(BankAccount other)
    {
        double balance = super.getBalance();
        super.withdraw(balance);
        other.deposit(balance);

    }
}
