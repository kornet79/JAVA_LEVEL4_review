package tv.new_my_tv;

import tv.th_tv.Tv;

public class Main {
    public static void main(String[] args) {
        TV samsungTV = new SamsungTV();
        TV lgTV = new LGTV();
        TV appleTV = new AppleTV();
        UniversalRemote remote = new UniversalRemote();

// 삼성 TV와 페어링
        remote.pairWith(samsungTV);
        remote.setPower(true); // 전원 켜기
        remote.setChannel(5); // 5번 채널 변경
        remote.watchStreaming();
        remote.setPower(false);

        System.out.println("================================");

// LG TV와 페어링
        remote.pairWith(lgTV);
        remote.setPower(true); // 전원 켜기
        remote.setChannel(5); // 5번 채널 변경
        remote.watchStreaming();
        remote.setPower(false);


        System.out.println("===============================");
        remote.pairWith(appleTV);
        remote.setPower(true);
        remote.adjustVolume(32);
        remote.watchStreaming();
        remote.setPower(false);


    }
}
