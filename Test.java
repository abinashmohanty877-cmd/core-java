class Test
{
    int x=10;
    public void m1(int x)
    {
        System.out.println(x);
        System.out.println(this.x);
    }
    public static void main(String[] args)
    {
        Test t1 = new Test();
        t1.m1(15);
    }
    
}