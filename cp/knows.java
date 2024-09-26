import java.util.Scanner;

public class knows {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        int n=sc.nextInt();int count=0;
        while(n>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int ct=0;
            if(a==1){
                ct++;
            }
            if(b==1){
                ct++;
            }
            if(c==1){
                ct++;
            }
            if(ct>=2){
                count++;
            }
            n--;
        }
        System.out.println(count);
    }
}
