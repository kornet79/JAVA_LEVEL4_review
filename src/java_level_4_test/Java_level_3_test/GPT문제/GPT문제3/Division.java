package Java_level_3_test.GPT문제.GPT문제3;

public class Division implements Operation{
    @Override
    public int calculate(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("분모는 0이될수 없습니다.");
        }
        return a/b;
    }

    @Override
    public void description() {
        System.out.println("나눗셈을 시작합니다.");
    }
}
