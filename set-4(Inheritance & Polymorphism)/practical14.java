class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accountNumber, String accountHolderName, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {

        balance += amount;

        System.out.println("Deposited Amount: " + amount);
    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println("Withdrawn Amount: " + amount);

        } else {

            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {

        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {

    double calculateInterest(double rate) {

        return (balance * rate) / 100;
    }
}

class FixedDepositAccount extends BankAccount {

    double maturityAmount(double rate, int years) {

        return balance + ((balance * rate * years) / 100);
    }
}

public class practical14 {

    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount();

        sa.openAccount(101, "Radhe", 50000);

        System.out.println("Saving Account");
        sa.deposit(5000);
        sa.withdraw(2000);
        sa.checkBalance();
        System.out.println("Interest: " + sa.calculateInterest(5));

        FixedDepositAccount fd = new FixedDepositAccount();

        fd.openAccount(102, "Krishna", 100000);

        System.out.println("\nFixed Deposit Account");
        fd.checkBalance();
        System.out.println("Maturity Amount: " + fd.maturityAmount(7, 3));
    }
}
