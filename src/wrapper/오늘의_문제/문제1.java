package immutable.wrapper.오늘의_문제;

import java.util.Scanner;

public class 문제1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Minset; // 최소값을 보관하는 변수
        int resultset; // 결과값과 비교해서 맞는지 확인하는 변수
        int[] N = {9,9,9,9}; // 내가 원하는 방 번호
        // 내가 입력한 방번호를 배열에 넣고 싶은 근데 몰라서 일단 임이로 넣고 풀자

        int[]sete = {1,2,3,4,5,6,7,8,9};
    }

    public static void findnumber(int[] sete,int[] N,int Minset) {
        for (int i = 0; i < N.length  ; i++) {
            for (int j = 0; j < sete.length; j++) {
                if(N[i] == sete[j]) { // 같은 숫자면 카운트해주기
                    Minset++;
                }else if((N[i] == 6) || (N[i] == 9)) {
                    Minset++;
                }
            }
        }
    }

}
