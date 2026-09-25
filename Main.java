interface A { 
    void showA(); 
} 

interface B { 
    void showB(); 
} 

// Implement both interfaces in class C
class C implements A, B { 
    public void showA() { 
        System.out.println("dogger man"); 
    } 
    
    public void showB() { 
        System.out.println("goattt"); 
    } 
} 

public class Main { 
    public static void main(String[] args) { 
        C b1 = new C(); 
        b1.showA(); 
        b1.showB(); 
    } 
}
