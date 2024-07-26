package Java_level_3_test.GPT문제.GPT문제6;

public class Book implements LibraryItem{
    private String title;
    private String auth;
    private String ISBM;
    private boolean incheckOut;

    public Book(String title, String auth, String ISBM) {
        this.title = title;
        this.auth = auth;
        this.ISBM = ISBM;
        this.incheckOut = false;
    }

    @Override
    public void checkOut() {
        if(!incheckOut) {
            incheckOut = true;
            System.out.println(title + "은(는) 책을 대출 합니다.");
        } else {
            System.out.println(title + "은(는) 책은 이미 대출중 입니다.");
        }
    }

    @Override
    public void returnItem() {
        if(incheckOut) {
            incheckOut = false;
            System.out.println(title + "은(는) 을 반납합니다.");
        } else {
            System.out.println(title + "은(는) 대출중이 아닙니다.");
        }
    }

    @Override
    public void getDescription() {
        System.out.println("챚 제목 : " + title + ", 저자 : " + auth + ", ISBM : " + ISBM);
    }
}
