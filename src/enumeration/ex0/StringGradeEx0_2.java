package immutable.enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();


        int vip = discountService.discount("VIP" , price);
        System.out.println("vip = " +vip);

        int diamond = discountService.discount("DIAMOND", price);
        System.out.println("diamond = " + diamond);

        int gold = discountService.discount("gold" , price);
        System.out.println("gold = " + gold);

        // 단순히 문자열을 입력하는 방식은 오타가 발생하기 쉽고, 유효하지 않는 값이 입력할 수 있는 문제저이 있다!

        // 등급에 문자열을 사용하는 위의 방식은 다음과 같은 문제가 있다!!
        // -타입 안정성 부족 : 문자열은 오타가 발생하기 쉽고, 유효하지 않은 값이 입력될 수 있다.
        // - 데이터 일관성 : "GOLD", "gold", "Gold" 등 다양한 형식으로 문자열을 입력할 수 있어 일관성이 떨어진다.
        // -컴파일시 오류 감지 불가 : 이러한 잘못된 값은 컴파일시에 감지되지 않고, 런타임에서만 문제가 발견디기 때문에
        // 디버깅이 어렵다.





    }
}
