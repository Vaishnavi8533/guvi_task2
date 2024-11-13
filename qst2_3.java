package task2;

import java.util.Scanner;

class Account {
    private double balance;

    // No-argument constructor, initializes balance to 0
    public Account() {
        this.balance = 0.0;
    }

    // One-argument constructor, initializes balance to the given amount
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0.0;
        }
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class qst2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create account with user-specified initial balance
        System.out.print("Enter initial balance for the account: ");
        double initialBalance = getPositiveDoubleInput(scanner);
        Account account = new Account(initialBalance);

        // Deposit money into the account
        System.out.print("Enter amount to deposit: ");
        double depositAmount = getPositiveDoubleInput(scanner);
        account.deposit(depositAmount);

        // Withdraw money from the account
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = getPositiveDoubleInput(scanner);
        account.withdraw(withdrawAmount);

        // Display the final balance
        account.displayBalance();

        scanner.close();
    }

    // Helper method to ensure positive double input
    private static double getPositiveDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a positive number: ");
            scanner.next(); // Discard invalid input
        }
        double input = scanner.nextDouble();
        while (input < 0) {
            System.out.print("Amount must be positive. Please enter again: ");
            input = scanner.nextDouble();
        }
        return input;
    }
}
