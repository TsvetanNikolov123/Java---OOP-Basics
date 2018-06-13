package p02_StaticIdAndInterestRate;

public class BankAccount {

    private static final double DEFAULT_INTEREST_RATE = 0.02;

    private static int accountsCount;
    private static double currentInterestRate;

    private int id;
    private double balance;
    private double interestRate;

    public BankAccount() {
        this.id = ++accountsCount;
        currentInterestRate = DEFAULT_INTEREST_RATE;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public static void setInterestRate(double interestRate){
        currentInterestRate = interestRate;
    }

    void deposit(double amount){
        this.balance += amount;
    }

    public double getInterestRate(int years){
        return this.balance * currentInterestRate * years;
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
