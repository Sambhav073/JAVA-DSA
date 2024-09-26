import java.util.*;
public class subArraySum {
    public static void main(String[] args) {
        int arr[]={2,5,1,0,-1,5};
        int sumArray[]=new int[arr.length];
        sumArray[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            sumArray[i]=arr[i]+sumArray[i-1];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(sumArray[i]+" ");
        }
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int l[]=new int[q];
        int r[]=new int[q];
        int ans[]=new int[q];
        for(int i=0;i<q;i++){
            l[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            r[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            ans[i]=sumArray[r[i]]-sumArray[l[i]]+arr[l[i]];
        }
        for(int i=0;i<q;i++){
            System.out.println(ans[i]);
        }
    }
}
