import java.util.Scanner;
class SavingsAccount{

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount()
    {
        savingsBalance = 0;
        annualInterestRate = 0;
    }

    public SavingsAccount(double balance)
    {
        savingsBalance = balance;
        annualInterestRate = 0;
    }

    public void calculateMonthlyInterest()
    {
        System.out.println("Current savings balance: " + savingsBalance);
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate)/12;
        savingsBalance = monthlyInterest;
        System.out.println("New savings balance: " + savingsBalance);
    }

    public double getBalance()
    {
        return savingsBalance;
    }
    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
}
class Driver
{
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(4000);
        saver1.modifyInterestRate(.03);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(.03);
        saver2.calculateMonthlyInterest();
        saver1.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(.05);
        saver2.calculateMonthlyInterest();
    }
}