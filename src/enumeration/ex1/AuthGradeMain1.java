package immutable.enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {

        AuthGrade[] values = AuthGrade.values();

        for(AuthGrade value : values) {
            System.out.println("grade = " + value.name() + ", level = " + value.getLevel() + ", desc = " + value.getdesc());
        }
    }
}
