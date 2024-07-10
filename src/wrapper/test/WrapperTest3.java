package wrapperC.test;

public class WrapperTest3 {

    public static void main(String[] args) {

        String str = "100";

        // String str을 Integer로 변환해서 출력 : 박싱.
        // Integer를 int 로 변한해서 출력 : 오토 언박싱.
        // int를 Integer로 변환해서 출력 : 오토 박싱.

        // String -> Integer
        Integer integer1 = Integer.valueOf(str); // 문자열을 Integer 이라는 박스에 넣어둠
        // Integer -> int
        int intValue = integer1;
        // int -> Integer
        Integer integer2 = intValue;

        Integer.getInteger(str);


    }
}
