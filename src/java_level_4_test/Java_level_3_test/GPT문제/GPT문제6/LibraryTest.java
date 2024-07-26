package Java_level_3_test.GPT문제.GPT문제6;

import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryItem[] items = {
                new Book("자바의 정석","남궁성","123456789"),
                new Magazine("타임","2023-07-01"),
                new DVD("인셉션","크리스토퍼 놀란",148)
        };

        System.out.println("도서관 아이템을 선택하세요.");
        System.out.println("[1] : Book");
        System.out.println("[2] : Magazine");
        System.out.println("[3] : DVD");

        int choice = sc.nextInt();

        LibraryItem selectedItem = items[choice - 1];

        System.out.println("작업을 선택하세요.");
        System.out.println("[1] : 대출");
        System.out.println("[2] : 반납");
        System.out.println("[3] : 설명 보기");

        int action = sc.nextInt();

        if (action == 1) {
            selectedItem.checkOut();
        } else if (action == 2) {
            selectedItem.returnItem();
        } else if (action == 3) {
            selectedItem.getDescription();
        } else {
            System.out.println("잘못된 선택입니다.");
        }

    }
}
