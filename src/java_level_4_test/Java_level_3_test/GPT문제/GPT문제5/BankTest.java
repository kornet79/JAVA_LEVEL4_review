package Java_level_3_test.GPT문제.GPT문제5;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 객체화 부분 작성1
        Account[] accounts = {
                new SavingsAccount(1000),
                new CurrentAccount(1000, 500)
        };

        System.out.println("계좌 유형을 선택하세요.");
        System.out.println("[1] : 예금 계좌");
        System.out.println("[2] : 당좌 계좌");

        int choice = sc.nextInt();

        Account selectedAccount = accounts[choice - 1];

        System.out.println("입금 또는 출금을 선택하세요.");
        System.out.println("[1] : 입금");
        System.out.println("[2] : 출금");

        int action = sc.nextInt();

        System.out.println("금액을 입력하세요:");
        double amount = sc.nextDouble();

        try {
            if (action == 1) {
                selectedAccount.deposit(amount);
            } else if (action == 2) {
                selectedAccount.withdraw(amount);
            } else {
                System.out.println("잘못된 선택입니다.");
            }

            if (selectedAccount instanceof SavingsAccount) {
                ((SavingsAccount) selectedAccount).description();
            } else if (selectedAccount instanceof CurrentAccount) {
                ((CurrentAccount) selectedAccount).description();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("에러: " + e.getMessage());
        }
    }
}
