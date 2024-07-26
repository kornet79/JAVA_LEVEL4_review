package level3_test_시험;

public class SUV implements Maintenance{
    private String name = "SUV";

    @Override
    public void checkEngine() {
        System.out.println(name + " 엔진 점검");
    }

    @Override
    public void checkBrakes() {
        System.out.println(name + " 브레이크 점검");
    }

    @Override
    public void checkTires() {
        System.out.println(name + " 타이어 점검");
    }

    @Override
    public void description() {
        System.out.println("차량 정비가 완료되었습니다.");
        System.out.println(name + "의 정비결과는 정상입니다.");
    }
}
