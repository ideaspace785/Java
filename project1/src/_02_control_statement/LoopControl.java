package _02_control_statement;

import java.util.ArrayList;
import java.util.List;

public class LoopControl {

    public static void main(String[] args) {

        // 1. 기본 for 문
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. while 문
        // - 조건식이 참일 동안 while 블럭 실행
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 3. do-while 문
        // - 무조건 최소 한 번은 do 블럭이 실행되는 반복문
        // - while 문과 다르게 조건식이 뒤에 배치
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);
//    do-while 은 루프 본문이 최한 한번은 사용해야할 때

        // 4. for-each 문
        String [] array= {"a", "b", "c"};
        // for (datatype 변수: array 또는 collection)
        // *Collection(컬렉션): 데이더를 저장하고 관리하는 자료구조를 제공하는 클래스 모음(ex. list, set, map, stack, vector 등등)
        // 항상 처음부터 끝까지 순환
        // 모든 요소의 대해서 동일한 작업을 할 때 유리함
        // 조건에서 순환을 중단해야한다면 비추
        for(String s : array){
            System.out.print(s + " ");
        }

        for( int x =0; x<array.length; x++){
            System.out.println(array[x]+' ');
        }

        // case2 : List 에 대한 for each 문
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        int counter=0;
        for( String s : list){
            counter++;
            System.out.println("s"+counter + ": "+ s + " ");
        }

    }


}