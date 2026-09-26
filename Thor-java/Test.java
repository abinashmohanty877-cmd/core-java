class Test{
    Test()
    {
        System.out.println("constructor");
    }
    {
        System.out.println("instan block");
    }
    public static void main(String[] args)
    {
        System.out.println("main start");
        new Test();
        System.out.println("main end");
    }
}