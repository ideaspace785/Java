package _05_class;

public class StudentEx {
    public static void main(String[] args) {
        Student s1= new Student("김철수", 1);
        System.out.println(s1);
        s1.goToSchool();
        s1.study("자바 프로그램");
        System.out.println(s1.getTestResult(80));
    }
}
