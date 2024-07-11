package _05_class._access_modifier._pack5;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 =new Person("minion");
        Person p2 = new Person("pooh");

//      p1.age=4  //private field이기 때문
        p1.setAge(4); //public method을 이용해 간접적으로 접근
        System.out.println(p1.getName()+"의 나이는 "+ p1.getAge()+"살");

        p2.setAge(-5);
        System.out.println(p2.getName()+"의 나이는 "+ p2.getAge()+"살");

    }
}
