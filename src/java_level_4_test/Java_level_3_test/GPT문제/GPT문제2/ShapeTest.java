package Java_level_3_test.GPT문제.GPT문제2;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape[] shapes = {
                new Rectangle(10,5),
                new Circle(7),
                new Triangle(10,5)
        };

        System.out.println("도형을 선택하세요");
        System.out.println("[1] : Rectangle");
        System.out.println("[2] : Circle");
        System.out.println("[3] : Triangle");

        int choice = sc.nextInt();

        // 호출하는 부분 작성2
        selectedShape(shapes[choice - 1]);
    }
    private static void selectedShape(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("면적 : " + area);

        if(shape instanceof Rectangle) {
            ((Rectangle) shape).description();
        } else if(shape instanceof Circle) {
            ((Circle) shape).description();
        } else if(shape instanceof Triangle) {
            ((Triangle)shape).description();
        }
    }
}
