package _05_class._inheritance._ex2;

public class Bus extends Vehicles{
    int passengerCapacity;
    public Bus(String brand, String model, int year, int passengerCapacity ) {
        super(brand, model, year);
        this.passengerCapacity = passengerCapacity;
    }
    @Override
    void actionNow() {
        super.actionNow();
    }

    @Override
    void carAction() {
        System.out.println("승객을 운송합니다");
    }

    @Override
    void status() {
        super.status();
    }

    @Override
    public String toString() {
        return "Bus {brand='"+brand+ "', model='"+model+ "', year="+year+ ", passengerCapacity=" + passengerCapacity + '}';
    }
}
