package immutable.lang_1.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    // 누군가가 임의로 바꾸는걸 방지하기 위해 final를 사용해 고정시킨다.
    private  int[] lottoNumbers;
    private  int cnt;

    public int[] generate() {
        lottoNumbers = new int[6];
        cnt = 0;
        while (cnt < 6) {
            int number = random.nextInt(45) + 1;

            if(isUnique(number)) {
                lottoNumbers[cnt] = number;
                cnt++;
            }

        }
        return lottoNumbers;
    }

    private boolean isUnique(int num) {
        for (int i = 0; i < cnt; i++) {
            if(lottoNumbers[i] == num) {
                return false;
            }
        }
        return true;
    }
}
