package immutable.review.abs.camera;

import immutable.review.abs.inteface.Reportable;

public class NormalReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행 합니다.");
    }
}
