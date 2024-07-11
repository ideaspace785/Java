package _05_class._inheritance;

public class Student extends Person {
    public String campus;

    public Student(String name, int age) {
        super(name, age); // 부모 생성자 호출
        System.out.println("자식 클래스 public Student(String name, int age) 생성자가 실행되었습니다.");
    }

    public void setCampus(String campus) {
        this.campus = campus;
        System.out.println(campus + " 캠퍼스에서 공부중입니다.");
    }
    public static void main(String[] args) {
        Student std1 = new Student("김철수", 11);

        System.out.println(std1.name);
        System.out.println(std1.age);
        //student field
        System.out.println(std1.campus); //null? setter 실행 전이므로!

        //Person으로부터 상속 받은  메소드
        std1.say();
        std1.eat("바나나");

        //Students에 있는 메소드 호출
        std1.setCampus("염리");
        System.out.println( std1.campus);
    }
}
