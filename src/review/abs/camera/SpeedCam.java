package immutable.review.abs.camera;

public class SpeedCam extends Camera{
    // 구현되어 있지않은 메소드를 꼭 구현해야만 하기 떄문에 showMainFeature 구현한다.
    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

}
