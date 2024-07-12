package _05_class._abstract;

public class ShapeEx {
    public static void main(String[] args) {
    // Shape 객체는 new 연산자로 객체 생성 불가능
    // 실제 클래스인 Circle, Square 는 new 연산자로 객체 생성 가능
    // Shape shape = new Shape("green") XX
        Circle circle = new Circle("pink");
        Square square = new Square("red");

        // 매개변수의 다양성
        // : go 메소드의 매개변수 없이 Shape이지만, 각각의 실재 클래스으로 자동으로 타입 선언
        go(circle);
        go(square);
    }
    public static void go(Shape shape){
        shape.start();
        shape.draw();
        System.out.println("도형 색상은: " + shape.getColor() + "\n");
    }
}
