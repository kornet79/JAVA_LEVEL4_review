package java_level_4_test.test2;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로 부터 등급 입력 받기
        System.out.println("당신의 등급을 입하세요[GUEST. LOGIN, ADMIN] : ");
        String inputGrade = sc.nextLine().trim().toUpperCase();

        UserAccess userAccess;
        switch (inputGrade) {
            case "GUEST":
                userAccess = new Guest();
                break;
            case "LOGIN":
                userAccess = new LoginUser();
                break;
            case "ADMIN":
                userAccess = new Admin();
                break;
            default:
                System.out.println("잘못된 등급입니다. 프로그램을 종료합니다.");
                return;
        }

        userAccess.showMenu();
    }
}
