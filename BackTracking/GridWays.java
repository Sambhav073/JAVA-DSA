public class GridWays {
    public static int countWays(int i,int j,int m,int n){
        if(i>=m-1 || j>=n-1){
            return 1;
        }
        int BotCount=countWays(i+1,j,m,n);
        int rightCount=countWays(i,j+1,m,n);
        return rightCount+BotCount;
    }
    public static void main(String[] args) {
        int m=3,n=3;
        int ans=countWays(0,0,m,n);
        System.out.println(ans);
    }
}
