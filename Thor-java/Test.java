interface A{
    public void m1(int x);

}
interface B{
    public void m1(int y);
}
class Test implements A , B{
    public void m1(int x){
        System.out.println("abinash mohanty");
    }

public static void main(String[] args0){
    Test t = new Test();
    t.m1(1000);
    
    A a = t;
    a.m1(5565);

    B b = t;
    b.m1(5555);


}

}