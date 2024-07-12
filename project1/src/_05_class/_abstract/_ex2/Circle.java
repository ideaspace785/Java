package _05_class._abstract._ex2;

public class Circle extends Shape{
    private double radius;
    final static double PI = 3.14159265358979323846;
    public Circle(String color, String type, double radius) {
        super(color, type);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return PI * radius * radius;
    }
}
