package Java_level_3_test.GPT문제.GPT문제7;

import java.util.Scanner;

public class ApplianceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Appliance[] items = {
                new WashingMachine("규민 세탁기",10),
                new Refrigerator("민성 냉장고",15),
                new Microwave("성준 전자래인지",5)
        };



        System.out.println("사용할 가전재품을 고르세요!");
        System.out.println("-----------------------");
        System.out.println("[1] : 세탁기 ");
        System.out.println("[2] : 냉장고");
        System.out.println("[3] : 전자래인지");
        System.out.println("-----------------------");

        int chice = sc.nextInt();

        Appliance appliance = items[chice -1];

        System.out.println("작업을 선택하세요.");
        System.out.println("[1] : 전원 켜기");
        System.out.println("[2] : 전원 끄기");
        System.out.println("[3] : 설명 보기");

        int action = sc.nextInt();

        if(action == 1) {
            appliance.turnOn();
        } else if(action == 2) {
            appliance.turnOFF();
        } else if(action == 3) {
            appliance.getDescription();
        } else {
            System.out.println("잘못된 선택 입니다.");
        }

    }
}
