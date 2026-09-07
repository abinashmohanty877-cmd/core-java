abstract class A{
    abstract void m1();
}
class B extends A{
    public void m1(){
        System.out.println("it is a example of abtsract modifier");
    }
}
public class Test{
    public static void main(String[] args) {
        A a1 = new B();
        a1.m1();
    }
}