package immutable.review.abs.camera;

import immutable.review.abs.inteface.Reportable;

public class VideoReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("직전 30초 영상과 함께 신고를 진행 합니다.");
    }
}
