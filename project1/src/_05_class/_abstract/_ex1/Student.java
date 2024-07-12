package _05_class._abstract._ex1;

public abstract class Student {
    String name;
    String schoolName;
    int age;
    int sid;
    public Student(String name, String schoolName, int age, int sid) {
        this.name = name;
        this.schoolName = schoolName;
        this.age = age;
        this.sid = sid;
    }

    public String getName() {
        return name;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public int getAge() {
        return age;
    }
    public int getSid() {
        return sid;
    }

    void todo(){};
}
