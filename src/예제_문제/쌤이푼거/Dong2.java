package test;

import java.util.Arrays;
import java.util.Scanner;

public class Dong2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();

        int[] cost = new int[N];
        int[] budget = new int[M];

        for(int i=0; i<N; i++) {
            cost[i] = sc.nextInt();
        }

        for(int i=0; i<M; i++) {
            budget[i] = sc.nextInt();
        }
        // 정렬 단계.
        Arrays.sort(cost);
        Arrays.sort(budget);
        // 이진 탐색의 꼭 필요한 조건은 정렬이 되어 있다는 가정에 진행한다.

        int l = 0, r = Math.min(N, M), ans = 0;
        while(l <= r) {
            // 절반식 잘라서 범위를 줄이기 위한 코드
            int m = (l + r) /2; // l + r의 값이 int의 범위를 넘어설 때는 사용하면 안됨.
            if(cale(cost, budget, m) <= X) {
                ans = m;
                l = m +1;
            } else {
                r = m - 1;
            }
        }
        System.out.println(ans);

    }
    static long cale(int[] cost , int[] budget, int assignCount) {
        long needAmount = 0;
        for (int i = 0; i < assignCount; i++) {
            needAmount += Math.max(cost[i] - budget[budget.length - assignCount+i],0);

        }
        return needAmount;
    }
}
