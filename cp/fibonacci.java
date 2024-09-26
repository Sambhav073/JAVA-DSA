public class fibonacci {
    public static void main(String[] args) {
        int dp[]=new int[8];
        System.out.println(fib(7,dp));
    }
    public static int fib(int n,int dp[]){
        if(n==0){
            return 0;
        }
        if( n==1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]= fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }
}
