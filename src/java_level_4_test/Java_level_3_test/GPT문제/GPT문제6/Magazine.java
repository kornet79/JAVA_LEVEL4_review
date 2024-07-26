package Java_level_3_test.GPT문제.GPT문제6;

public class Magazine implements LibraryItem{
    private String magazine_title;
    private String publicationDate;
    private boolean isCheckedOut;

    public Magazine(String magazine_title, String publicationDate) {
        this.magazine_title = magazine_title;
        this.publicationDate = publicationDate;
        this.isCheckedOut = false;
    }

    @Override
    public void checkOut() {
        if(!isCheckedOut){
            isCheckedOut = true;
            System.out.println(magazine_title + "이(가) 대출 되었습니다.");
        } else {
            System.out.println(magazine_title + "이가 이미 대출중 입니다.");
        }
    }

    @Override
    public void returnItem() {
        if(isCheckedOut) {
            isCheckedOut = false;
            System.out.println(magazine_title + " 이(가) 반납 되었습니다.");
        } else {
            System.out.println(magazine_title + "이(가) 대출중이 아닙니다.");
        }
    }

    @Override
    public void getDescription() {
        System.out.println("잡지 재목: " + magazine_title + ", 발행 날짜: " + publicationDate);
    }
}
