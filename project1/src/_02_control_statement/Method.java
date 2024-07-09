package _02_control_statement;

// Method
// 객체가 갖는 동작(기능)

// 메소드 문법
/* 접근제한자 래턴타입, 메서드명(인자1, 인자2, ...)
        메서드 행위
        return 반환값
 */
// static method     : class에 속하는 메서드로 , 객체 생성하지 않고 호출 가능
// non-static method :

public class Method {

    public static void main(String[] args) {

        int[] numbers = {10,20};
        int[] numbers2 = {10,20,30,40};
        hello();
        System.out.println("sum1: " + sum1(1,2));
        System.out.println("sum2: " + sum2(10, 20));
        System.out.println("sum3: " + sum3(2,4,6,8));

        System.out.println("mul1: " + mul1(100,200));
        System.out.println("mul2: " + mul2(numbers2));
        System.out.println("factorial: "+ factorial(5));

    }

//    1. 반환 값이 없는 메서드
    public static void hello(){
        System.out.println("Hello World");
    }
//    2. 반환 값이 있는 메서드
    public static int sum1(int a, int b){
        return a+b;
    }
    public static String sum2(int a, int b){
        return "string method a+b: "+(a+b);
    }

    //가변인자(Varargs)
    public static int sum3(int... nums){
        int result = 0;
        for(int num : nums){
            result += num;
        }
        return result;
    }
    // Method에서 매개변수를 전달하는 방식
    // 1. call by value(값을 전달)

    // 2. call by reference (참조 전달)
    //-------Reference 전달
    public static int mul1(int a, int b ){
        return a*b;
    }

    public static int mul2(int[] nums){
        int result = 1;
        for(int num : nums){
            result *= num;
        }
        return result;
    }

    //재귀 메서드 : 자기 자신을 호출하는 메서드
    public static int  factorial(int n){
       if(n<=1) return 1;
       return n*factorial(n-1);
    }

}
