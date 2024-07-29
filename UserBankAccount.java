public class UserBankAccount {
    private float balance;

    // Constructor to initialize balance
    public UserBankAccount() {
        this.balance = 0;
    }

    // Method to withdraw money
    public void withdraw(float withdrawAmount) {
        if (withdrawAmount <= 0 || balance < withdrawAmount) {
            System.out.println("Unable to withdraw. Insufficient funds or invalid amount.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    // Method to deposit money
    public void deposit(float depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Unable to deposit. Invalid amount.");
        } else {
            balance += depositAmount;
            System.out.println("Deposit successful. Current balance: " + balance);
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance is: " + balance);
    }
}
