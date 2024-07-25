package immutable.generics.coffee;

public class CoffeeByname {
    public Object name; // Integer, Double, String, ...

    public CoffeeByname(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
