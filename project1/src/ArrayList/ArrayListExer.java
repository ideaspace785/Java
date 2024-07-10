package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExer {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("문자를 입력해주세요. : ");
            String num = sc.nextLine();
            list.add(num+"");
            if(num.equals("exit")){
                System.out.println(list);
            }
        }
    }
}
