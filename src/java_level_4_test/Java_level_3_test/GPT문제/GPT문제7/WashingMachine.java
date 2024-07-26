package Java_level_3_test.GPT문제.GPT문제7;

public class WashingMachine implements Appliance{
    private String W_brand;
    private int Volume;
    private boolean isTurn;

    public WashingMachine(String w_brand, int volume) {
        W_brand = w_brand;
        Volume = volume;
        this.isTurn = false;
    }

    @Override
    public void turnOn() {
        if(!isTurn) {
            isTurn = true;
            System.out.println(W_brand + " 의 전원을 킵니다.");
        } else {
            System.out.println(W_brand + " 의 전원이 이미 켜져 있습니다.");
        }
    }

    @Override
    public void turnOFF() {
        if (isTurn) {
            isTurn = false;
            System.out.println(W_brand + " 의 전원을 끕니다.");
        } else {
            System.out.println(W_brand + " 의 전원은 이미 꺼져있습니다.");
        }
    }

    @Override
    public void getDescription() {
        System.out.println("세탁기의 브랜드: " + W_brand + ", 용량 "  + Volume);
    }
}
