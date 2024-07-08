package _01_basic_syntax;

// -Primitive Type (기본 타입)
// -Reference Type (참조형 레퍼런스 타입)

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("**** Primitive type ****");

        //  정수형 변수 int
        int x=10; //32bit
        long y=20L; //63bit Long type 뒤에 "L", 'l'를 붙여줘야한다.
        short z=3; //16bit
        byte b=127; //최대로 가질 수 있는 값이 8bit

        // 실수형 변수
        float a =2.14F; //32bit, float type은 'F','f' 를 붙여야함
        double d=3.14;

        // 문자형 변수
        char ch='a'; //작은 따옴표를 사용 ''

        // 논리형 변수
        boolean bool= true; //false
        System.out.println("Integer type " + x + ',' + y + ',' + z  + ',' + b);

        System.out.println("**** Reference type ****");

        String greeting = "Hello World";
        System.out.println("greeting " + greeting);


        System.out.println("**** Array type ****");
        // 배열 Array 참조형 변수와 선언 초기화
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(arr);  //[I@723279cf 메모리 주솟값

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }
        System.out.println();
        Person person= new Person("Nomin", 24);
        System.out.println("person 객체: " + person.getName() + ',' + person.getAge());
    }
}
class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
