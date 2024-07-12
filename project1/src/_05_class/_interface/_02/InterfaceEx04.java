package _05_class._interface._02;

// 전화 기능을 위한 인터페이스
interface Phone {
    void makeCall(String number);
    void answerCall();
}

// 인터넷 기능을 위한 인터페이스
interface InternetDevice {
    void browseWeb(String url);
    void sendEmail(String address, String content);
}

// 카메라 기능을 위한 인터페이스
interface Camera {
    void takePhoto();
    void recordVideo();
}
class Smartphone implements Phone, InternetDevice, Camera {
    @Override
    public void takePhoto() {
        System.out.println("takePhoto");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void browseWeb(String url) {
        System.out.println(url+"의 url로 접속");
    }

    @Override
    public void sendEmail(String address, String content) {
        System.out.println(address + "로 " + content+ "  내용의 이메일을 보냈습니다.");
    }

    @Override
    public void makeCall(String number) {
        System.out.println(number + "로 전화를 걸었습니다");
    }

    @Override
    public void answerCall() {
        System.out.println("전화를 받았습니다");
    }
}

public class InterfaceEx04 {
    public static void main(String[] args) {

        Smartphone blueberry = new Smartphone();
        blueberry.takePhoto();
        blueberry.recordVideo();
        blueberry.makeCall("01032463856");
        blueberry.answerCall();
        blueberry.sendEmail("ang@gmail.com", "Hello World");
        
    }
}