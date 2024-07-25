package Java_level_3_test.전에꺼;

public interface Sort {
    void ascending(int[] array);
    void descending(int[] array);
    default void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
    }
}
