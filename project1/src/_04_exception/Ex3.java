package _04_exception;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

public class Ex3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                // 배열 크기 입력
                System.out.print("배열 크기를 입력하세요: ");
                int size = scanner.nextInt();

                // 배열 생성
                int[] arr = new int[size];

                // 배열 요소 입력
                System.out.println(size + "개의 정수를 입력하세요:");
                for (int i = 0; i < size; i++) {
                    System.out.print("정수 " + (i + 1) + ": ");
                    arr[i] = scanner.nextInt();
                }

                // 중복된 요소 찾기
                ArrayList<Integer> duplicates = findDuplicates(arr);

                // 중복된 요소 출력
                if (duplicates.isEmpty()) {
                    System.out.println("중복된 요소가 없습니다.");
                } else {
                    System.out.println("중복된 요소: " + duplicates);
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력 형식입니다. 정수를 입력하세요.");
            } finally {
                // Scanner 닫기
                scanner.close();
            }
        }
    // 중복된 요소 찾는 메소드
    private static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    if(!duplicates.contains(arr[i])) {
                        duplicates.add(arr[i]);
                        duplicates.add(arr[i]);
                    }
                    else
                        duplicates.add(arr[i]);
                }
                i++;
            }
        }
        // TODO: 메소드 완성하기
        return duplicates;
        }
}
