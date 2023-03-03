package bank;

public class TestBank {
    public static void main(String[] args) {
        Bank account1 = new Bank(1000.0, 5.0);
        double interest1 = account1.calculateInterest();
        System.out.println("Monthly interrest: $" + interest1);
    }
}
