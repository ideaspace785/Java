package _03_array;

import java.util.Arrays;

//표준 배열
    // -배열에 저장할 자료형을 선언하고, 배열이름과 크기를 선언해야한다
    // -배열의 원소는 모두 같은 타입
    // - 처음 선언한 배열 크기느 변경 불가능(단, ArrayList 컬렉션의 경우, 동적 크기 조절 가능)
public class ArrayEx {
    public static void main(String[] args) {
    // 배열 변수 선언
    // 1. type[] var;
    // 2. type var[];
    // - 배열 변수는 '참조 변수'
    // - 따라서, 참조할 배열이 업다면 null 로 초기화 가능
    // String[] temp = null;
    // System.out.println("temp= " + temp); //null
    // System.out.println("temp[0]= " + temp[0]); //Error: NullPointerException

    // # 값 목록으로 배열 변수 선언하고 배열 생성
    // 배열 변수는 "리턴 번지수"를 저장함으로써 참조가 이루어짐


        //{} heap영역에 저장하고 "번지를 리턴"

        int [] intArray = {16,22,34,56,78};
        System.out.println("intArray[0] = " + intArray[0]);
        System.out.println("intArray[1] = " + intArray[1]);
        System.out.println("intArray[2] = " + intArray[2]);
        System.out.println("intArray = " + intArray);
        //중괄호로 감싼 목록을 배열 변수에 대입할 때,
        //배열 변수를 미리 선언한 후에는 값 목록을 변수에 대입 불가
        char[] charArray;
        //charArray = {'A', 'B'};  //compile error
        charArray = new char[]{'A', 'B', 'C'};
        System.out.println("charArray[0] = " + charArray[0]);
        System.out.println("charArray[1] = " + charArray[1]);
        System.out.println("charArray[2] = " + charArray[2]);

        // # new 연산자로 베열 선언하고 배열 생성
        // : new 연산자로 배열 처음 생성하면 기본 값으로 초기화
        double[] doubleArray = new double[3]; //doubleArray[0]=0.0 으로 초기화
        //--------------------------------------------------------------------------------------------------------------
//배열의 길이
        int sum=0;
        for(int i=0;i<intArray.length;i++){
            sum+=intArray[i];
        }
        System.out.println("int array sum= "+ sum);
        double avg = (double)sum/intArray.length;
        System.out.println("int array avg= "+ avg);
        System.out.println();
        //--------------------------------------------------------------------------------------------------------------
        // 만약에, 배열 길이 벗어난다면?
        // ArrayIndexOutOfBoundsException ERROR
        //--------------------------------------------------------------------------------------------------------------
// 배열(원소) 출력 toString()
        // ~Arrays class에 내장되어 있는  toString() 메소드 사용
        // ~배열의 참조값(주솟값이 아닌 원소 값을 모두 보고싶을때
        System.out.println("intArray using toString(): "+ Arrays.toString(intArray));
        //--------------------------------------------------------------------------------------------------------------
//다차원 배열
        //case1  2x3배열 생성 및 초기화
        int[][]matrix={{1,2,3},{4,5,6}};

        //case2
        int[][] matrix2=new int[3][2];
        matrix2[0][0]=1;
        matrix2[0][1]=2;
        matrix2[1][0]=3;
        matrix2[1][1]=4;
        matrix2[2][0]=5;
        matrix2[2][1]=6;

        //case3  3차원 배열 생성 및 초기화
        int[][][] threeDimensionalArray= { { {2,3} , {4,5} } , { {6,7} , {8,9} } };

        System.out.println("matrix: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("matrix2: ");
        for(int i=0; i<matrix2.length; i++){
            for(int j=0; j<matrix2[i].length; j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nmatrix3: ");
        for(int i=0; i< threeDimensionalArray.length; i++){
            for(int j=0; j<threeDimensionalArray[i].length; j++){
                for(int k=0; k<threeDimensionalArray[i][j].length; k++){
                    System.out.print(threeDimensionalArray[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        //--------------------------------------------------------------------------------------------------------------
//객체를 참조하는 배열
        // - 기본 타입 배열 원소 (각 항목)에 직접 저장
        // - 참조 타입 (클래스, 인터페이스) 배열은 원소(각항목)에 객체의 번지를 저장
        String[] langs = new String[3];
        langs[0]="Java";
        langs[1]="Java";
        langs[2]= new String("Java");
        System.out.println("langs = "+Arrays.toString(langs));
        System.out.println( langs[0] == langs[1] ); //true
        System.out.println( langs[1] == langs[2] ); //false
        System.out.println( langs[1].equals(langs[2])); //true
        //--------------------------------------------------------------------------------------------------------------
//배열을 복사
        //배열의 크기를 늘릴때 쓸수 있음

        //ver1.반복문으로 원소를 하나씩 복사
        int[] originArr={1,2,3};
        int[] newArr=new int[5];
        System.out.println("OriginArr = "+Arrays.toString(originArr));

        for(int i=0; i<originArr.length; i++){
            newArr[i]=originArr[i];
        }
            System.out.println("newArr = "+Arrays.toString(newArr));

        //ver2. arraycopy() 이용
        // : System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        // -Object src-원본 배열
        // -int srcPos-원본 배열 복사 시작 인덱스
        // -Object dest- 새 배열
        // -int destPos- 새 배열 붙여놓기 시작 인덱스
        // -int length- 복사 항목 수
        String[] originFruits={"apple", "banana", "orange"};
        String[] newFruits=new String[5];
        System.arraycopy(originFruits,1,newFruits,2,originFruits.length-1);
        System.out.println("originFruits = "+Arrays.toString(originFruits));
        System.out.println("newFruits = "+Arrays.toString(newFruits));
        //--------------------------------------------------------------------------------------------------------------
//Arrays 메소드
        // 1. copyOf(arr, copyArrayLength) 메소드
        int[] originIntArray = {1,2,3,4,5};
        int[] copiedIntArray= Arrays.copyOf(originIntArray,3);
        System.out.println("originIntArray = "+Arrays.toString(originIntArray));
        System.out.println("copiedIntArray = "+Arrays.toString(copiedIntArray));

        // 2.copyOfRange(arr, sIdx, eIdx) 메소드
        int[] rangeArr = Arrays.copyOfRange(originIntArray,1,4);  //1부터 4 전까지
        System.out.println("rangeArr = "+Arrays.toString(rangeArr));
        // 3. fill(arr,n) 메소드
        int[] filledArr = new int[5];
        System.out.println("Filled Array (before) = "+ Arrays.toString(filledArr));
        Arrays.fill(filledArr,7);
        System.out.println("Filled Array (after) = "+Arrays.toString(filledArr));

        // 4. sort(arr) 메소드
        int[] unsortedArr = {6,3,787,2,0};
        System.out.println("unsortedArr = "+Arrays.toString(unsortedArr));
        Arrays.sort(unsortedArr);
        System.out.println("SortedArr = "+Arrays.toString(unsortedArr));

        // 5. equals() 메소드
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {4,5,6};
        boolean arraysEqual = Arrays.equals(array1,array2);
        boolean arraysEqual2 = Arrays.equals(array1,array3);
        System.out.println("arraysEqual(1vs2) = "+arraysEqual);
        System.out.println("arraysEqual2(1vs3) = "+arraysEqual2);

        //참고  == 비교 연산자를 사용한다면
        System.out.println("Arrays == (1vs2)"+ (array1 == array2)); //false
        System.out.println("Arrays == (1vs3)"+ (array1 == array3));   //false



        // 6. deepEquals(arr1, arr2): 대차원 배열의 내용 비교
        int[][] deepArray1 = { {1,2}, {3,4} };
        int[][] deepArray2 = { {1,2}, {3,4} };
        int[][] deepArray3 = { {1,2}, {3,5} };

        boolean deepArraysEqual1 = Arrays.deepEquals(deepArray1,deepArray2);
        boolean deepArraysEqual2 = Arrays.deepEquals(deepArray1,deepArray3);
        System.out.println("deepArraysEqual1 (1vs2) = "+deepArraysEqual1);  //true
        System.out.println("deepArraysEqual2 (1vs3) = "+deepArraysEqual2);  //false

        // 7. binarySearch(arr, val): 2진 탐색       arr 배열에서 val 값의 인덱스 찾음(단, 배열이 정렬된 상태이어야 함)
        int[] sortedArray = {10,30,50,70, 90, 110, 130,150};
        int index = Arrays.binarySearch(sortedArray,70);
        System.out.println("index of 70: " + index);
        //--------------------------------------------------------------------------------------------------------------
//
    }
}
