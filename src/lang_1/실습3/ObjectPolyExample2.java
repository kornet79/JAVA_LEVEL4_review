package lang_1.실습3;

public class ObjectPolyExample2 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();

        Object object = new Object();

        Object[] objects = {dog,car,object};
        size(objects);

    }
    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수: " + objects.length);
    }
}
