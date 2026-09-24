class parent
{
   public void m1()
   {
      System.out.println("tommmy");
   }
}
class child extends parent
{
   public void m2()
   {
      System.out.println("child tommy");
   }
}
class Test
{
   public static void main(String[] args){
      parent p1 = new parent();
      p1.m1();
      System.out.println("----------");
      child c1 = new child();
      c1.m2();
      c1.m2();
   }

}