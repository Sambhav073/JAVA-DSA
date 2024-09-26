public class FindPairLessThanTarget {
    public static void main(String[] args) {
        int arr[]={2,3,3,4,5,6,6,7,8};int target=8;
        int sum=0;
        int high=arr.length-1;int low=0;
        while(low<=high){
            if(arr[low]+arr[high]<=target){
                sum+=high-low;
                low++;
            }else if(arr[low]+arr[high]>target){
                high--;
            }else{
                low++;
            }
        }
        System.out.println(sum);
    }
}
