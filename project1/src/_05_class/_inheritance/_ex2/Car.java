package _05_class._inheritance._ex2;

public class Car extends Vehicles{
    boolean convertible;
    public Car(String brand, String model, int year, boolean convertible ) {
        super(brand, model, year);
        this.convertible = convertible;
    }
    @Override
    void actionNow() {
        super.actionNow();
    }

    @Override
    void carAction() {
        System.out.println("주차했습니다");
    }

    @Override
    void status() {
        super.status();
    }
    @Override
    public String toString() {
        return "Car {brand='"+brand+ "', model='"+model+ "', year="+year+ ", convertible=" + convertible+ "}";
    }
}
