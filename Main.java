class Test{
    void show(int a){
        System.out.println("integer method");
    }
    void show(String s){
        System.out.println("string methoid");
    }
}
public class Main{
    public static void main(String[] args){
        Test t1 = new Test();
        t1.show(100);
        t1.show("abhiiiii");
    }
}
