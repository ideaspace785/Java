package _05_class._access_modifier._pack5;

public class Person {
    private String name;
    private int age;

    public Person(String name){
        this.name = name;
    }
    public int getAge(){return this.age;}
    public String getName(){return this.name;}
    public void setAge(int age){
        if(age < 0){
            this.age=0;
            return;
        }else{
            this.age = age;
        }
    }
    public void setName(String name){
        this.name=name;
    }
}
