package immutable.review.extend;

public class ShrimpBurger extends Hamburger{
    public ShrimpBurger() {
        super("새우버거");
    }
    public void  cook() {
        // 부모의 메소드를 사용하기 위해서 먼저 호출을 해주것이 중요하다!
        super.cook();
        System.out.println("+ 새우");
    }
}
