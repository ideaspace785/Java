package _05_class._final;

public class ConstEx {
    public static void main(String[] args) {

        //Static field 이기 때문에 객체 생성 필요없이 바로 호출 가능
        System.out.println(Const.GREETING);
        System.out.println(Const.MAX_VALUE);
    }
}
