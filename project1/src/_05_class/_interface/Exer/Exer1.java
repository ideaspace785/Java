package _05_class._interface.Exer;

interface Music {
    void play();
    void stop();
}

class Mp3Player implements Music {
    @Override
    public void play() {
        System.out.println("Mp3Player는 '아이유 블루밍' 음악을 재생합니다. ");
    }
    @Override
    public void stop() {
        System.out.println("Mp3Player는 '아이유 블루밍' 음악을 정지합니다. ");

    }
}
class CdPlayer implements Music {
    @Override
    public void play() {
        System.out.println("CdPlayer는 '아이유 꽃갈피' 음악을 재생합니다. ");
    }
    @Override
    public void stop() {
        System.out.println("CdPlayer는 '아이유 꽃갈피' 음악을 정지합니다. ");

    }
}

public class Exer1 {
 public static void main(String[] args) {
     Mp3Player mp3Player = new Mp3Player();
     System.out.println("===Mp3 Player===");
     mp3Player.play();
     mp3Player.stop();
     CdPlayer cdPlayer = new CdPlayer();
     System.out.println("===Cd Player===");
     cdPlayer.play();
     cdPlayer.stop();
 }
}
