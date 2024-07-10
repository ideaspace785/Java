package ArrayList;

// Collection Framework
// - 객체를 효율적으로 추가/삭제/검색할 수 있도록 관련 인터페이스 & 클래스를 java.util 패키지에 포함시켜 놓음

// ArrayList 클래스
// - List 컬렉션에서 가장 많이 사용된는 컬렉션
// - 표준 배열보다 조금 느릴 수 있으나, 배열에서 많은 조작이 필요한 경우 유용
// - 동적 할당이 가능 (= 크기를 미리 지정하지 않아도 됨, 일반 배열과의 차이점)
// -List 컬렉션은 객체 자체를 저장하는 것이 아니라 객체의 참조 값을 저장
//      => 동일한 객체를 증복 저장 가능, 이는 동일한 번지수가 저장되는 것을 의미
//      => null 도 저장할 수 있음


import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayListEx {

    //작성 방법
    // 1. List<E> list = new ArrayList<E>();
            // 장점: List 의 지정된 타입, Arraylist, Vector, LinkedList들  등등 모든 타입을 저장할 수 있음
            // 단점: 타입 안정성이 없음
    // 1.1 ArrayList<E> list = new ArrayList<E>();
            // ArrayList 만 저장할 수 있음
    // 2. List<E> list = new ArrayList<>();
    // 3. List list = new ArrayList();


    public static void main(String[] args) {
        // 1. ArrayList 생성 (정수형 요소를 저장하는 예제
        List<Integer> numbers = new ArrayList<Integer>();

        // 2. 요소 추가
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // 3. 요소 접근
        System.out.println("첫번째 요소 : " + numbers.get(0));

        // 4. 요소 수정
        numbers.set(1,77);
        System.out.println("numbers : " + numbers);
        System.out.println("Arrays.toString(numbers.toArray()): " + Arrays.toString(numbers.toArray()));

        // 5. 요소 추가 (끼워넣기)
        numbers.add(1, 11);
        System.out.println("numbers : " + numbers);

        // 6. ArrayList 끼리 연결
        System.out.println(Arrays.asList(100,98,96));  //주어진 요소들로 고정 크기의 List 생성
        List<Integer> number2 = new ArrayList<>(Arrays.asList(100,99,98));
        numbers.addAll(number2);
        System.out.println(numbers);

        // 7. 요소 위치 찾기
        System.out.println(numbers.indexOf(100));
        System.out.println(numbers.indexOf(-1));   //-1 른 요소가 리스트에 없다는 뜻

        // 8. 요소 삭제
        numbers.remove(0);
        System.out.println("numbers remove(0) : " + numbers);

        // 9. 리스트 크기 확인
        System.out.println("numbers.size() : " + numbers.size());

        // 10. forEach 메소드
        for(Integer i : numbers) {
            System.out.println("forEach: " + i + " ");
        }
//--------------------------------------------------------------------------------------------------------------
        // Student 타입의 ArrayList
        List<Student> students = new ArrayList<>();
        students.add(new  Student("John", 10));
        students.add(new  Student("Sarah", 20));
        students.add(new  Student("Linda", 30));
        students.add(new  Student("Josh", 40));
        System.out.println("students : " + students);
        System.out.println("size of students : " + students.size());


        Student std1 = students.get(0);
        System.out.println(std1.getName() + "의 나이는 " + std1.getAge());


        for(Student s : students) {
            System.out.println(s.getName() + "의 나이는 " + s.getAge());
        }
        students.remove(0);
        System.out.println("students : " + students);
        students.remove(0);
        System.out.println("students : " + students);
    }
    static class Student {
        private int age;
        private String name;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        // 객체를 문자열로 표현할 때 어떻게 출력할지를 정의할 수 있는 기능
        // 안해주면 참조 값이 나온다
        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
