package _05_class._abstract;

public class Circle extends Shape{
    public Circle(String color){
        super(color);
    }

    @Override
    void draw(){
        System.out.println("Drawing Circle");
    }
}
