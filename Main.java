
interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    
    public void show() {
        System.out.println("what a man broooo");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
