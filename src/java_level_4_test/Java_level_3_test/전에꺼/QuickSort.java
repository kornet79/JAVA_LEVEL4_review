package Java_level_3_test.전에꺼;

public class QuickSort implements Sort{
    private String name = "QuickSort";

    @Override
    public void ascending(int[] array) {
        System.out.println(name + " ascending");
    }

    @Override
    public void descending(int[] array) {
        System.out.println(name + " descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println(name + "입니다.");
    }
}
