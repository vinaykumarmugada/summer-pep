package summerpep;


import java.util.Scanner;

public class BankCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankManager manager = new BankManager();

        while (true) {
            System.out.println("\nWelcome to SimpleBank CLI");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Create Fixed Deposit");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Account No: ");
                    String accNo = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Deposit: ");
                    double deposit = sc.nextDouble();
                    manager.createAccount(accNo, name, deposit);
                    System.out.println("Account created successfully.");
                }
                case 2 -> {
                    System.out.print("Enter Account No: ");
                    String accNo = sc.nextLine();
                    BankAccount acc = manager.getAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter Amount to Deposit: ");
                        double amt = sc.nextDouble();
                        acc.deposit(amt);
                        System.out.println("Amount deposited.");
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter Account No: ");
                    String accNo = sc.nextLine();
                    BankAccount acc = manager.getAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter Amount to Withdraw: ");
                        double amt = sc.nextDouble();
                        acc.withdraw(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter Account No: ");
                    String accNo = sc.nextLine();
                    BankAccount acc = manager.getAccount(accNo);
                    if (acc != null) {
                        System.out.println("Available Balance: ₹" + acc.getAvailableBalance());
                        System.out.println("FD Amount: ₹" + acc.getFixedDepositAmount());
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 5 -> {
                    System.out.print("Enter Account No: ");
                    String accNo = sc.nextLine();
                    BankAccount acc = manager.getAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter FD Amount: ");
                        double amt = sc.nextDouble();
                        acc.createFD(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 6 -> {
                    System.out.println("Exiting... Thank you for using SimpleBank.");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

