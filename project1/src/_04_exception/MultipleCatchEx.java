package _04_exception;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleCatchEx {
    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc= new Scanner(System.in);
            System.out.println("Enter the first number:");
            String input = sc.nextLine();

            //문자열을 정수로 변환
            int number = Integer.parseInt(input);    //NumberFormatException 예외 발생 가능성

            //입력받은 숫자로 나누기
            int divideResult = 100 / number;

            //결과 출력
            System.out.println("숫자 100을 " + number + "로 나눈 결과 " + divideResult);

            int[] array = new int[10];
            array[number] = 10;
            System.out.println(number + " 인덱의 값을 10으로 수정했습니다" + Arrays.toString(array));

        }catch(NumberFormatException e){
            System.out.println("숫자 형식이 잘못되었습니다 >> " + e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("0으로 나눌수 없습니다 >> " + e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스가 범위를 벗어났습니다 >> " + e.getMessage());
        }catch(Exception e){
            //General exception handler
            //  가장 마지막 캐치 절로 마지막 방어라고 생가개
            System.out.println("알수 없는 에러");
        }finally{
            System.out.println("종료");
            if(sc!=null) {
                sc.close();
            }
        }

    }
}
