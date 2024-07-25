package Java_level_3_test.GPT문제.GPT문제3;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Operation[] operation = {
                new Addition(),
                new Subtraction(),
                new Multiplication(),
                new Division()
        };


        System.out.println("사용할 기호를 선택하시오");
        System.out.println("[1] : + ");
        System.out.println("[2] : - ");
        System.out.println("[3] : * ");
        System.out.println("[4] : / ");

        int choice  = sc.nextInt();

        System.out.println("첫 번쨰 숫자를 입력하세요");
        int a = sc.nextInt();

        System.out.println("두 번쨰 숫자를 입력하세요");
        int b = sc.nextInt();

        selectCalculator(operation[choice-1],a,b );


    }
    private static void selectCalculator(Operation operation,int a, int b) {
        try{
            operation.description();
            int result = operation.calculate(a, b);
            System.out.println("결과: " + result);

        } catch (ArithmeticException e) {
            System.out.println("에러: " +  e.getMessage());
        }
    }
}
