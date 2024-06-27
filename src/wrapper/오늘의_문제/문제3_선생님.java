package immutable.wrapper.오늘의_문제;

import java.util.Arrays;
import java.util.Scanner;

public class 문제3_선생님 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T--> 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            // N 과 M 에 입력값을 받음

            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();

            }
            int[] b = new int[N];
            for (int i = 0; i < M; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int ans = 0;
            for(int i=0;i<N;i++) {
                for(int j=0;i<N;j++) {
                    if(b[j] < a[i]) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);


        }
    }
}
