package _02_control_statement;

import java.util.Scanner;

public class ExForMethod {
    public static void main(String[] args) {
        System.out.println("숫자 두 개를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ExForMethod method= new ExForMethod();
        System.out.println("덧셈 결과 : " + method.add(a,b));
        System.out.println("뺄셈 결과 : " + method.sub(a,b));
        System.out.println("나눗셈 결과 : " + method.div(a,b));
        System.out.println("곱셈 결과 : " + method.mul(a,b));

    }
    public double add(int a, int b) {
        return a + b;
    }
    public double sub(int a, int b) {
        return a - b;
    }
    public double mul(int a, int b) {
        return a * b;
    }
    public double div(int a, int b) {
        return a / b;
    }
}
