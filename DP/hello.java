@FunctionalInterface
interface A{
    void hello();
}

public class hello {
    public static void main(String[] args) {
         A a = () -> System.out.println("Hello");
         a.hello();
    } 
}
