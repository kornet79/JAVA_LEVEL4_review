package Java_level_3_test.GPT문제.GPT문제2;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void description() {
        System.out.println("이 도형은 원입니다.");
    }
}
