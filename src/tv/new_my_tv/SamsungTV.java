package tv.new_my_tv;

public class SamsungTV implements TV {

    private int currentChannel = 1;
    private boolean powerOn = false;
    private boolean paired = false;
    private int volume = 10;

    @Override
    public void setPower(boolean power) {
// 리모컨과 페어링된 경우에만 전원을 켜거나 끌 수 있음.
        if (paired) {
            powerOn = power;
            if (power) {
                System.out.println("Samsung TV is now ON.");
            } else {
                System.out.println("Samsung TV is now OFF.");
            }
        } else {
            System.out.println("Samsung TV is not paired.");
        }
    }

    @Override
    public void changeChannel(int channel) {
// 리모컨과 페어링되고, TV의 전원이 켜져 있는 상태에만 채널 변경 가능
        if (paired && powerOn) {
            this.currentChannel = channel;
            System.out.println("Samsung TV: Channel to channel " + channel);
        } else if (!paired) {
            System.out.println("Samsung TV is not paired.");
        } else {
            System.out.println("Samsung TV is OFF. Cannot change channel.");
        }
    }

    @Override
    public int getCurrentChannnel() {
        return currentChannel;
    }

    @Override
    public boolean isPowerOn() {
        return powerOn;
    }

    @Override
    public boolean isPaired() {
        return paired;
    }

    @Override
    public void setPair(boolean pair) {
        paired = pair;
        if (pair) {
            System.out.println("Samsung TV paired with remote.");
        } else {
            System.out.println("Samsung TV unpaired from remote.");
        }
    }

    @Override
    public String getTVName() {
        return "Samsung TV";
    }

    // 고유 기능 : 넷플릭스 스트리밍 가능
    public void watchNetflix() {
// TV의 전원이 켜져 있을 때만 넷플릭스 시청할 수 있음.
        if (powerOn) {
            System.out.println("Samsung TV: Now streaming Netflix.");
        } else {
            System.out.println("Samsung TV is OFF. Cannot stream Netflix.");
        }
    }

    @Override
    public void adjustVolume(int level) {
        if(powerOn) {
            volume = level;
            System.out.println("Samsung TV : Volume set to " + volume);
        } else {
            System.out.println("Samsung TV is not Content");
        }
    }
}