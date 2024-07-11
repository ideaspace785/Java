package _05_class._access_modifier._pack3;

public class B {
    public void method(){
        A a = new A();

        a.field1=12;
        a.field2=22;
    //  a.field3=222; //private field 이므로 Compile Error

        a.method1();
        a.method2();
//      a.method3();  //private method 이므로 Compile Error

    }
}
