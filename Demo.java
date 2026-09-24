class Demo{
    {
        System.out.println("block");
        new Demo();
    }
    public static void main(String[] args)
    {
        new Demo();
    }
}