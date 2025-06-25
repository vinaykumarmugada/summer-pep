package summerpep;

public class BankAccount {
    private String accountNo;
    private String name;
    private double balance;
    private double fixedDepositAmount;

    public BankAccount(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.fixedDepositAmount = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
        }
    }

    public void createFD(double amount) {
        if (amount > balance) {
            System.out.println("Cannot create FD. Insufficient balance.");
        } else {
            fixedDepositAmount += amount;
            balance -= amount;
        }
    }

    public double getAvailableBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public double getFixedDepositAmount() {
        return fixedDepositAmount;
    }
}
