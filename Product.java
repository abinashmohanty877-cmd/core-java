public class Product {
    int pid;
    String pname;
    Product(int pid, String pname){
        this.pid = pid;
        this.pname = pname;
    }
    Product(Product p){
        this.pid =p.pid;
        this.pname = p.pname;
    }
}
class Test{
    public static void main(String[] args) {
        Product p1 = new Product(101,"phone");
        Product p2 = new Product(p1);
        System.out.println(p1.pid + " " + p1.pname);
        System.out.println(p2.pid + " " + p2.pname);
    }
}
