package immutable.예제_문제.쌤이푼거;

import java.util.Scanner;

public class 문제2_쌤 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int[] cntA = getAlphabetCnt(a);
        int[] cntB = getAlphabetCnt(b);

        int ans = 0;
        for(int i=0;i<26;i++) {
            ans += Math.abs(cntA[i] - cntB[i]);
        }
        System.out.println(ans);

    }
    public static int[] getAlphabetCnt(String str) {
        int[] alphabetCnt = new int[26];
        for (int i = 0;i < str.length(); i++) {
            alphabetCnt[str.charAt(i)-'a']++;

        }
        return alphabetCnt;
    }
}
