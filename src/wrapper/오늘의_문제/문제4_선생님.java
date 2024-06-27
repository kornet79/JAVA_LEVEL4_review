package immutable.wrapper.오늘의_문제;

import java.util.*;

public class 문제4_선생님 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 듣지 모하는 사람의 수
        int M = sc.nextInt(); // 보지 못하는 사람의 수

        Set<String> nohear = new HashSet<>();
        for (int i = 0; i < N; i++) {
            nohear.add(sc.next()); // 듣지 못하는 사람의 이름을 hashset에 저장

        }
        // 듣지 못하고 보지 못하는 사람들의 이름을 List에 저장
        List<String> ans =new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            if(nohear.contains(name)); { // 입력 받은 이름이 set에 있는지 확인
                ans.add(name); // set에 이름이 있으면 이는 듣지 못하고 보지도 못하는 사람이다.
            }

        }
        // 이름 리스트 오름차순으로 정렬
        Collections.sort(ans);

        System.out.println(ans.size());
        for(String name : ans) {
            System.out.println(name);
        }

    }
}
