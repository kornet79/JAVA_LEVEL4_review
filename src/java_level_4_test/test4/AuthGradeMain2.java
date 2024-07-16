package java_level_4_test.test4;

import java.util.IllformedLocaleException;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
       AuthGradeMain2 authGradeMain2 = new AuthGradeMain2();
       String inputGrade = authGradeMain2.getUserInput();
        AuthGrade authGrade = authGradeMain2.convertToauthGrade(inputGrade);
        if(authGrade != null) {
            authGrade.showMenu();
        }
    }

    private String getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String input = sc.nextLine().trim().toUpperCase();
        return input;
    }
    private AuthGrade convertToauthGrade(String inputGrade) {
        try {
            return AuthGrade.valueOf(inputGrade);
        } catch (IllformedLocaleException e) {
            System.out.println("잘못된 등급입니다. 프로그램을 종료합니다.");
            return null;
        }
    }

}

