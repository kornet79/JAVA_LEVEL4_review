package level3_test_시험;

import java.util.Scanner;

public class MaintenanceTest{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 객체화 부분 작성1
        Maintenance[] maintenances = {
                new Sedan(),
                new SUV(),
                new Truck()
        };

        System.out.println("차량 종류를 선택하세요.");
        System.out.println("[1] : Sedan");
        System.out.println("[2] : SUV");
        System.out.println("[3] : Truck");

        int choice = sc.nextInt();

        // 호출하는 부분 작성2
        selectedMaintenance(maintenances[choice - 1]); // index 가 0 부터 시작하기 때문에 입력값에 -1을 해줘야한다.

    }

    private static void selectedMaintenance(Maintenance maintenance) {
        // 메서드 본문 작성4
            maintenance.checkEngine(); // 엔진 메소드 호출 부분
            maintenance.checkBrakes(); // 브레이크 메소드 호출 부분
            maintenance.checkTires(); // 타이어 메소드 호출 부분
            maintenance.description(); // 정비 설명 메소드 호출 부분

    }

}
