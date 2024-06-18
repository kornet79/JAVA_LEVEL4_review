package lang.object.string;

public class StringSearchMain {
    // 문자열 검색

    public static void main(String[] args) {

        String str = "Helli, Java! Welcome to Java World";

        System.out.println("문자열에 'Java'가 포함되어 있는지: " + str.concat("Java"));
        System.out.println("'Java'의 천 번째 인덱스 : " + str.indexOf("Java"));
        System.out.println("인덱스 10부터 'Java'의 인덱스: "+ str.indexOf("Java",10));
        System.out.println("'Java'의 마지막 인덱스 : " + str.lastIndexOf("Java"));
    }
}
