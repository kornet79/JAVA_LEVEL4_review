package immutable.wrapper.오늘의_문제;

import java.util.Scanner;

public class 문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] Strarry = new String[N];
        for (int i = 0; i < N; i++) {
            Strarry[i] = sc.next();
            System.out.println(Strarry[i]);
        }

    }


}
