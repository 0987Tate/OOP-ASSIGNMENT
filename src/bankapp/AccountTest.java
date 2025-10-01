package bankapp;

public class AccountTest {
    public static void main(String[] args) {
        // Create an account with initial balance
        Account myAccount = new Account("Tatenda Mharah", 1000.0);

        // Test deposit
        myAccount.deposit(500.0);    // valid deposit
        myAccount.deposit(-50.0);    // invalid deposit

        // Test withdraw
        myAccount.withdraw(200.0);   // valid withdrawal
        myAccount.withdraw(2000.0);  // exceeds balance
        myAccount.withdraw(-10.0);   // invalid withdrawal

        // Test getBalance
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}

