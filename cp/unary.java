import java.util.*;
public class unary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int x=0;
        while(n>0){
            String s=sc.nextLine();
            if(s.charAt(0)=='+' || s.charAt(s.length()-1)=='+'){
                x++;
            }else{
                x--;
            }
            n--;
        }
        System.out.println(x);
    }
}
