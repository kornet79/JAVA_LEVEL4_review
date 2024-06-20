package immutable.예제_문제.내가푼거;

import java.util.Scanner;

public class 문제2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int dcount = 0;

        String str1 = sc.next();
        String str2 = sc.next();

        char[] strChar1 = str1.toCharArray();
        char[] strChar2 = str2.toCharArray();
        for (int i = 0; i < strChar1.length; i++) {
            for (int j = 0; j < strChar2.length; j++) {
                if(strChar1[i] == strChar2[j]) {
                    count++;
                } else {
                    dcount++;
                }
            }

        }
        System.out.println(strChar1.length + count);

    }

}
