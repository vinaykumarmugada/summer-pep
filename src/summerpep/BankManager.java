package summerpep;




import java.util.HashMap;

public class BankManager {
    private HashMap<String, BankAccount> accounts = new HashMap<>();

    public void createAccount(String accNo, String name, double initialDeposit) {
        BankAccount acc = new BankAccount(accNo, name, initialDeposit);
        accounts.put(accNo, acc);
    }

    public BankAccount getAccount(String accNo) {
        return accounts.get(accNo);
    }
}