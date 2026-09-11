 class con3{
    con3(){
        this ("abc");
            System.out.println("thor");
    }
        con3(String s){
                System.out.println("hulk");

    }
}
class B extends con3{
    B(int x){
        super();
        System.out.println("iron man");
    }
}
public class Test{
        public static void main(String[] args){
        B b1 = new B(10);
        con3 a1 = new con3();
    }
}