package immutable.예제_문제.쌤이푼거;

import java.util.Scanner;

public class 문제_4쌤 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine();
        String word = sc.nextLine();
        int startIdx = 0;
        int cnt = 0;

        while (true) {
            // indexOf() : 특성 문자나 문자열이 앞에서부터 처음 발견되는인덱스를 반환하며
            // 만약 찾지 못했음 -1 을 반환한다.
            int findidx = doc.indexOf(word, startIdx);
            if (findidx < 0) {
                break;
            }
            // ------abababab
            // aba------9  ->
            startIdx = findidx + word.length();
            cnt++;

        }
        System.out.println(cnt);
    }
}
