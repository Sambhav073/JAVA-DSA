public class binarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,2,4,4,4,5,5,6,7};
        int target=2;
        int low=0;
        int high=arr.length-1;int r=0;int l=0;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     if(arr[mid]==target){
        //         l=mid;r=mid;
        //         while(l>low){
        //             if(arr[l-1]!=target){
        //                 break;
        //             }
        //             l--;
        //         }
        //         while(r<high){
        //             if(arr[r+1]!=target){
        //                 break;
        //             }
        //             r++;
        //         }
        //         break;
        //     }else if(arr[mid]<target){
        //         low=mid+1;
        //     }else{
        //         high=mid-1;
        //     }
        // }
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target && arr[mid-1]!=target){
                l=mid;
                break;
            }else if(arr[mid]<target){
                low+=1;
            }else{
                high-=1;
            }
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target && arr[mid+1]!=target){
                r=mid;
                break;
            }else if(arr[mid]<=target){
                low+=1;
            }else{
                high-=1;
            }
        }
        System.out.println(l+" "+(r));
    }
}
