package _05_class._access_modifier._pack5;

public class SingletonEx {
    public static void main(String[] args) {
//        Singleton ex1 = new Singleton();
//        compile error

        Singleton s2 = Singleton.getSingleton();
        Singleton s3 = Singleton.getSingleton();
        if (s2 == s3) {
            System.out.println("s2,s3 is same");
            System.out.println(s2);
            System.out.println(s3);
        }else System.out.println("s2,s3 is not same");

    }
}
