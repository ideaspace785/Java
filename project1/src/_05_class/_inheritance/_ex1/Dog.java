package _05_class._inheritance._ex1;

public class Dog extends Animal {
    private String MBTI = "ENFP";
    public Dog(String breed, int age) {
        super.name=" 고양이";
        this.breed=breed;
        this.age=age;
    }

    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
    void MBTI(){
        System.out.println(MBTI);
    }
}
