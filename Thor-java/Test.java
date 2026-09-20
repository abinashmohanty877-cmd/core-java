class A{
    public A m1()
    {
        System.out.println("lionnnn");
        return new A();
    }
}
class B extends A{
    public  B m1()
    {
        System.out.println("tigeeeer");
        return new B();
    }
}
class Test{
    public static void main(String args[])
    {
        A a = new A();
        a.m1();
         B b = new B();
         b.m1();
         
    }
}