package Java_level_3_test.GPT문제.GPT문제5;

public class SavingsAccount implements Account{
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("입금: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if(balance < amount) {
            throw new IllegalArgumentException("잔액이 부족합니다");
        }
        balance -= amount;
        System.out.println("출금: " + amount);
    }

    public void description() {
        System.out.println("이 계좌는 예금 계좌입니다. 현재 잔액: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
