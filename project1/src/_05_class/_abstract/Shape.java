package _05_class._abstract;
// 추상 클래스
// - 클래스의 공통적인 필드와 메소드를 추출해서 선언한 클래스
// - 실체 클래스: 객체를 직접 생성할 수 있는 클래스
// - 추상 클래스: 공통적인 특성을 추출해서 선언한 클래스

// abstract 키워드를 사용
// new 연산자를 이용해 객체 생성 불가능
// -> 직접 생성자 호출이 불가능한것이이 자식 생성자에서 super(..) 호툴 추상 클래스 객체 생성 가능
public abstract class Shape {
    // 필드
    String color;

    // 생성자
    public Shape(String color) {
        this.color = color;
    }
    // 추상 메서드
    // - 메소드의 선언부만 있는 메소드
    // - 자식 클래스에서 재정의 (@Override)
    // - 모든 실체들이 갖는 메소드 실행 내용이 동일하다면, 추상 클래스에서 메소드를 구현 나음
    // - 메소드의 선언만 동일하고 실체 내용이 달라져야 한다면, 추상 메서드를 사용
    // - 자식 클래스는 추상 메소드를 재정의하지 않으면, 컴파일 에러
    abstract void draw();

    // 일반 메서드
    void start() {
        System.out.println("도형을 그려보자~");
    }

    String getColor() {
        return this.color;
    }
}