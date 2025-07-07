
enum Status{
    SUCCESS,
    FAILURE,
    PENDING,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED

}

enum Laptop{
    DELL(20000),
    HP(25000),
    LENOVO(30000),
    ASUS(35000),
    ACER(40000),
    APPLE(100000);
    
    private int price;
    Laptop(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        // Status s=Status.SUCCESS;
        // System.out.println(s);

        // Status arr[]=Status.values();
        // for(Status s:arr){
        //     System.out.println(s+" "+s.ordinal());
        // }

        // Laptop l= Laptop.APPLE;
        // System.out.println(l);
        // System.out.println(l.getPrice());

        for(Laptop l:Laptop.values()){
            System.out.println(l+" "+l.getPrice());
        }
    }
}
