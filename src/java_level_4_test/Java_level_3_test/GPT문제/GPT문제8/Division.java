package Java_level_3_test.GPT문제.GPT문제8;

public class Division implements Operation{
    @Override
    public double calculate(double a, double b) {
        if(b == 0) {
            System.out.println("0이 분모가 될수 없습니다.");
        }
        return a / b;
    }

    public void getDescription() {
        System.out.println("나누기를 시작합니다.");
    }
}
