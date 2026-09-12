public class tommy {
    public Object m1()
    {
        System.out.println("tommyyy");
        return 10;
    }
}
class B extends tommy
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
        tommy t = new tommy();
        t.m1();
    }
}

    
