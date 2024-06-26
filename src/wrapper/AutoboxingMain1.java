package immutable.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        // Primaitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue =  " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
/*
boxing : valueOf()
unboxing : xxxValue : 앞에 xxx는 기본타입을 말한다.

-개발자들이 오랜기간 개발을 하다 보니 기본형을 래퍼 클래스로 변환하거나  또는
래퍼 클래스로 기본형을 변환하는 일이 자주 발생한다.
- 자바는 1.5부터 오토 박싱, 오토 언박싱을 지원한다.
 */
