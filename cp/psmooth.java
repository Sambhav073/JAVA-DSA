import java.util.*;
public class psmooth{
    public static void main(String[] args) {
        int n=14;int max=Integer.MIN_VALUE;int p=8;
        if(n%2==0){
            System.out.println(2);
            max=2;
        }
        while(n%2==0){
            n=n/2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                System.out.println(i);
                max=i;
            }
            while(n%i==0){
                n=n/i;
            }
        }
        if(n>1){
            System.out.println(n);
            max=n;
        }
        if(max<=p){
            System.out.println("P_smooth");
        }
    }
}