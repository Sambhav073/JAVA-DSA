import java.util.*;
public class abbreviation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            String s=sc.nextLine();
            if(s.length()>10){
               System.out.println(s.charAt(0)+Integer.toString(s.length())+s.charAt(s.length()-1)); 
            }else{
                System.out.println(s);
            }
        }
    }
}