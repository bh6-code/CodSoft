import java.util.Scanner;

public class ATMinterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserBankAccount userBankAccount = new UserBankAccount();

        while (true) {
            // Display ATM menu
            System.out.println("ATM Menu:");
            System.out.println("Press 1: Withdraw");
            System.out.println("Press 2: Deposit");
            System.out.println("Press 3: Check Balance");
            System.out.println("Press 4: Terminate");

            // Input user choice
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    float withdrawAmount = scanner.nextFloat();
                    userBankAccount.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    float depositAmount = scanner.nextFloat();
                    userBankAccount.deposit(depositAmount);
                    break;
                case 3:
                    userBankAccount.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
            System.out.println(); // Blank line for better readability
        }
    }
}

class UserBankAccount {
    private float balance;

    // Constructor to initialize balance
    public UserBankAccount() {
        this.balance = 0;
    }

    // Method to withdraw money
    public void withdraw(float amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    // Method to deposit money
    public void deposit(float amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}
