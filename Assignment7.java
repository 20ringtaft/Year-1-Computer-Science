import java.util.Scanner;

/**
This program tests the BankAccount class and
its subclasses. 
 */
public class Assignment7
{ 

    public static void main(String[] args)
    {  

        //creating a Scanner object to get user inputs 
        Scanner input = new Scanner(System.in); 

        //creating accounts
        BankAccount daddyAccount = new SavingsAccount(0.005, 500);
        CheckingAccount momAccount = new CheckingAccount(100);
        CheckingAccount nancyAccount = new CheckingAccount(50);

        //making some transactions
        System.out.println("Inform the value to be withdrawn from mom's account");
        momAccount.withdraw(input.nextDouble());
        System.out.println("Inform the value to be withdrawn from mom's account");
        momAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be transferred from daddy's to mom's account");
        daddyAccount.transfer(input.nextDouble(), momAccount);

        System.out.println("Inform the value to be withdrawn from Nancy's account");
        nancyAccount.withdraw(input.nextDouble());
        System.out.println("Inform the value to be withdrawn from Nancy's account");
        nancyAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be transferred from daddy's to Nancy's account");
        daddyAccount.transfer(input.nextDouble(), nancyAccount);

        System.out.println("Inform the value to be withdrawn from mom's account");
        momAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be withdrawn from Nancy's account");
        nancyAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be transferred from daddy's to mom's account");
        daddyAccount.transfer(input.nextDouble(), momAccount);

        System.out.println("Inform the value to be transferred from daddy's to Nancy's account");
        daddyAccount.transfer(input.nextDouble(), nancyAccount);

        //closing daddy's account
        daddyAccount.close(momAccount);

        //creating another daddy's account (checking)
        daddyAccount = new CheckingAccount();

        System.out.println("Inform the value to be deposited in daddy's account");
        daddyAccount.deposit(input.nextDouble());

        System.out.println("Inform the value to be transferred from daddy's to Nancy's account");
        daddyAccount.transfer(input.nextDouble(), nancyAccount);

        System.out.println("Inform the value to be withdrawn from Nancy's account");
        nancyAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be withdrawn from Nancy's account");
        nancyAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be deposited in daddy's account");
        daddyAccount.deposit(input.nextDouble());

        System.out.println("Inform the value to be withdrawn from mom's account");
        momAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be withdrawn from Nancy's account");
        nancyAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be transferred from mom's to Nancy's account");
        momAccount.transfer(input.nextDouble(), nancyAccount);

        System.out.println("Inform the value to be withdrawn from Nancy's account");
        nancyAccount.withdraw(input.nextDouble());

        //closing daddy's account
        daddyAccount.close(momAccount);

        //creating another daddy's account (savings)
        SavingsAccount newDaddyAccount = new SavingsAccount(0.05);

        System.out.println("Inform the value to be deposited in daddy's account");
        newDaddyAccount.deposit(input.nextDouble());

        System.out.println("Inform the value to be transferred from daddy's to Nancy's account");
        newDaddyAccount.transfer(input.nextDouble(), nancyAccount);

        System.out.println("Inform the value to be withdrawn from Nancy's account");
        nancyAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be withdrawn from Nancy's account");
        nancyAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be withdrawn from mom's account");
        momAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be withdrawn from mom's account");
        momAccount.withdraw(input.nextDouble());

        System.out.println("Inform the value to be transferred from mom's to Nancy's account");
        momAccount.transfer(input.nextDouble(), nancyAccount);

        // Simulating end of month
        newDaddyAccount.addInterest();
        momAccount.deductMaintenanceFee();
        nancyAccount.deductMaintenanceFee();

        // Showing the balances  
        System.out.println("Mom's checking balance = $" + momAccount.getBalance());

        System.out.println("Nancy's checking balance = $" + nancyAccount.getBalance());

        System.out.println("Daddy's savings balance = $" + newDaddyAccount.getBalance());

        input.close();

    }

}