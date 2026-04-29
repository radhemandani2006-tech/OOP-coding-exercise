public class practical10 {

    String account_holder_name;
    double balance;

    static double interest_rate = 5.0;

    practical10(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void display() {

        System.out.println("Account Holder Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
    }

    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }

    public static void main(String[] args) {

        practical10 acc1 = new practical10("Radhe", 50000);

        acc1.display();

        System.out.println("\nUpdating Interest Rate...\n");

        updateInterestRate(7.5);

        acc1.display();
    }
}
