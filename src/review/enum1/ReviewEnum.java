package immutable.review.enum1;



public class ReviewEnum {

    public static void main(String[] args) {
        Resolution resolution = Resolution.HD;
        System.out.println("resolution = " + resolution);
        
        resolution = Resolution.FHD;
        System.out.println("resolution = " + resolution);

        System.out.println("동영상 녹화 품질: ");
        switch (resolution) {
            case HD :
                System.out.println("일반 화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초 고화질");
                break;
        }
        
        resolution = Resolution.valueOf("UHD");
        System.out.println("resolution = " + resolution);

        System.out.println("----------------------");

        for(Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal() );
            // name 은 이름을 가져오고 ordinal 는 순서를 출력해준다.
        }

        System.out.println("----------------------");

        for(Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth() );
            // name 은 이름을 가져오고 우리가 enum에서 만든 메서드인 getWidth을 불러와 사이즈도 출력해준다.
        }
                    
    }

}

enum Resolution {
    HD(1280),
    FHD(1920),
    UHD(3840);

    // 변수와 인자값을 늘 함수 와 변수를 생성
    private final int width;

    Resolution(int width) {
        this.width = width;
    }

    // 값을 볼수 있게 게터 생성

    public int getWidth() {
        return width;
    }
}
