package immutable.예제_문제.쌤이푼거;

import java.util.Scanner;

public class 문제_5쌤 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] current = sc.next().split(":");
        String[] target = sc.next().split(":");

        int currentHour = Integer.parseInt(current[0]);
        int currentMinute = Integer.parseInt(current[1]);
        int currentSecond = Integer.parseInt(current[2]);

        int targetHour = Integer.parseInt(current[0]);
        int targetMinute = Integer.parseInt(current[1]);
        int targetSecond = Integer.parseInt(current[2]);

        int currentSecondAmout = currentHour * 3600 + currentMinute * 60 + currentSecond;
        int targetSecontAmout = targetHour * 3600 + targetMinute * 60 + targetSecond;

        int needSecondAmount = targetSecontAmout - currentSecondAmout;
        if(needSecondAmount <= 0) needSecondAmount += 24 * 3600;

        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecount = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour,needMinute,needSecount);





    }
}
