package _03_array;

import java.util.Scanner;

public class ExOfArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += array[i];
        }
        double average = (double) sum / 5;
        System.out.println("평균은 "+ average);

    }
}
