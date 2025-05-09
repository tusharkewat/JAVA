package Encapsulation;

class BankAccount {
    private int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Amount Deposited : " + amount);
        System.out.println("Current Balance : " + balance);
    }

    void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Amount Withdraw : " + amount);
        System.out.println("Current Balance : " + balance);
    }
}

public class BankAccountBalance {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.deposit(1000);
        obj.deposit(1000);
        obj.withdraw(500);
        obj.deposit(1000);
        obj.withdraw(500);
        obj.withdraw(500);

    }
}
