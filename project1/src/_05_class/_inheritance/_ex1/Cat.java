package _05_class._inheritance._ex1;

public class Cat extends Animal {
    private String MBTI = "ISTP";
    public Cat(String breed, int age) {
        super.name=" 고양이";
        this.breed=breed;
        this.age=age;
    }

    @Override
    void makeSound() {
        System.out.println("Meow");
    }
    void MBTI(){
        System.out.println("ISTP");
    }
}
