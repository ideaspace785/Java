package _05_class._inheritance._ex2;

public class Motorcycle extends Vehicles {
    String licenseType;

    public Motorcycle(String brand, String model, int year, String licenseType) {
        super(brand, model, year);
        this.licenseType = licenseType;
    }

    @Override
    void actionNow() {
        super.actionNow();
    }

    @Override
    void carAction() {
        System.out.println("올림통을 합니다");
    }

    @Override
    void status() {
        super.status();
    }
    @Override
    public String toString() {
        return "Motorcycle {brand='"+brand+ "', model='"+model+ "', year="+year+ ", licenseType=" + licenseType+ "}";
    }
}
