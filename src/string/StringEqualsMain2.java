package lang.object.string;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("메서드 호출 비교 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("메서드 호출 비교 : " + isSame(str3, str4));


    }
    private static boolean isSame(String a, String b) {
        // equals(쓰자)
        return a == b;
    }
}
