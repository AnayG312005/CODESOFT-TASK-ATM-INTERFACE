import java.util.Scanner;

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor to initialize the account with a balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to $0.00.");
            this.balance = 0;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("You have successfully deposited $%.2f.%n", amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("You have successfully withdrawn $%.2f.%n", amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
        return false;
    }
}

// ATM_Interface class
public class ATM_Interface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctPIN = "Hardik@7982"; // Predefined security PIN
        BankAccount userAccount = new BankAccount(100000000.00); // Create bank account with 10 crore balance
        boolean running = true;

        // Step 1: PIN Verification
        System.out.println(" ATM Interface! ");
        System.out.println("-----------------");
        System.out.println("Developed by Anay Gupta\n");
        System.out.print("Please enter your 4-digit PIN: ");
        String enteredPIN = scanner.nextLine();

        int attempts = 1;
        while (!enteredPIN.equals(correctPIN)) {
            if (attempts >= 3) {
                System.out.println("Too many incorrect attempts. Access denied!");
                scanner.close();
                return;
            }
            System.out.println("Incorrect PIN. Please try again.");
            System.out.print("Enter your PIN: ");
            enteredPIN = scanner.nextLine();
            attempts++;
        }

        System.out.println("PIN verified successfully!");
        System.out.println("===== Welcome to the ATM Interface =====");

        // Step 2: Main Menu
        while (running) {
            System.out.println("MAIN MENU");
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Check balance
                    System.out.printf("Your current balance is: $%.2f%n", userAccount.getBalance());
                    break;

                case 2: // Deposit money
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;

                case 3: // Withdraw money
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    running = false;
                    break;

                default: // Invalid option
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }

        scanner.close();
    }
}
