package _05_class._abstract._ex2;

public abstract class Shape {
    String color;
    String type;
    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    abstract double calculateArea();
    void printInfo(){
        System.out.println("====="+type+" 도형의 정보=====");
        System.out.println("도형의 색상: "+ color);
        System.out.println("도형의 넓이: "+calculateArea());
    }
}
