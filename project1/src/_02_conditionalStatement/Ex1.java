package _02_conditionalStatement;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max= Math.max(Math.max(a,b),Math.max(c,a));
        int min = Math.min(Math.min(a,b),Math.min(c,a));
        int sum = a+b+c;
        int avg =sum/3;
        System.out.println("max: "+max);
        System.out.println("min: "+min);
        System.out.println("sum: "+sum);
        System.out.println("avg: "+avg);
    }
}
