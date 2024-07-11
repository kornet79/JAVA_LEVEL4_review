package immutable.enumeration.ex0;

public class DiscountService {

    public int discount(String grade,int price) {


        int discountPercent = 0;

        if (grade.equals("BASIC")) {
            discountPercent = 10;
        } else if(grade.equals("GOLD")) {
            discountPercent = 20;
        } else if(grade.equals("DIAMOND")) {
            discountPercent = 30;
        } else {
            System.out.println("똑바로 입력하셈.");
        }
      return discountPercent*10;
    }
}


/*
고객은 3등급으로 나누고, 상품 구매시 등급별로 할인을 적용한다. 할인시 소수점 이하는 버린다.
1. BASIC: 10% 하인
2. GOLD : 20% 할인
3. DIAMOND : 30 할인
회원 등급과 가격을 입력하면 할인 금액을 계산해주는 클래스를 만들어보자.
예를 등러 GOLD, 10000 을 입력하면 할인 대상 금액인 2000 을 반환한다.
 */
