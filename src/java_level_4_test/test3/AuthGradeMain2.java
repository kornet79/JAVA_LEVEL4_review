package java_level_4_test.test3;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 등급 입력 받기
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String inputGrade = scanner.nextLine().trim().toUpperCase();

        AuthGrade authGrade;
        try {
            authGrade = AuthGrade.valueOf(inputGrade);
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 등급입니다. 프로그램을 종료합니다.");
            scanner.close();
            return;
        }

        // Enum의 다형성을 활용하여 메뉴 출력
        authGrade.showMenu();

        scanner.close();
    }
}

