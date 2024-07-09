package _02_control_statement;

import java.util.Scanner;

public class ExForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.print(i+" ");
        }
    }
}
