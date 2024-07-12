package _05_class._inheritance;

public class DogEx {
    public static void main(String[] args) {
        // 자식 클래스의 인스터스를 생성
        Dog vickey = new Dog();

        // call method
        vickey.makeSound();

        vickey.fetch();

    }
}
