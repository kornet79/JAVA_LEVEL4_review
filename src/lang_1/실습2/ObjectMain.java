package lang_1.실습2;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        System.out.println(child.toString());
    }
}
