public class c {
    public Object m1()
    {
        System.out.println("tommyyy");
        return null;
    }
}
class B extends c
{
    public String m1()
    {
        System.out.println("dogs");
        return null;
    }
}
class Test 
{
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        
    }
}
