package immutable.enumeration.test.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N, K 를 정수형으로 입력 받음.
        int N = sc.nextInt();
        int K = sc.nextInt();
        int startnum = 0;
        // N만큼 배열을 만듬
        int[] USAPUS = new int[N];

        // 배열의 값을 넣어서 순서를 구하는 문
        for (int i = 0; i < USAPUS.length; i++) {
            startnum++;
            USAPUS[K] = startnum;
            K += K;
            if(K < USAPUS.length) {
            }
        }


        // 출력문
        for (int i = 0; i < USAPUS.length; i++) {
            System.out.print(USAPUS[i] + " ,");
        }

    }
}
