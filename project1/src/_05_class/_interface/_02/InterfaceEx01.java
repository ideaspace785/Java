package _05_class._interface._02;
interface Controller{

    //추상 메소드
    void powerOn();
    void powerOff();


    // default method
    default void display(){System.out.println("디스플레이가 켜졌습니다. ");}
}
class TV implements Controller{
    @Override
    public void powerOn() {
        System.out.println("TV power on.");
    }
    @Override
    public void powerOff() {
        System.out.println("TV power off.");
    }
}
class Computer implements Controller{
    @Override
    public void powerOn() {
        System.out.println("Computer power on.");
    }
    @Override
    public void powerOff() {
        System.out.println("Computer power off.");
    }
}

public class InterfaceEx01 {
    public static void main(String[] args) {
        TV tv = new TV();
        Computer computer = new Computer();

        tv.powerOn();
        tv.display();
        tv.powerOff();
        System.out.println("------------------------------------");
        computer.powerOn();
        computer.display();
        computer.powerOff();
    }
}
