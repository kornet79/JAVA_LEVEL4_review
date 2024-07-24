package immutable.문제.날짜_07_24;

import java.util.Scanner;

public class Editor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int Try = sc.nextInt();

        for (int i = 0; i < Try; i++) {
            String commend = sc.next();
            if(commend.equals("L")) {
                
            }if(commend.equals("D")) {

            }
            if(commend.equals("B")) {

            }
            if(commend.equals("P")) {

            }
        }

    }

    public void Left() {

    }
    public void Right() {

    }
    public void Delete() {

    }
    public void ADD() {

    }
}
/*
문제 풀이
간단한 문서편집기를 구현하는것!
조건! : 600000글자까지 입력가능
특징 : 커서라는것이 있는데 요놈은 첫문장 앞, 마지막 문작 뒤 또는 중간 2개의
연속된 문장 사이에 위치 할수 있다.
처음에 위치 대한 명령어를 입력하지 않고 입력시 자동으로 맨뒤에 커서가 이동되며
그자리에 입력이 된다.

풀이 과정 :
입력 받은 문자열을 배열에 가두고 index의 특징을 이용해 문제를 풀것
 */