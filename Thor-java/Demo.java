class Demo{
    public void m1()
        {
            System.out.println("thorrrrrrr");
        }

    
}
class B extends Demo{
    public void m1()
    {
        System.out.println("iron man");
    }

}
class Test{
    public static void main(String[] args){
    Demo d = new Demo();
    d.m1();
    B b1 = new B();
    b1.m1();
    Demo d1 = new B();
    d1.m1();
    

    }
}