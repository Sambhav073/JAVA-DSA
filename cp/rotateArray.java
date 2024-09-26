public class rotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};int n=arr.length;
        int k=2;
        int bk[]=new int[2];int j=0;
        for(int i=n-k;i<n;i++){
            bk[j]=arr[i];
            j++;
        }
        int ans[]=new int[n];
        int i=0;
        while(i<k){
            ans[i]=bk[i];
            i++;
        }
        int x=0;
        while(i<n){
            ans[i]=arr[x];
            i++;x++;
        }
        for(i =0;i<n;i++){
            System.out.println(ans[i]);
        }
    }

}
