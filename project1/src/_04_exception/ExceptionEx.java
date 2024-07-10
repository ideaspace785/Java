package _04_exception;

// 예외
// -일반 예외 (Exception): 컴파일러가 예외 처리 여부를 검사하는 에외
//    => 개발자가 예외 처리를 해줘야함. 안그럼 컴파일 에러 발생
// -실행 예외 (Runtime Exception): 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외
//      => 개발자가 예외처리를 명시적으로 하지 않아도 컴파일 됨. 프로그램 실행 시점에 발생하는 예외
//      => 예외를 처리하는 것이 권장됨


// Java 는 예외가 발생하면 예외 클래스로부터 예외 객체를 생성하며, 해당 객체는 예외 처리 시 사용됨
// 예외 발생 시 프로그램의 갑작스런 종료를 막고 정상 실행할 수 있도록 처리하는 코드를 "예외 처리" 코드
// try-catch-finally 블록으로 구성됨

// try 블록에서 작성한 코드가 예외없이 정상 실행 -> catch 블록은 시행 안되고 X,  finally 는 실행된다 O
// try 블록에서 작성한 코드가 예외 발생 -> catch 블록은 시행되고  O,  finally 도 실행된다 O
// finally 블록은 항상 실행


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
    public static void main(String[] args) {
    //case1. 예외 발생 코드
        /*
        //System.out.println(divide(6,2));
        //System.out.println(divide(6,0));
        try{
            System.out.println("연산 시작합니다");
            System.out.println(divide(6,0));
        }catch(ArithmeticException e){
            // 1. e.getMessage(): 예외가 발생한 이유만 알려줌  /by zero
                // System.out.println("나누기 연산 중 에러 발생" + e.getMessage());
            // 2. e.toString(): 예외 종류를 리턴
            // 3. e.printStackTrace(): 예외가 어디서 발생했는지 추적한 내용 출력
            e.printStackTrace();
        }finally {
            System.out.println("연산이 종료되었습니다");
        }
    */
    // case2. 예외 발생 코드
        /*
        System.out.println("단어 길이 = " + getLength(new String("Hello World")));
        System.out.println("단어 길이 = " + getLength(new String("")));

        try{
            System.out.println("단어 길이 = " + getLength(null));  //NullPointerException
        }catch(NullPointerException e){
            System.out.println("단어 길이 연산 중 에러 발생: " + e.toString());
        }
         */
    // case3. 예외 발생 코드
        /*
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getValueByIndex(numbers,0));
        try{
            System.out.println(getValueByIndex(numbers,numbers.length));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱싱 중 에러 발생 >>" + e.toString());
        }
     */
    // case4. 예외 발생 코드
    Scanner sc = new Scanner(System.in);
    try {
        System.out.println("Enter number");
        int number = sc.nextInt();   //공백 이전의 정수 받음
        System.out.println("입력한 정수:" + number);
    }catch (InputMismatchException e) {
        System.out.println("입력 값을 다시 확인하고, 정수를 입력해줘... : " + e.getMessage());
    }finally {
        sc.close();
    }



    }

    public static String divide(int x, int y) {
        return x + "/" + y + " = " + (x / y);
    }
    public static int getLength(String str) {return str.length();}
    public static int getValueByIndex(int[] arr, int idx){return arr[idx];}

    }
