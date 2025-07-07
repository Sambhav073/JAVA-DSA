
class Mobile{
    String brand;
    int price;
    static String name;

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
    public static void showStaticDetails() {
        System.out.println("Static Name: " + name);
    }
    
}


public class UnderstandStatic{
    public static void main(String[] args) {
        // Mobile mobile1 = new Mobile();
        // mobile1.brand = "Samsung";
        // mobile1.price = 1000;
        // mobile1.name = "Galaxy S21";
        // mobile1.showDetails();

        // Mobile mobile2 = new Mobile();
        // mobile2.brand = "Apple";
        // mobile2.price = 1200;
        // mobile2.name = "iPhone 13";
        // mobile2.showDetails();
        // Mobile.name = "Smartphone"; // Static variable can be accessed through the class name
        // System.out.println("Updated Name: " + Mobile.name);
        // mobile1.showDetails(); // This will show the updated static name
        // mobile2.showDetails(); // This will also show the updated static name

        
    }
}
