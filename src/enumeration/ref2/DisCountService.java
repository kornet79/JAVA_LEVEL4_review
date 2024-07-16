package immutable.enumeration.ref2;

public class DisCountService {

    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent()/100;
    }
}
