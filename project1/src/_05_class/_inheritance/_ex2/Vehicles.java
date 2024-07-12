package _05_class._inheritance._ex2;

public class Vehicles {
    String brand;
    String model;
    int year;
    public Vehicles(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void carAction(){
        System.out.println("차량 시동을 걸었습니다");
    }
    void actionNow(){
        System.out.println("운전 중");
    }
    void status(){
        System.out.println("차량을 정지했습니다. ");
    }
}
