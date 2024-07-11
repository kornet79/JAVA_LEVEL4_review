package immutable.enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();

        int vip = discountService.discount("VIP" , price);
        System.out.println("vip = " +vip);

        int diamond = discountService.discount("DIAMONDD", price);
        System.out.println("diamond = " + diamond);

        int gold = discountService.discount("gold" , price);
        System.out.println("gold = " + gold);

    }
}
// 문자열 상수를 사용해도 지금까지 발생한 문제를 근본적으로 해결할 수 없다.
// 왜냐하면 String 타입은 어떤 문자열이든 입력할 수 있기 때문이다.
// 어떤 개발자가 실수로 StringGrade에 있는 상수를 사용하지 않고, 위 처럼 직접 문자열을 사용해도
// 막을 수 있는 방법이 없다.
// 사용해야 하는 문자열 상수가 어디에 있는지 discount()를 호출하는 개발자는 알기 어렵다.
//

/*
문자열 상수를 사용한 덕분에 전체적으로 코드가 더 명확해졌다.
discount()에 인자를 전달할 때도 StringGrade가 제공하는 문자열 상수를 사용하면 된다.
만약 실수로 상수의 이름을 잘못 이렵하면 컴파일 시점에 오류가 발생한다.
따라서 오루를 쉽고 빠르게 찾을 수 있다.
 */
