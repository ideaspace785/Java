package _05_class._abstract._ex2;

public class ShapeEx {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", "Circle", 5);
        Rectangle rec=new Rectangle("Blue", "Rectangle", 4,6);
        circle.printInfo();
        rec.printInfo();
    }
}
