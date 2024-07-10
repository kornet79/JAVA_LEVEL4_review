package wrapperC.test;

public class WrapperTest2 {

    public static void main(String[] args) {

        String[] array = {"1.5","2.5","3.0"};

        // 배열에 입력된 모든 숫자의합을구하시오.
        // 숫자는 double형이 입력될 수 있다.

        double sum = 0;

        for (String s : array) {
            double i = Double.parseDouble(s);
            sum +=i;
        }
        System.out.println(sum);
    }
}
