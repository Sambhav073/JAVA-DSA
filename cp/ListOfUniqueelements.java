import java.util.*;
public class ListOfUniqueelements {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,5,5,6};
        // if(arr[0]!=arr[1]){
        //     System.out.print(arr[0]+" ");
        // }
        // for(int i=1;i<arr.length-1;i++){
        //     if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
        //         System.out.print(arr[i]+" ");
        //     }
        // }
        // if(arr[arr.length-1]!=arr[arr.length-2]){
        //     System.out.println(arr[arr.length-1]+" ");
        // }
        System.out.print(arr[0]+" ");
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1] ){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
