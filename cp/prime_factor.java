import java.util.*;
public class prime_factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                int bk=n/i;
                int c=0;
                for(int j=2;i<=Math.sqrt(i);j++){
                    if(i%j==0){
                        c++;
                    }
                }
                int c2=0;
                for(int j=2;j<=Math.sqrt(bk);j++){
                    if(bk%j==0){
                        c2++;
                    }
                }
                if(c==0 && c2==0){
                    System.out.println(i+" and "+bk+" are the required pairs");
                }
            }
        }
        System.out.println("no prime pairs might have been found above");
    }
}
