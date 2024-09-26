public class SumOfsubArray {
    public static void main(String[] args) {
        int arr[]={2,1,3,2};
        int sum[]=new int[arr.length];
        sum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        int ans=0;
        for(int i=0;i<sum.length;i++){
            ans+=sum[i];
        }
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<i;j++){
                ans+=sum[i]-sum[j];
            }
        }
        System.out.println(ans);
    }
}
