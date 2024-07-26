package Java_level_3_test.GPT문제.GPT문제8;

import java.util.IllformedLocaleException;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Operation[] operations = {
                new Addition(),
                new Subtraction(),
                new Multiplication(),
                new Division(),
                new Modulo()
        };

        System.out.println("사용할 연산을 선택하세요.");
        System.out.println("[1] : Addition (+)");
        System.out.println("[2] : Subtraction (-)");
        System.out.println("[3] : Multiplication (*) ");
        System.out.println("[4] : Division (/)");
        System.out.println("[5] : Modulo (%)");

        int chice = sc.nextInt();
        Operation operation = operations[chice - 1];

        System.out.println("첫번째 숫자를 입력하세요.");
        double a = sc.nextDouble();

        System.out.println("두번째 숫자를 입력하세요.");
        double b = sc.nextDouble();


        performCalculation(operation,a,b);

    }
    private static void performCalculation(Operation operation, double a, double b) {
        try {
            double result = operation.calculate(a,b);
            System.out.println("결과: " + result);
            operation.getDescription();
        } catch (ArithmeticException e) {
            System.out.println("에러: " + e.getMessage());
        }
    }
}
