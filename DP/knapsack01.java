public class knapsack01 {
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int ans=cal(val,wt,val.length,7);
        System.out.println(ans);
    }
    public static int cal(int val[],int wt[],int i,int w){
        if(i==0 || w==0){
            return 0;
        }
        if(wt[i-1]<=w){
            int a=val[i-1]+cal(val,wt,i-1,w-wt[i-1]);
            int b=cal(val,wt,i-1,w);
            return Math.max(a,b);
        }
        return cal(val,wt,i-1,w);
    }
}
