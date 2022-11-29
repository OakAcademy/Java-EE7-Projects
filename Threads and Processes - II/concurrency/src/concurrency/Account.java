package concurrency;

public class Account {
    private int balance = 10000;
    public static void transfer(Account sourceAccount, Account targetAccount, int amount) {
        sourceAccount.withdraw(amount);
        targetAccount.deposit(amount);
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }
    public int getBalance() {
        return balance;
    }
}
