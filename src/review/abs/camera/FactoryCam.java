package immutable.review.abs.camera;


import immutable.review.abs.inteface.Detectable;
import immutable.review.abs.inteface.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    @Override
    public void showMainFeature() {
        System.out.println("화재 감지!!!비~~~~상!!!!");
    }

    @Override
    public void detect() {
        // 추가 메소드는 넘어가도록 하자
        System.out.println("감지 기능을 수행합니다.");
    }

    @Override
    public void report() {
        System.out.println("신고 기능을 수행합니다.");
    }

    public void setDetector(Detectable detector) {
        System.out.println(detector + "감지!! 감지!!");
    }

    public void setReporter(Reportable reporter) {
        System.out.println(reporter + "신고!! 신고!!");
    }
}
