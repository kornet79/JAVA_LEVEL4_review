package tv.new_my_tv;

public interface RemoteControl {
    void setPower(boolean power); // 전원 온오프
    void setChannel(int channel); // 특정 채널로 이동
    void nextChannel(); // 다음 채널로 이동
    void previousChannel(); // 이전 채널로 이동
}
