package _05_class._static;

public class Student {
    String name;
    int student_ID;
    int grade;
    static int totalStudents = 0;

    public Student(String name, int student_ID, int grade) {
        this.name = name;
        this.student_ID = student_ID;
        this.grade = grade;
        totalStudents++;
    }
    public String getName() {return name;};
    public int getStudent_ID() {return student_ID;}
    public int getGrade() {return grade;}
    public void setName(String name) {this.name = name;}
    public void setStudent_ID(int student_ID) {this.student_ID = student_ID;}
    public void setGrade(int grade) {this.grade = grade;}
    void displayInfo(){
        System.out.println("****** 학생 정보 ******");
        System.out.println("이름: " + this.name);
        System.out.println("학번: " + this.student_ID);
        System.out.println("학년: " + this.grade);
        System.out.println();

    }
    public static void main(String[] args) {
        Student s1= new Student("김새싹1", 20231101, 1);
        Student s2= new Student("김새싹2", 20231102, 2);
        Student s3= new Student("김새싹3", 20231103, 3);
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        System.out.println("총 학생 수는 "+ totalStudents+"명 입니다. ");

    }
}
