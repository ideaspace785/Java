package _05_class._static;

import java.util.ArrayList;
import java.util.Scanner;

import static _05_class._static.Rectangle.counter;

public class RectangleEx {
    public static void main(String[] args) {
        ArrayList<Rectangle> rect = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("삼각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > 0 && y > 0) {
                rect.add(new Rectangle(x, y));
            } else {
                for (int i = 0; i < rect.size(); i++) {
                    int width = rect.get(i).getWidth();
                    int height = rect.get(i).getHeight();

                    System.out.println("가로의 길이는: " + width);
                    System.out.println("세로의 길이는: " + height);
                    System.out.println("넓이는: " + rect.get(i).getArea(width, height));
                    System.out.println("---------------------------------------");
                }
                System.out.println("Rectangle 인스턴스의 개수는: " + counter);

                break;
            }
        }
        sc.close();
    }
}


