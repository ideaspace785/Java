package _05_class._static;

class Rectangle {
    static int counter;

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        counter++;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea(int width, int height) {
        return width * height;
    }
}