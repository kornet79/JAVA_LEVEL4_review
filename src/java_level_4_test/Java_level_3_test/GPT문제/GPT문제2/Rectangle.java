package Java_level_3_test.GPT문제.GPT문제2;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public void description() {
        System.out.println("이 도형은 직사각형 입니다.");
    }
}
