package lang_1.math.math.test;

import java.util.Random;

public class LottoGenerator {
    //generate 라는 함수를 받아와서 6가지의 랜덤한 수를가져오는 함수를 생성한다.
    Random random = new Random();
    int[] loto = new int[6];
    int generate() {
        for (int i = 0; i < loto.length; i++) {
            loto[i] = random.nextInt(45) + 1;


        }

    }
}
