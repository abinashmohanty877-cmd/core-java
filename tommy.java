public class tommy
{
    public void m1()
    {
      System.out.println("lion");  
    }
    class B extends tommy
    {
        public void m2()
        {
            System.out.println("child lion");
        }
    }
}
class c extends tommy
{
    public void m3()
    {
        System.out.println("grand child lion");
    }
}
class Test
{
    public static void main(String[] args)
    {
        c obj = new c();
        obj.m1();
        obj.m3();
    }
}