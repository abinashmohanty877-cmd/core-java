class phone{
    public void vivo(int price)
    {
        System.out.println(price);
    }
    public void samsung(String color)
    {
        System.out.println(color);
    }
}
class Test{
    public static void main(String[]args)
    {
        phone k = new phone();
        k.vivo(5455474);
        k.samsung("black");
    }
}