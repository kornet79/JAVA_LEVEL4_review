package immutable.review.abs;

import immutable.review.abs.camera.Camera;
import immutable.review.abs.camera.FactoryCam;
import immutable.review.abs.camera.SpeedCam;

public class ReviewAbstractClass {
    public static void main(String[] args) {
//        Camera camera = new Camera(); : 추상 클래스는 인스턴스화 할수 없다.
        Camera factoryCam = new FactoryCam();
        factoryCam.showMainFeature();
        Camera speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
