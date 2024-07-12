package _05_class._interface._01;

public class Television implements RemoteControl{
    private int volume;

    @Override
    public void turnOn(){
        System.out.println("TV is turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("Tv is turned off");
    }
    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV 불륨: " + this.volume);
    }
}
