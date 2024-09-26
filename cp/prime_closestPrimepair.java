import java.util.*;
public class prime_closestPrimepair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int c=0;
        for(int i=n-1;i>=0;i--){
            if(checkPrime(i) && checkPrime(n-i)){
                System.out.println("The pair is "+i+","+(n-i));
                
                c++;
                break;
            }
        }
        if(c==0){
            System.out.println("No pair exists");
        }
    }
    public static boolean checkPrime(int n){
        if(n==1 || n==0){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
