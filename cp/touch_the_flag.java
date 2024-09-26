public class touch_the_flag {
    public static void main(String[] args) {
        int arr[]={2,0,1,2,1,1};
        int l=0;int m=0;int r=arr.length-1;
        while(m<=r){
            if(arr[m]==0){
                int bk=arr[l];
                arr[l]=arr[m];
                arr[m]=bk;
                m++;
                l++;
            }else if(arr[m]==2){
                int bk=arr[r];
                arr[r]=arr[m];
                arr[m]=bk;
                r--;
            }else{
                m++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
