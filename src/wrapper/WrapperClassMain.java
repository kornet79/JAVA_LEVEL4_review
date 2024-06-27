package immutable.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer IntegerObj = Integer.valueOf(10);

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + IntegerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = "+  doubleObj);

        System.out.println("내부 값 일기");
        int intValue = IntegerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == IntegerObj));
        System.out.println("equals() : " + newInteger.equals(IntegerObj));
        // equals 는 실제 들어있는 값만 비교하기 때문에 동등성이 맞다 판단하여 true가 나오게 된다.
    }
}

/*
래퍼클래스 생성 - 박싱(Boxing)
- 기본형을 래퍼 클래스로 변경하는것을 마치 박스에 물건을 넣는것 같다고헤서 박싱(Boxing)이라 한다.
- new Integer(10) 은 사용하면 안된다. 현재까지 작동은 하지만, 향후 재거될 예정이다./
- 대신에 Integer.valueOf(10) 을 사용하면 된다.
- 성능 적인 면에서나 메모리적인 부분에서도 훨신 효율적이기 때문이다.
    -내부에서 new Intger(10)을 사용해서 객체를 생성하고 돌려준다.
  -추가로 Integer.valueOf() 에는 성능 최적화 기능이 있다.
   - 개발자들이 주로 사용한 -128 ~ 12 범위의 Integer 클래스를 미리 생성해준다.
   - 해당 범위의 값이 없으면 new Integer()을 호출한다.
    -마치 문자열 풀과 비슷하게 자주 사용하는 숫자를미리 생성해두고 재사용한다.
intValue() - 언박싱(Unboxing)
   -래퍼 클래스에 들어있는 기본형 값을 다시 꺼내는 메서드이다.
   - 박스에 들어있는 물건을 꺼내는 것 같다고 해서 언박싱 이라 한다.

비교는 equals() 사용
- 래퍼 클래스는 객체이기 때문 -- 비교를 하면 인스턴스의 참고값을 비교한다.
- 래퍼 클래스는 내부 비교하도록 equals()를 재정의해두었다. 따라서 값을 비교하려면 equals()를 사용해야 한다.

참고로 래퍼 클래스는 객체를 그대로 출력해도 내부에 있는 값을 문자로 출력하도록 toString() 재정의 했다.

 */
