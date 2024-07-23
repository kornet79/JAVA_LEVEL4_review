package immutable.review.abs.camera;

import immutable.review.abs.inteface.Detectable;

public class AccidentDetector implements Detectable {
    @Override
    public void detect() {
        System.out.println("교통 사고를 감지합니다.");
    }
}
