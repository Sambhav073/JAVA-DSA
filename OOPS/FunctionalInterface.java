interface A {
    void show();
}
public class FunctionalInterface {
    public static void main(String[] args) {
        A obj=new A(){
            @Override
            public void show() {
                System.out.println("Hello, this is a functional interface example.");
            }
        };
        obj.show();
        A lambdaObj = () -> System.out.println("Hello from a lambda expression!");
        lambdaObj.show();
    }
}
