package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {
        // if-else 문
        int number = 10;
        if (number % 2 == 0) {
            System.out.printf("숫자 %d 은(는) 짝수입니다.\n", number);
        } else {
            System.out.printf("숫자 %d 은(는) 홀수입니다.\n", number);
        }

        // 문자열(String) 객체 비교
        System.out.println("이름을 입력해주세요 >> ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // Enter 이전까지의 문자열을 읽음
        System.out.println("name = " + name);

        // Bad case (`==` 비교 연산자 사용)
//        if (name == "코딩온") { // 문제: "코딩온"을 올바르게 입력해도 else 절로 넘어감
//            System.out.println("코딩온 님 환영합니다!");
//        } else {
//            System.out.println("이름을 다시 확인해주세요...");
//        }

        // Good case (`.equals() 메서드를 사용)
        if (name.equals("코딩온")) {
            System.out.println("코딩온 님 환영합니다!");
        } else {
            System.out.println("이름을 다시 확인해주세요...");
        }

        //Why
        // == 두 문자열이 같은 메모리 주소를 참조하는지를 확인(reference를 비교)
        // .equals()  메소드 두 객체의 내용이 동일한지 비교

        // -문자열 리터릴, 자바에서 특별한 취급
        // 동일한 문자열을 사용할 경우: Java 캄파일러가 문자열(string pool)이라는 공유된 메모리 영역에 해당 문자열 저장
        // 변수 str1, str2는 같은 문자열을 가르키고 있으므로 같은 참조를 가르킴
        String str1="hello";
        String str2="hello";
        if(str1==str2){
            System.out.println("같은 참조 값을 가르킵니다");
        }else {
            System.out.println("서로 다른 참조 값을 가르킵니다");
        }

        String str3=new String("hi");
        String str4=new String("hi");
        if(str3==str4){
            System.out.println("같은 참조 값을 가르킵니다");
        }else {
            System.out.println("서로 다른 참조 값을 가르킵니다");
        }

        if(str3.equals(str4)){
            System.out.println("값이 똑같음");
        }

        String dayOfWeek="";
        int day=4;
        switch(day){
            case 1:
                dayOfWeek="월요일";
                break;
            case 2:
                dayOfWeek="화요일";
                break;
            case 3:
                dayOfWeek="수요일";
                break;
            case 4:
                dayOfWeek="목요일";
                break;
            case 5:
                dayOfWeek="금요일";
                break;
            case 6:
                dayOfWeek="토요일";
                break;
            case 7:
                dayOfWeek="일요일";
                break;
            default:dayOfWeek="잘못됨";
            break;
        }
        System.out.printf("%s 입니다" , dayOfWeek);
    }

}
