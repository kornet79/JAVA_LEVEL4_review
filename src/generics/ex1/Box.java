package immutable.generics.ex1;

public class Box <T,U>{
    T item1;
    U item2;

    public Box(T item1, U item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void getItem1() {
        System.out.print("Item 1: " + this.item1 + " , ");
    }

    public void getItem2() {
        System.out.println("Item 2: " + this.item2);
    }

    public void displayItems() {
        getItem1();
        getItem2();
    }
}
