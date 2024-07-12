package _05_class._inheritance._ex2;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Hyundai","City Bus", 2022,30);
        Car car= new Car("Toyota", "camry", 2023, true);
        Motorcycle moto=new Motorcycle("harley-Davidson", "Sportster", 2021, "A");
        System.out.println("=====Bus 정보=====");
        System.out.println(bus.toString());
        bus.actionNow();
        bus.carAction();
        bus.status();
        System.out.println("=====Car 정보=====");
        System.out.println(car.toString());
        car.actionNow();
        car.carAction();
        car.status();
        System.out.println("=====Motorcycle 정보=====");
        System.out.println(moto.toString());
        moto.actionNow();
        moto.carAction();
        moto.status();

    }
}
