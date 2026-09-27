class Test { 
    public static void main(String[] args) { 
        // Part 1: testing the 'Thorr' Singleton
        Thorr t1 = Thorr.getThorr(); 
        Thorr t2 = Thorr.getThorr(); 
        System.out.println(t1 == t2); // Prints: true
        
        // Part 2: testing the 'Test' Singleton
        TestObj to1 = TestObj.getTestObj(); 
        TestObj to2 = TestObj.getTestObj(); 
        System.out.println(to1 == to2); // Prints: true
    } 
}

class Thorr {
    private static final Thorr instance = new Thorr();
    
    private Thorr() {} // Private constructor prevents instantiation
    
    public static Thorr getThorr() {
        return instance;
    }
}

class TestObj { 
    private static final TestObj t = new TestObj(); 
    
    private TestObj() {}
    
    public static TestObj getTestObj() {
        return t; 
    }
}
