class Test {
    
    void show(String name) {
        System.out.println("string " + name);
    }

    void show(Thorr name) {
        System.out.println("Thorr object: " + name);
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        
        t1.show("abhiiii");
    }
}
class Thorr {}
