class Demo
{
    static Demo d1 = new Demo();
    {
        System.out.println("interface block");
    }
    public static void main(String[] args)
    {
        new Demo();
    }
}