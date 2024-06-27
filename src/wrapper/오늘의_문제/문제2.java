package immutable.wrapper.오늘의_문제;

import java.util.Random;
import java.util.Scanner;

public class 문제2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int strike, ball;

        Random r = new Random();
        int[]com = new int[3];
        // com 이라는 배열의 3가지 숫자를 랜덤으로 넣어줌
        for (int i = 0; i < com.length; i++) {
            com[i] = Math.abs(r.nextInt() % 9 ) + 1;
            System.out.print(com[i]);
        }
        // 이제 게임 시작
        for (int i = 0; i < count; i++) {

        }





    }


}
