import java.util.*;
public class prime_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==0){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
        int rev=0;
        while(n!=0){
            int bk=n%10;
            rev=rev*10+bk;
            n=n/10;
        }
        c=0;
        for(int i=2;i<=Math.sqrt(rev);i++){
            if(rev%i==0){
                c++;
            }
        }
        if(c==0){
            System.out.println(rev+" is a prime number");
        }else{
            System.out.println(rev+" is not a prime number");
        }
    }
}
