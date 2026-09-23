
class Test{
     static int x = 10;
     static{
        System.out.println("Hulkkkkk");
        m1();
     }
     public static void m1(){
        System.out.println ("hourseee");
     }
     static{
        System.out.println("iron man");
        m2();
     }
     public static void m2(){
        System.out.println("tigerrrrrr");
    }
     static int y = 20;
     public static void main(String[] args){
        System.out.println("houseeee");
        Test.m1();
        System.out.println("mouseeee");
    }
}