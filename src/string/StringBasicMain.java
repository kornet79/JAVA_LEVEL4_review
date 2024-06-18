package lang.object.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1= "hello";
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}

// 쌍따음표 사용 방법, 객체 생성이 방법이 있다.
// String 클래스이다!! int, boolean과 같은 기본형이 아니라 참조형이다.
// 따라서 str1 변수에는 String 인스턴스의 참조값만 들어갈 수 있다.
// 그러면 String str1 = "hello"; 문장은 뭔가 어색해보인다!
// String str1 = new String("hello");
// 사이드 이팩트 불변의 객체의 의미가 있다.

