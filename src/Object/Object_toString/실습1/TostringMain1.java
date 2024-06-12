package Object.Object_toString.실습1;

public class TostringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();  // Corrected syntax

        // toString 반환값 즉 오브젝트에서 받아온 toString 출력
        System.out.println(string);

        // object 직접 출력
        System.out.println(object);
    }
}
