
/**
 * Write a description of class CheckingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckingAccount extends BankAccount
{
    private int transactionCount;
    static final int FREE_TRANSACTIONS = 3;
    static final double TRANSACTION_FEE = 2.0;
    static final double CLOSING_FEE = 5.0;
    static final double MAINTENANCE_FEE = 10.0;

    public CheckingAccount()
    {
        super();
        transactionCount=0;
    }

    public CheckingAccount(double initialBalance)
    {
        super(initialBalance);
        transactionCount=0;
    }

    public void deposit(double amount)
    {
        transactionCount++;
        super.deposit(amount);
        if(transactionCount >= 3)
            super.withdraw(TRANSACTION_FEE);

    }

    public void withdraw(double amount)
    {
        transactionCount++;
        super.withdraw(amount);
        if(transactionCount >= 3)
            super.withdraw(TRANSACTION_FEE);

    }

    public void deductMaintenanceFee()
    {
        super.withdraw(MAINTENANCE_FEE);
        transactionCount = 0;

    }

    public void close(BankAccount other)
    {

        double balance = super.getBalance();
        balance -= CLOSING_FEE;
        super.withdraw(balance);
        other.deposit(balance);
        transactionCount=0;
    }
}
