package _02_control_statement;

import java.util.Scanner;

public class ExForOverloading {
    public static void main(String[] args) {
        System.out.println("반지름이 5인 원의 넓이: "+area(5.0));
        System.out.println("가로 4, 세로  7인 직사각형의 넓: "+area(4,7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이 : " +area(6.0,3.0));
    }
    public static double area(double r){
        return r*r*3.14;
    }
    public static double area(int a, int b){
        return a*b;
    }
    public static double area(double a, double b)
    {
        return(a*b)/2;
    }

}
