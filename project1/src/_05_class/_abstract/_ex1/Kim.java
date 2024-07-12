package _05_class._abstract._ex1;

public class Kim extends Student {
    public Kim(String name, String schoolName, int age, int sid ){
        super(name, schoolName, age, sid);
    }

    @Override
    public void todo(){
        System.out.println("점심은 김가네 간장계란밥");
    }
}
