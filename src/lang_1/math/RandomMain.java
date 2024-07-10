package lang_1.math.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

//        Random random = new Random();
        Random random = new Random(1);

        int randomInt = random.nextInt();
        // int 값 범위 안에서 랜덤으로 나온다.
        System.out.println("randomInt : " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble : " + randomDouble); // 0.0d ~ 1.0d
        
        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        int randomRange1 = random.nextInt(10);
        System.out.println("randomRangei = " + randomRange1);
        int randomRange2 = random.nextInt(10)+1;
        System.out.println("randomRangei = " + randomRange2);
    }
}
/*
씨드 - Seed
랜덤은 내부에서 씨드값을 사용해서 랜덤값을 구한다.
그런데 이씨드 값이 같으면 항상 같은 결과가 출력된다.
new Random() : 생성자를 비워두면 내부에서 System.nanoTime() 에 여러가지 복잡한 알고리즘을 섞어서 씨드값을 생성한다.
따라서 반복 실행해도 결과가 항상 달라진다.
new Rando,(int seed) : 생성자에 씨드값을 직접 전달할 수 있다. 씨드 값이 같으면 여러번 실행해도 실행결과 같다.
이렇게 씨드 값을 직접 사용하면 결과 값이 항상 같기 때문에 결과가 달라지는 랜덤값을 구할 수 없다.
하지만 결과가 고정되기 때문에 테스트 코드 같은 곳에서 같은 결과를 검증할 수 없다.
참고로 마인크래프트 같은 게임은 게임을 시작할 때 지형을 랜덤으로 생성핟는데, 같은 씨드값을 설정하면 같은 지형을 생성할 수 있다.
 */
