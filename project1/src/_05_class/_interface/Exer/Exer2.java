package _05_class._interface.Exer;

interface Flyable{
    void fly();
}
class Car extends Vehicle{
    public Car(String name, int maxSpeed){
        super(name, maxSpeed);
    }
    @Override
    public void move() {
        System.out.println("도로를 따라 이동 중");
    }
}
class Airplane extends Vehicle implements Flyable{
    public Airplane(String name, int maxSpeed){
        super(name, maxSpeed);
    }

    @Override
    public void fly() {
        System.out.println("고도 10,000피트에서 비행 중");
    }
    @Override
    public void move() {
        System.out.println("하늘을 날아가는 중");
    }
}


public class Exer2 {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];
        Car car = new Car("Toyota", 200);
        vehicles[0] = car;
        Airplane airplane = new Airplane("JejuAir", 1200);
        vehicles[1] = airplane;
        for (int i = 0; i < 2; i++) {
            if(vehicles[i] instanceof Flyable){
                ((Flyable)vehicles[i]).fly();
            }
            vehicles[i].move();
        }
    }
}
