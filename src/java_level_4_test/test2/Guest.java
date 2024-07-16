package java_level_4_test.test2;

public class Guest implements UserAccess{
    @Override
    public void showMenu() {
        System.out.println("당신의 등급은 손님입니다.");
        System.out.println("==메뉴 목록==");
        System.out.println("- 메인 화면");

    }

}
