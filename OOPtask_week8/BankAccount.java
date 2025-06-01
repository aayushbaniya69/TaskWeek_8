import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    public void setAccountNumber(String number) {
        accountNumber = number;
    }
    public void setAccountHolderName(String name) {
        accountHolderName = name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
        } else if (amount > accountBalance) {
            System.out.println("Insufficient balance.");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }
    public double getBalance() {
        return accountBalance;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount();
        System.out.print("Enter account number: ");
        account.setAccountNumber(input.nextLine());
        System.out.print("Enter account holder name: ");
        account.setAccountHolderName(input.nextLine());
        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("\nAccount Summary:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Current Balance: $" + account.getBalance());
        input.close();
    }
}
