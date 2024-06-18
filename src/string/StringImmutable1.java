package lang.object.string;

public class StringImmutable1 {

    public static void main(String[] args) {

        String str = "hello";
        str.concat(" java");


        System.out.println("Str = " + str);
    }
}
// String은 불변 객체이다.(사이드 이펙트) 발생 유발!
// 따라서 생성 이후에 절대로 내부의 문자열 값을 변겨알 수 없다.
