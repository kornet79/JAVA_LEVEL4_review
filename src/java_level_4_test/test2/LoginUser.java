package java_level_4_test.test2;

public class LoginUser implements UserAccess {
    @Override
    public void showMenu() {
        System.out.println("당신의 등급은 로그인 회원 입니다.");
        System.out.println("==메뉴 목록==");
        System.out.println("- 메인 화면");
        System.out.println("- 이메일 관리 화면");
    }
}
