package Java_level_3_test.GPT문제.GPT문제7;

public class Microwave implements Appliance{
    private String E_brend;
    private int Volume;
    private boolean isTurn;

    public Microwave(String e_brend, int volume) {
        E_brend = e_brend;
        Volume = volume;
        this.isTurn = false;
    }

    @Override
    public void turnOn() {
        if(!isTurn) {
            isTurn = true;
            System.out.println(E_brend + " 의 전원을 킵니다.");
        } else {
            System.out.println(E_brend + " 의 전원은 이미 켜져 있습니다.");
        }
    }

    @Override
    public void turnOFF() {
        if(isTurn) {
            isTurn = false;
            System.out.println(E_brend + " 의 전원을 끕니다.");
        } else  {
            System.out.println(E_brend + " 의 전원은 이미 꺼져 있습니다.");
        }
    }

    @Override
    public void getDescription() {
        System.out.println("전자래인지의 브랜드: " + E_brend + ", 용량: " + Volume);
    }
}
