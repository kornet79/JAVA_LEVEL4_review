package Java_level_3_test.GPT문제.GPT문제6;

public class DVD implements LibraryItem{
    private String movie_title;
    private String director;
    private int movie_time;
    private boolean incheckOut;

    public DVD(String movie_title, String director, int movie_time) {
        this.movie_title = movie_title;
        this.director = director;
        this.movie_time = movie_time;
        this.incheckOut = false;
    }

    @Override
    public void checkOut() {
        if(!incheckOut) {
            incheckOut = true;
            System.out.println(movie_time + "이(가) 대출되었습니다.");
        }else  {
            System.out.println(movie_time + "이(가) 이미 대출중 입니다.");
        }
    }

    @Override
    public void returnItem() {
        if(incheckOut) {
            incheckOut = false;
            System.out.println(movie_time + "으(를) 반납 하였습니다.");
        } else {
            System.out.println(movie_time + "이(는) 대출중이 아닙니다.");
        }
    }

    @Override
    public void getDescription() {
        System.out.println("영화의 제목: " + movie_title + ", 감독: " + director + ", 재생 시간: " + movie_time);
    }
}
