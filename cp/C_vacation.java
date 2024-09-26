import java.util.*;
public class C_vacation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n[][]=new int[a][a];
        for(int i=0;i<a;i++){
          for(int j=0;j<a;j++){
            n[i][j]=sc.nextInt();
          }
        }
        int ans=0;
        int dp[][]=new int[n.length+1][n.length+1];
        for(int i=0;i<n.length;i++){
            ans=Math.max(ans,cal(n,1,i,dp)+n[0][i]);
        }
        System.out.println(ans);
    }
    public static int cal(int nums[][],int i,int j,int dp[][]){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int max=Integer.MIN_VALUE;
        for(int x=0;x<nums[0].length;x++){
            if(x!=j){
                max=Math.max(cal(nums,i+1,x,dp),max);
            }
        }
        return dp[i][j]=max+nums[i][j];
    }
}