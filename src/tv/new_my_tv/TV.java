package tv.new_my_tv;

public interface TV {
    void setPower(boolean power); // power가 true면 켜고, false면 끈다.
    void changeChannel(int channel); // 인자로 전달 받은 채널 번호로 변경한다.
    int getCurrentChannnel(); // 현재 채널을 확인하는 메서드
    boolean isPowerOn(); // TV의 전원이 켜져 있는지 여부를 확인하는 메서드
    boolean isPaired(); // TV가 리모콘과 페어링 되어 있는지 여부를 반환하는 메서드
    void setPair(boolean pair); // TV와 리모컨의 페어링 상태를 설정하는 메서드
    String getTVName(); // TV의 이름을 반환하는 메서드

    // 불륨을 조절하는 메서드 추가
    void adjustVolume(int level);
}
