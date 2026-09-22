interface A{
    default void m1()
    {
        System.out.println("abhiiiiii");
    }
}
class Test implements A
{
   public void m1() 
   {
    System.out.println("tigerrrrr");
   }

public static void main(String[] args){
 
    Test t1 = new Test();
    t1.m1();

    
}
}



