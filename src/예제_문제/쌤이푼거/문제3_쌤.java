package immutable.예제_문제.쌤이푼거;

import java.util.Scanner;

public class 문제3_쌤 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();
        int[] cnt = new int[26];

        for(int i=0; i<str.length(); i++) {
            cnt[str.charAt(i) - 'A']++;
            // A~z 까지의 알파벳을 담음
        }

        int maxCnt = 0;
        char maxAlphabet = '?';
        for(int i=0; i<26; i++) {
            if(cnt[i] > maxCnt) {
                maxCnt = cnt[i];
                maxAlphabet = (char)('A' + i);
                // 이러면 'A' + 1 식 더해서 값을 구함
            } else if(cnt[i] == maxCnt) {
                maxAlphabet = '?';

            }
        }
        System.out.println(maxAlphabet);
    }
}
