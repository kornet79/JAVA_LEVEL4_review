package Java_level_3_test.GPT문제.GPT문제2;

public class Triangle implements Shape{
    private  double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height ) / 2;
    }

    public void description() {
        System.out.println("이 도형은 삼각형입니다.");
    }

}
