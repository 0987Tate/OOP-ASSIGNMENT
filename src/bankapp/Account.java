package bankapp;

public class Account extends Bank {

    public Account(String accountName, double balance) {
        super(accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            recordTransaction(accountName + " deposited $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Must be greater than 0.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal amount exceeded account balance.");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            recordTransaction(accountName + " withdrew $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount. Must be greater than 0.");
        }
    }

    @Override
    public double getBalance() {
        recordTransaction(accountName + " checked balance: $" + balance);
        return balance;
    }
}

