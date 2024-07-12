package _05_class._inheritance;

public class Animal{
    // 아무런 생성자가 없으면 기본 생성자가 프로그램이 실행될 때 자동으로 만들어진다.
    // 하지만 다른 생성자가 있으면 기본 생성자가 자동으로 만들어지지 않습니다.
    void makeSound(){
        System.out.println("동물이 운다! (부모 클래스 makeSound())");
    }
}
