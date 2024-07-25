package Java_level_3_test.전에꺼2;

public class BubbleSort implements Sort{
    private String name = "BubbleSort";
    @Override
    public void ascending(int[] array) {
        System.out.println(name + " ascending");
    }

    @Override
    public void descending(int[] array) {
        System.out.println(name + " descending");
    }

    @Override
    public void Description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        System.out.println(name + "입니다.");
    }
}
