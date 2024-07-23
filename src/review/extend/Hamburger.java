package immutable.review.extend;

public class Hamburger {
    // 부모의 생성자,필드,메소드 등 모든것을 활용하여 클래스를 단편화 시키는것이 가장큰 장점이다.


    //이름을 담기 위한 name이라는 변수를 만들어준다.
    public String name;

    public Hamburger() {
        this.name = "햄버거";
    }

    public Hamburger(String name) {
        this.name = name;
    }

    // cook 이라는 햄버거 만들기 함수를 하나 만들어준다.
    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
        // 일단 3가지 값을 저장할 배열을 생성

    }

}
