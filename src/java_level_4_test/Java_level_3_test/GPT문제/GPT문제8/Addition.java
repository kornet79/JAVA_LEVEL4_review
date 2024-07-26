package Java_level_3_test.GPT문제.GPT문제8;

public class Addition implements Operation{
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
    public void getDescription() {
        System.out.println("더하기를 시작합니다.");
    }
}
