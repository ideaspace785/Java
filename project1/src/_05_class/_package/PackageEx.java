package _05_class._package;

// import 문으로 다른 패키지 클래스 사용을 명시
import _05_class._package.maeil.Choco;
import _05_class._package.seoul.Banana;

public class PackageEx {

    public static void main(String[] args) {

        // 1
        Choco m1 = new Choco();
        Banana m2 = new Banana();

        // 2
        Choco c1 = new Choco();
        Banana b1 = new Banana();

    }

}







