package _05_class._abstract._ex1;

import _05_class._abstract.Shape;

public class Main {
    public static void main(String[] args) {
        Kim jun = new Kim("김철수"," ABC 학교", 17, 20220002);
        Beak jun1= new Beak("백영희", "XYZ 고등학교", 18, 20220002);
        print(jun);
        print(jun1);
    }
    public static void print(Student std){

        System.out.println("====="+std.getName()+" 학생의 정보=====");
        System.out.println("학교: "+ std.getSchoolName());
        System.out.println("나이: "+ std.getAge());
        System.out.println("학번: "+ std.getSid());
        std.todo();
    }
}
