package _05_class._inheritance._ex1;

public class Main {
    public static void main(String[] args) {
        Cat cat= new Cat("Kit", 1);
        Dog dog= new Dog("Dog", 2);
        cat.makeSound();
        cat.MBTI();
        dog.makeSound();
        dog.MBTI();

    }
}
