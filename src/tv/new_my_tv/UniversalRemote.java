package tv.new_my_tv;

public class UniversalRemote implements RemoteControl {

    private TV pairedTV;

    // TV와 리모컨을 페어링하는 메서드
    public void pairWith(TV tv) {
// 이미 다른 TV와 페어링 되어 있을 경우
        if (pairedTV != null && pairedTV != tv) {
            System.out.println(pairedTV.getTVName() + "'s pairing has been disconnected.");
            pairedTV.setPair(false);
        }

        pairedTV = tv;
        tv.setPair(true);
    }

    @Override
    public void setPower(boolean power) {
// 페어링된 TV가 있고, 그 TV가 페어링된 상태일 때만 전원 설정 가능
        if (pairedTV != null && pairedTV.isPaired()) {
            pairedTV.setPower(power);
        } else {
            System.out.println("No TV is paired.");
        }
    }

    @Override
    public void setChannel(int channel) {
// 페어링된 TV가 있고, TV의 전원이 켜져 있을 때만 채널 변경 가능
        if (pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()) {
            pairedTV.changeChannel(channel);
        } else if (pairedTV == null || !pairedTV.isPaired()) {
            System.out.println("No TV is paired.");
        } else {
            System.out.println("The TV is OFF. Cannot change channel.");
        }
    }

    @Override
    public void nextChannel() {
// 페어링된 TV가 있고, TV의 전원이 켜져 있을 때만 다음 채널 가능
        if (pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()) {
            int currentChannel = pairedTV.getCurrentChannnel();
            if (currentChannel == 999) {
                pairedTV.changeChannel(0);
            } else {
                pairedTV.changeChannel(currentChannel + 1);
            }
        } else if (pairedTV == null || !pairedTV.isPaired()) {
            System.out.println("No TV is paired.");
        } else {
            System.out.println("The TV is OFF. Cannot change channel.");
        }
    }

    @Override
    public void previousChannel() {
// 페어링된 TV가 있고, TV의 전원이 켜져 있을 때만 다음 채널 가능
        if (pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()) {
            int currentChannel = pairedTV.getCurrentChannnel();
            if (currentChannel == 0) {
                pairedTV.changeChannel(999);
            } else {
                pairedTV.changeChannel(currentChannel - 1);
            }
        } else if (pairedTV == null || !pairedTV.isPaired()) {
            System.out.println("No TV is paired.");
        } else {
            System.out.println("The TV is OFF. Cannot change channel.");
        }
    }



    public void watchStreaming() {
// 페어링된 TV가 SamsungTV일 경우 넷플릭스 시청
        if (pairedTV instanceof SamsungTV) {
            ((SamsungTV) pairedTV).watchNetflix();
        } else if (pairedTV instanceof LGTV) {
            ((LGTV) pairedTV).watchYouTube();

        }else if(pairedTV instanceof AppleTV){
            ((AppleTV) pairedTV).watchWave();
        }else {
            System.out.println("No streaming available for this TV");
        }
    }


    public void adjustVolume(int level) {
        if(pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()) {
            System.out.println("sound level is " + level);
        } else {
            System.out.println("NO change sound");
        }
    }



}
