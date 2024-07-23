package immutable.review.extend;

public class CheeseBurger extends Hamburger{

    public CheeseBurger() {
        super("치즈버거");
        // 부모의 필드값을 이용하는게 중요하다
    }

    public void cook() {
        // 부모의 메소드를 사용하기위해 부모의 필드값에 super를 사용한다.
        super.cook();
        System.out.println("+ 치즈");
    }
}
