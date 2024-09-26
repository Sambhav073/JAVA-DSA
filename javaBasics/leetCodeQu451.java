import java.util.*;
public class leetCodeQu451{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ll=new ArrayList<>();
        int nums[]={0,-1,1,2,-1,4};
        int arr[][]=new int[nums.length][2];
        for(int i=0;i<nums.length-1;i++){
           
            for(int j=i+1;j<nums.length;j++){
                ArrayList<Integer> l=new ArrayList<>();
                l.add(nums[i]);
                l.add(nums[j]);
                ll.add(l);
            }
        }
        System.out.println(ll);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i][0]+" "+arr[i][1]);
        // }
    }
}