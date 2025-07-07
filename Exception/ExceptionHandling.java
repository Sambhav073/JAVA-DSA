public class ExceptionHandling {

    public static void main(String[] args) {
        int i=0;
        int j=0;

        try{
            j=18/i;
        }
        catch(ArithmeticException e){
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Caught a general exception: " + e.getMessage());
        }
        finally{
            System.out.println("Finally block executed.");
        }

        System.out.println("Value of j: " + j);
        
    }
}