package java_level_4_test.test3;

public enum AuthGrade {
    GUEST {
        @Override
        public void showMenu() {
            System.out.println("당신의 등급은 손님입니다.");
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
        }
    },
    LOGIN {
        @Override
        public void showMenu() {
            System.out.println("당신의 등급은 로그인 회원입니다.");
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        }
    },
    ADMIN {
        @Override
        public void showMenu() {
            System.out.println("당신의 등급은 관리자입니다.");
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        }
    };

    public abstract void showMenu();
}
