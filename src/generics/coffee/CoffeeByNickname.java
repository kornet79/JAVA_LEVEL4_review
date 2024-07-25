package immutable.generics.coffee;

public class CoffeeByNickname {
    public String nicename;

    public CoffeeByNickname(String nicename) {
        this.nicename = nicename;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + nicename);
    }
}
