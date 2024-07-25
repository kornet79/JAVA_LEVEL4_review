package Java_level_3_test.GPT문제.GPT문제3;

public class Addition implements Operation{
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

    @Override
    public void description() {
        System.out.println("덧셈을 시작합니다.");
    }
}
