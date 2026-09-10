public class abhi { 
    public int m1() { 
        System.out.println("thorrrr"); 
        return 10; 
    } 
} 

class A extends abhi { 

    public int m1() { 
        System.out.println("iron man"); 
        return 20; 
    } 
} 

class Test { 
    public static void main (String[] args) { 
        abhi a = new A(); 
        System.out.println(a.m1()); 
    } 
}
