package immutable.generics.coffee;

import immutable.generics.user.User;
import immutable.generics.user.VIPUser;

public class CoffeeMain {
    public static void main(String[] args) {

        CoffeeByNumber c1 = new CoffeeByNumber(10);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("--------------------------------");

        CoffeeByname c3 = new CoffeeByname(11);
        c3.ready();

        CoffeeByname c4 = new CoffeeByname("박명수");
        c4.ready();
        System.out.println("--------------------------------");
        int c3Name =(int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4name);

//        c4name =(String) c3.name;
        System.out.println("--------------------------------");

        // 제네릭 클래스 사용
        Coffee<Integer> c5 = new Coffee<>(12);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("하하");
        c6.ready();
        String c6name = c6.name;
        System.out.println("주문 고객이름 : " + c6name);

        System.out.println("--------------------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("노홍철"));
        c7.ready();

        System.out.println("--------------------------------");

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("정형돈"));
        c8.ready();

        System.out.println("--------------------------------");
        orderCoffee("홍길동");
        orderCoffee("장발장","아메리카노");
    }

    public static <T> void  orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }
    // 제네릭 타입은 다중 제네릭 타입 메서드를 사용할때 타입은 , 로 구분한다.
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
