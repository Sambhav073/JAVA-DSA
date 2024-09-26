public class binarySearch {
    public static int binarySearch(int arr[],int si,int ei,int target){
        if(si>ei){
            return -1;
        }
        int mid=(si+ei)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target<arr[mid]){
            return binarySearch(arr,si,mid-1,target);
        }else{
           return  binarySearch(arr,mid+1,ei,target); 
        }
    } 
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 0, arr.length-1, 6));
    }
}
