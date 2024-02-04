package java_training.ppseven;

import java.text.NumberFormat;
import java.util.Scanner;

public class BankManagement {
        public static void main(String[] args) {
            // Create an array to store up to 30 accounts
            Account[] accounts = new Account[30];
            int numberOfAccounts = 0;

            Scanner scanner = new Scanner(System.in);

            int choice;
            do {
                System.out.println("\nBank Management System Menu:");
                System.out.println("1. Add an account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Add Interest to all accounts");
                System.out.println("5. Display all accounts");
                System.out.println("6. Exit");
                System.out.print("Enter your choice (1-6): ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        if (numberOfAccounts < 30) {
                            System.out.print("Enter account owner's name: ");
                            scanner.nextLine(); // Consume the newline character
                            String owner = scanner.nextLine();
                            System.out.print("Enter account number: ");
                            long accountNumber = scanner.nextLong();
                            System.out.print("Enter initial balance: ");
                            double initialBalance = scanner.nextDouble();

                            accounts[numberOfAccounts] = new Account(owner, accountNumber, initialBalance);
                            numberOfAccounts++;
                            System.out.println("Account added successfully.");
                        } else {
                            System.out.println("Cannot add more accounts. Limit reached.");
                        }
                        break;

                    case 2:
                        performTransaction(accounts, numberOfAccounts, "deposit");
                        break;

                    case 3:
                        performTransaction(accounts, numberOfAccounts, "withdraw");
                        break;

                    case 4:
                        addInterestToAllAccounts(accounts, numberOfAccounts);
                        System.out.println("Interest added to all accounts.");
                        break;

                    case 5:
                        displayAllAccounts(accounts, numberOfAccounts);
                        break;

                    case 6:
                        System.out.println("Exiting the program. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                        break;
                }

            } while (choice != 6);

            scanner.close();
        }

        // Method to perform deposit or withdrawal transactions
        private static void performTransaction(Account[] accounts, int numberOfAccounts, String transactionType) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter account number: ");
            long accountNumber = scanner.nextLong();

            int accountIndex = findAccountIndex(accounts, numberOfAccounts, accountNumber);

            if (accountIndex != -1) {
                System.out.print("Enter amount to " + transactionType + ": ");
                double amount = scanner.nextDouble();

                if ("withdraw".equals(transactionType)) {
                    System.out.print("Enter withdrawal fee: ");
                    double fee = scanner.nextDouble();
                    accounts[accountIndex].withdraw(amount, fee);
                } else {
                    accounts[accountIndex].deposit(amount);
                }

                System.out.println(transactionType.substring(0, 1).toUpperCase() + transactionType.substring(1) +
                        " successful. Updated balance: " + accounts[accountIndex].getBalance());
            } else {
                System.out.println("Account not found. Please check the account number.");
            }
        }

        // Method to find the index of an account in the array
        private static int findAccountIndex(Account[] accounts, int numberOfAccounts, long accountNumber) {
            for (int i = 0; i < numberOfAccounts; i++) {
                if (accounts[i].getAcctNumber() == accountNumber) {
                    return i; // Account found, return its index
                }
            }
            return -1; // Account not found
        }

        // Method to add interest to all accounts
        private static void addInterestToAllAccounts(Account[] accounts, int numberOfAccounts) {
            for (int i = 0; i < numberOfAccounts; i++) {
                accounts[i].addInterest();
            }
        }

        // Method to display all accounts
        private static void displayAllAccounts(Account[] accounts, int numberOfAccounts) {
            System.out.println("\nAll Accounts:");
            System.out.println("Account\tOwner\tBalance");
            for (int i = 0; i < numberOfAccounts; i++) {
                System.out.println(accounts[i]);
            }
        }
}

