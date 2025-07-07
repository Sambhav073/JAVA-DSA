
 class SambhavException extends Exception {
    public SambhavException(String message) {
        super(message);
    }
}
public class CutomException {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try {
            if (i == 0) {
                throw new SambhavException("Custom exception: i cannot be zero.");
            }
            j = 18 / i;
        } catch (SambhavException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
