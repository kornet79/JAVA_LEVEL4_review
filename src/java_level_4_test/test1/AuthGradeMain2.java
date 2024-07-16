package java_level_4_test.test1;
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
                return;
            }

            // 등급에 따른 메시지와 메뉴 출력
            switch (authGrade) {
                case GUEST:
                    System.out.println("당신의 등급은 손님입니다.");
                    System.out.println("==메뉴 목록==");
                    System.out.println("- 메인 화면");
                    break;
                case LOGIN:
                    System.out.println("당신의 등급은 로그인 회원입니다.");
                    System.out.println("==메뉴 목록==");
                    System.out.println("- 메인 화면");
                    System.out.println("- 이메일 관리 화면");
                    break;
                case ADMIN:
                    System.out.println("당신의 등급은 관리자입니다.");
                    System.out.println("==메뉴 목록==");
                    System.out.println("- 메인 화면");
                    System.out.println("- 이메일 관리 화면");
                    System.out.println("- 관리자 화면");
                    break;
                default:
                    System.out.println("알 수 없는 등급입니다.");
                    break;
            }

            scanner.close();
        }
    }


