package _05_class._static;

import java.util.Scanner;

public class CircleExer {
    final static double PI=3.14159265359;
    final double radius;

    public CircleExer(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
    public static void main(String[] args) {
        System.out.print("원의 반지름을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        CircleExer circle = new CircleExer(radius);
        System.out.println("원의 반지름: "+ circle.getRadius());
        System.out.println("원의 넓이: "+circle.calculateArea());
    }
}
