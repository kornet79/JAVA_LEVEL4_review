package immutable.wrapper;

public class MyIntegerNullMain01 {

    public static void main(String[] args) {

        Myinteger[] intArr = {new Myinteger(-1),new Myinteger(0), new Myinteger(1) };

        System.out.println(findValue(intArr,-1));
        System.out.println(findValue(intArr,0));
        System.out.println(findValue(intArr,1));
        System.out.println(findValue(intArr,100));


    }
    private static Myinteger findValue(Myinteger[] intArr, int target) {
        for(Myinteger myinteger : intArr) {
            if(myinteger.getValue() == target) {
                return myinteger;
            }
        }
        return null;
    }
}
