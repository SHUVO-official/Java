import java.util.Scanner;

class BankAccount {

    // Data Members
    String depositorName;
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String name, String accNo, double bal) {
        depositorName = name;
        accountNumber = accNo;
        balance = bal;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount >= 500 && amount <= 50000) {
            balance = balance + amount;
            System.out.println("Deposit Successful!");
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        }
        else if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Method to display account information
    void display() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking account information
        System.out.print("Enter Depositor Name: ");
        String name = input.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = input.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = input.nextDouble();

        // Creating object
        BankAccount account = new BankAccount(name, accNo, bal);

        // Deposit operation
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        // Withdraw operation
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);

        // Display account information
        account.display();

        input.close();
    }
}