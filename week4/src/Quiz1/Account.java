package Quiz1;

public class Account {
    private String accountHolderName;
    private double balance;

    public Account(String accountHolderName, double openingBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void calcInterest(double apr) {
        double interest = balance * (apr /100);
        balance += interest;
    }
}
