interface A{
    default void m1()
    {
    System.out.println("johnnn");
    }
}
class Test implements A {
    
        public void m1()
        {
            System.out.println("motuuuu");
        }
        public  static void main(String[] args){
            Test t1 = new Test();
            t1.m1();
        }
    
}
