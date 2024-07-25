package immutable.generics.coffee;

public class Coffee <T>{
    public T name;

    public Coffee(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완려 : " + name);
    }
}
