package bankapp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class Bank {
    protected String accountName;
    protected double balance;

    public Bank(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    // Abstract methods to be implemented by subclass
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Utility method to record each transaction in Bank.txt
    protected void recordTransaction(String transaction) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("Bank.txt", true))) {
            writer.println(transaction);
        } catch (IOException e) {
            System.out.println("Error writing to Bank.txt: " + e.getMessage());
        }
    }
}
