package immutable.address;

public class PrimitiveMain {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("20 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //A와 B는서로 독립적인 공간을가지고 있다.
    }
}

/*
기본형과 참조형의 공유
1. 기본형 : 하나의 값을여러 변수에서 절대로 공유하지 않는다.
2. 참조형: 하나의 객체를 참조값을 통해 여러 변수에서 공유할 수 있다.
 */

