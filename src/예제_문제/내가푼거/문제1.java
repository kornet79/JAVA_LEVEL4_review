package immutable.예제_문제.내가푼거;

import java.util.Scanner;

public class 문제1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
        for (char c : strCharArray) {
            if ((c == 'W')) {
                c = 'w';
            } else if(c == 'A') {
                c = 'a';
            } else {

            }
            System.out.print(c);

        }




    }
    private static void String(String str) {

    }
}
