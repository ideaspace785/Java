package _01_basic_syntax;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        int amout = 3;
        String product = "CocaCola";

        System.out.print("Hello World\n");
        // new line 줄바꿈을 위해 System.out.println() 를 해도 되고 \n를 해줘도 된다
        System.out.println();
        System.out.println("I am Nomin");

        System.out.printf("편의점에 있는 %s는 %d 개 있습니다", product, amout); //출력 서식을 아용
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\n공백으로 구분해서 이름 나이 키 결혼여부를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt(); //공백 이전까지의 문자열
        double height = scanner.nextDouble(); //공백 이전까지의 실수
        boolean single  = scanner.nextBoolean();
        System.out.printf("이름\t\t\t: %s(님) \n", name);
        System.out.printf("나이\t\t\t: %d(살) \n", age);
        System.out.printf("키\t\t\t: %.1f(cm) \n", height);
        System.out.printf("결혼여부\t\t: %b \n",single);
    }
}
