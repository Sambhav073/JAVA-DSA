public class SearchRotatedArray {
    public static int Search(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        //found in mid
        if(arr[mid]==target){
            return mid;
        }
        //mid is in line 1
        if(arr[si]<=arr[mid]){
            //left of line
            if(arr[si]<=target && arr[mid]>=target){
                return Search(arr,target,si,mid-1);
            }
            else{
                return Search(arr,target,mid+1,ei);
            }
        }
        //mid is in line 2
        else{
            //right of line 2
            if(arr[mid]<=target && arr[ei]>=target){
                return Search(arr,target,mid+1,ei);
            }
            else{
                return Search(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(Search(arr,0,0,arr.length-1));
    }
}
