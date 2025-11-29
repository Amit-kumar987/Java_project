class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void checkBalance() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}

class Savings extends Account {
    double interestRate;

    Savings(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        checkBalance();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class Current extends Account {
    double overdraftLimit;

    Current(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft Limit Exceeded");
        }
    }

    void display() {
        checkBalance();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class AccountMain {
    public static void main(String[] args) {
        System.out.println("----- Savings Account -----");
        Savings s = new Savings(101, 5000, 4.5);
        s.deposit(1000);
        s.withdraw(2000);
        s.display();

        System.out.println("\n----- Current Account -----");
        Current c = new Current(202, 3000, 2000);
        c.deposit(500);
        c.withdraw(4500);
        c.display();
    }
}
