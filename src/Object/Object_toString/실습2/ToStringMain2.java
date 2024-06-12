package Object.Object_toString.실습2;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Modely");
        Dog dog1 = new Dog("쿠키", 5);
        Dog dog2 = new Dog("쇄리",2);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        // Object 아레 상속되어 있지 않으면 내가 만든
        // toString으로 받음
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
