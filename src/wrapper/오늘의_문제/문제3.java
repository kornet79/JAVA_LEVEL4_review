package immutable.wrapper.오늘의_문제;

import java.util.Scanner;

public class 문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] list = new int[T];
        for (int i = 0; i < T; i++) {
            list[i] = sc.nextInt();
            System.out.print(list[i]);

        }
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < list[i]; j++) {
                int[] A = new int[list[i]];
                A[j] = sc.nextInt();
                System.out.println(A[j]);
            }
        }



    }
}
