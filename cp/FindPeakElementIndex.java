public class FindPeakElementIndex {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,9,2,1,0};
        int low=0;int high=arr.length-1;
        int ans=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(low<arr.length-2 && arr[low]>arr[low+1]){
                ans=low;break;
            }
            if(high>0 && arr[high]>arr[high-1]){
                ans=high;break;
            }
            if(mid+1<=high && mid-1>=low && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                ans=mid;
                break;
            }else if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
