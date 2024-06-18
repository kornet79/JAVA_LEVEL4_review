package lang.object.string;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("== 비교 : " + (str1 == str2) );
        // 주소가 다르기 떄문에 false 라는 값이 나올것이다.
        System.out.println("equals 비교 : " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("== 비교 : " + (str3 == str4) );
        System.out.println("equals 비교 : " + (str3.equals(str4)));
    }
}
