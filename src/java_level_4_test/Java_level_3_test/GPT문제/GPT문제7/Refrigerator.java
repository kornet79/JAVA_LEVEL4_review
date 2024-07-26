package Java_level_3_test.GPT문제.GPT문제7;

public class Refrigerator implements Appliance{
    private String L_brand;
    private int Volume;
    private boolean isTurn;

    public Refrigerator(String l_brand, int volume) {
        L_brand = l_brand;
        Volume = volume;
        this.isTurn = false;
    }

    @Override
    public void turnOn() {
        if(!isTurn) {
            isTurn = true;
            System.out.println(L_brand + " 의 전원을 킵니다.");
        } else {
            System.out.println(L_brand + "전원은 이미 켜져 있습니다.");
        }
    }

    @Override
    public void turnOFF() {
        if(isTurn) {
            isTurn = false;
            System.out.println(L_brand + " 의 전원을 끕니다.");
        } else {
            System.out.println(L_brand + " 의 전원은 이미 꺼져 있습니다.");
        }
    }

    @Override
    public void getDescription() {
        System.out.println("냉장고의 브랜드 : " + L_brand + " , 용량: " + Volume);
    }
}
