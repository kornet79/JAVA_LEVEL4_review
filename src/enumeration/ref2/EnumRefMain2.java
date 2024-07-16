package immutable.enumeration.ref2;


public class EnumRefMain2 {

    public static void main(String[] args) {
        
        int price = 10000;

        DisCountService discountService = new DisCountService();
        int basic = discountService.discount(Grade.BASIC,price);

        System.out.println("basic = " + basic);
    }
}
