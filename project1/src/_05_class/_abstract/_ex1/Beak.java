package _05_class._abstract._ex1;

public class Beak extends Student{
    public Beak(String name, String schoolName, int age, int sid ){
        super(name, schoolName, age, sid);
    }

    @Override
    public void todo(){
        System.out.println("점심은 백종원 피자");
    }
}
