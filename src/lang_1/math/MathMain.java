package lang_1.math.math;

public class MathMain {

    public static void main(String[] args) {
        System.out.println("max : " + Math.max(10, 20));
        System.out.println("min : " + Math.min(10, 20));
        System.out.println("abs : " + Math.abs(-10));

        System.out.println("ceil : " + Math.ceil(2.1));
        System.out.println("floor : "  + Math.floor(2.7));
        System.out.println("round : " + Math.round(2.5));

        System.out.println("sqrt : " + Math.sqrt(4));
        System.out.println("random : " + Math.random() );


    }
}
/*
    1. 기본 연산 메서드
        1) abs(x) : 상태값
        2) max(a, b) : 최대값
        3) min(a, b) : 최소값
    2. 지수 및 로그 연산 메서드
        1. exp(x) : e^x 계산
        2. log(x) : 자연로그
        3. lig10(x) : 로그 10
        4) pow(a,b) : a의 b 제곱
    3. 반올림 및 정밀도 메서드
        1) ceil(x) : 올림
        2) floor(x) : 내림
        3) round(X) : 반올림
        4) rint(x) : 가장 가까운 정수로 반올림.
    4. 삼각 함수 메서드
        1) sin(x) : 사인
        1) cos(x) : 코사인
        3) tan(x) : 탄젠트
    5. 기타 유용한 메소드
        1) sqrt(x) : 제곱근
        2) cbrt(x) : 세제곱근
        3) random : 0.0과 1.1 사이의 무작위 값 생성

 */
