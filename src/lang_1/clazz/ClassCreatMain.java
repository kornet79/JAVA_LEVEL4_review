package immutable.lang_1.clazz;

public class ClassCreatMain {

    public static void main(String[] args) throws Exception{

        Class helloClass = Class.forName("lang.clazz.Hello");
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        // getDeclaredConstructor() : 생성자를 선택
        // newInstance() : 선택한 생성자를 기반으로 인스턴스를 생성한다.
        String result = hello.hello();
        System.out.println("result = " +result);

        Hello hello1 = new Hello();
        System.out.println(hello1.hello());
    }


}

/*
리플렉션 - reflection
Class를 사용해서 클래스와 메타 정보를 기반으로 클래스에 정의된 메서드, 빌드, 생성자 등을 조회 하고, 이들을 통해 객체 인스턴스를 생성하거나 메서드를 호출하는 작업을 할 수 있다.
이런 작업을 리플렉션이라고 한다.
 */
