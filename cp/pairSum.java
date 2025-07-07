public class pairSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 15;
        System.out.println(tripletsum(arr, target));
    }
    public static boolean tripletsum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            int newtarget = target - arr[i];
            if(targetSum(i,arr, newtarget)){
                return true;
            }
        }
        return false;
    }
    public static boolean targetSum(int i, int arr[], int target) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start] + arr[end] == target && start != i && end != i){
                return true;
            } else if(arr[start] + arr[end] < target){
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}
