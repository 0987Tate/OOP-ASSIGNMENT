package bankapp;



public class CustomExceptionExample {
    public static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Withdrawal amount exceeds available balance.");
        } else {
            System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
        }
    }

    public static void main(String[] args) {
        double currentBalance = 1000.0;
        try {
            System.out.println("Attempting to withdraw 1500...");
            withdraw(currentBalance, 1500.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}




