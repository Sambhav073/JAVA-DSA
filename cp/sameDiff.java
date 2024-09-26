import java.util.*;
public class sameDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int c=0;
            int i=0;
            int j=1;
            while(i<n && j<n){
                if(arr[i]-i==arr[j]-j){
                    c++;
                }
                i++;j++;
            }
            System.out.println(c);
            t--;
        }
    }
}
