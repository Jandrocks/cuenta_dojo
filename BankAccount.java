import java.util.Random;

public class BankAccount {
    private static int numberOfAccounts = 0;
    private static double totalMoneyStored = 0;

    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }

    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int digit = random.nextInt(10);
            accountNumber.append(digit);
        }

        return accountNumber.toString();
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void depositToChecking(double amount) {
        this.checkingBalance += amount;
        totalMoneyStored += amount;
    }

    public void depositToSavings(double amount) {
        this.savingsBalance += amount;
        totalMoneyStored += amount;
    }

    public void withdrawFromChecking(double amount) {
        if (this.checkingBalance >= amount) {
            this.checkingBalance -= amount;
            totalMoneyStored -= amount;
        } else {
            System.out.println("Fondos insuficientes en la cuenta corriente.");
        }
    }

    public void withdrawFromSavings(double amount) {
        if (this.savingsBalance >= amount) {
            this.savingsBalance -= amount;
            totalMoneyStored -= amount;
        } else {
            System.out.println("Fondos insuficientes en la cuenta de ahorros.");
        }
    }

    public static double getTotalMoneyStored() {
        return totalMoneyStored;
    }

    public void displayAccountBalance() {
        System.out.println("Saldo de la cuenta corriente: " + this.checkingBalance);
        System.out.println("Saldo de la cuenta de ahorros: " + this.savingsBalance);
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}