package immutable.wrapper.오늘의_문제;

import java.util.Scanner;

public class 문제1_선생님 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] cnt = new int[10];
        while (N > 0) {
            cnt[N%10]++;
            N = N/10;
        }

        int ans = (cnt[6] + cnt[9] + 1) / 2;
        for(int i=0;i<9; i++) {
            if(i !=6 ) {
                ans = Math.max(ans,cnt[i]);
            }
        }
        System.out.println(ans);
    }
}
