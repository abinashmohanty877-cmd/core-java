class Main {
    void show(String name)
    {
        System.out.println("Name : " + name);
    }
    void show(int[] numbers)
    {

        System.out.println("Array method");
    }
}
public class Test {
    public static void main(String[] args) {
        Main t = new Main();
        t.show("John");
        int[] arr = {1, 2, 3, 4, 5};
        t.show(arr);
    }
}