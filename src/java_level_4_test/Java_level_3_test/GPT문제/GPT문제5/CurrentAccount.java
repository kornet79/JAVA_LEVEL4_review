package Java_level_3_test.GPT문제.GPT문제5;

public class CurrentAccount implements Account{
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("입금 : " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if(balance + overdraftLimit < amount) {
            throw new IllegalArgumentException("잔액 및 당자대월 한도가 부족합니다. ");
        }
        balance -= amount;
        System.out.println("출금 : " + amount);
    }

    public void description() {
        System.out.println("이 계좌는 당좌 계좌입니다. 현재 잔액: " + balance + " . 당좌대월 한도: " + overdraftLimit);
    }

    public double getBalance() {
        return balance;
    }
}
