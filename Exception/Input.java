import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Input {
    public static void main(String[] args) throws IOException {
        
        // System.out.println("Enter a number:");
        //  int n= System.in.read();

        //  System.out.println("You entered: " + (n-48)); // Subtract 48 to convert ASCII to integer

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter a number:");
        String input = br.readLine();
        int n = Integer.parseInt(input);
        System.out.println("You entered: " + n);    
        br.close();
        in.close();

    }
}
