import java.util.*;
public class targetSum {
    public static void main(String[] args) {
        int arr[]={1,4,10,2,5,9,7,2};
        int k=20;
        Arrays.sort(arr);
        int i=0;int j=arr.length-1;
        boolean ans=false;
        while(i<j){
            if(arr[i]+arr[j]==k){
                ans=true;
                break;
            }
            if(arr[i]+arr[j]<k){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(ans);
    }
}
