package _04_exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(System.in);
            String input= sc.nextLine();

            int size = Integer.parseInt(input);
            // case1. int 형 아닌 입력

            int[] arr = new int[size];
            int sum=0;
            for(int i=0;i<size;i++){
                sum=sum+arr[i];
            }
            int average=sum/size; // case2. 입력이 0일 경우
            System.out.println("배열의 평균은: " + average);
        }catch(NumberFormatException e) {
            System.out.println("배열의 크기를 정수형으로 입력해주세요 >> " + e.getMessage()); //
        }catch(ArithmeticException e) {
            System.out.println("배열의 크기를 이상으로 입력해주세요 >> " + e.getMessage());
        }
        finally {
            System.out.println("종료");
            sc.close();
        }
    }
}
