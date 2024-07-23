package immutable.review.extend;

public class HamBurgerMain {
    public static void main(String[] args) {
        Hamburger[] hamburgers = {new Hamburger(), new CheeseBurger(), new ShrimpBurger()};

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("--------------------");
        for (Hamburger hamburger : hamburgers) {
            hamburger.cook();
            System.out.println("--------------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");

    }
}
