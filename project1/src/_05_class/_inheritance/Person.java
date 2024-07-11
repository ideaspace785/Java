package _05_class._inheritance;

// 부모 클래스 (슈퍼 클래스): Person
// 자식 클래스 (서브 클래스): Student
public class Person {
    public String name;
    public int age;

    //
    public Person() {
        System.out.println("부모 클래스의 기본 생성자가 실행되었습니다.");
    };

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("부모 클래스의 public Person(String name, int age) 생성자가 실행되었습니다.");
    }

    public void say() {
        System.out.println("안녕하세요");
    }

    public void eat(String food) {
        System.out.println(food + "를(을) 먹고있다.");
    }
}