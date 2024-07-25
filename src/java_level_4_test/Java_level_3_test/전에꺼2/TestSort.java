package Java_level_3_test.전에꺼2;

import java.util.Scanner;

public class TestSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sort[] sort = {new BubbleSort(), new HeapSort(), new QuickSort()};

        int[] nums = new int[5];

        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("[1] : BubbleSort");
        System.out.println("[2] : HeapSort");
        System.out.println("[3] : QuickSort");

        int choice = sc.nextInt();

        selectSort(sort[choice-1],nums);

    }
    private static void selectSort(Sort sort,int[] array) {
        sort.ascending(array);
        sort.descending(array);
        sort.Description();
    }

}
