package _05_class._interface.Exer;

public abstract class Vehicle{
    String name;
    int maxSpeed;
    public Vehicle(String name, int maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    public abstract void move();

    public String getName() {
        return name;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
