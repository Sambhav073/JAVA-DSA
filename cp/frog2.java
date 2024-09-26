public class frog2 {
    public static void main(String[] args) {    
        int nums[]={40,10,20,70,80,10,20,70,80,60};
        int n=nums.length;
        int k=4;
        int dp[]=new int[nums.length+1];
        dp[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i+j<nums.length){
                    min=Math.min(dp[j+i]+Math.abs(nums[j+i]-nums[i]),min);
                }
                dp[i]=min;
            }
        }
        System.out.println(dp[0]);
        //System.out.println(cal(nums,0,k,dp));
        
    }
    public static int cal(int nums[],int n,int k,int dp[]){
        if(n==nums.length-1){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(n+i<nums.length){
                min=Math.min(cal(nums,n+i,k,dp) + Math.abs(nums[n+i]-nums[n]),min);
            }
        }
        return dp[n]=min;
    }
}
