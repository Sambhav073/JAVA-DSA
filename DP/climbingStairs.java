public class climbingStairs {
    public static int WaysToGo(int n){
        if(n==1 || n==0){
            return 1;
        }
        int c1=WaysToGo(n-1);
        int c2=WaysToGo(n-2);
        return c1+c2;
    }
    public static int memo(int n,int dp[]){
        if(n==1 || n==0){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=memo(n-1,dp)+memo(n-2,dp);
        return dp[n];
    }
    public static int tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        int arr[]=new int[n+1];
        System.out.println(WaysToGo(n));
        System.out.println(memo(n,arr));
        System.out.println(tabulation(n));
    }
}
