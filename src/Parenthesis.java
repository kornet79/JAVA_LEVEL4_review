package immutable.문제.날짜_07_24;

import java.util.Scanner;

public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // T입력
        int total = 0; // 점수 0
        String[] list = new String[T]; // 입력받는 list
        String[] printlist = new String[T]; // 출력문 list


        for (int i = 0; i < list.length; i++) {
                list[i] = sc.next();
                // 입력받는 부분
                // ---------------------------
            if(list[i].equals("(")) {
                total++; // 점수를 더해주는 방법
            } else {
                total--; // 점수를 빼주는 방법
            }

                if(total == 0) { // 점수가 0일시
                    printlist[i] += "YES";
                } else { // 점수가 0이 아닐시
                    printlist[i] += "NO";
                }
                // 마지막에 점수를 초기화 시켜 다음 라인에 진행을 도와준다.
                total = 0;
        }
        // 마지막 출력문
        for (int i = 0; i < list.length; i++) {
            System.out.println(printlist[i]);
        }

    }
}
// 해결 방법 )  total 에 점수 1을 더해주고 ( -1 을 해준다
// 만약 라인이 끝날동안 total이 0이라면 YES를 아니면 NO를 넣어준다.
// 하지만 이럴경우 모든 문자열을 검사해야하기 때문에 시간이 오래걸린다는 단점이 존재한다.
// 즉 이중 배열을 사용하여 풀수 있다.
// 문제!) 여기서 규민이는 입력받은 값을 이중배열 배열하나하나에 넣어주는것을 모른다.
// 최적화 방법 굳이 전에 있던 기록을 보관할 필요가 없다
// 점수와 동시에 배열을 초기화 하고 불필요한 메모리 낭비를 줄일수 있다.
// 전 -- 입 -> 저 -> 검 -> 출 || 후 -- 입 -> 검 -> 저 -> 초

// 모르는 부분 : 1.  갑자기 배열 앞에 null이 붙어서 나옴
// 2. 내가 입력한 값을 하나하나 나누는 법을 모르겠음.