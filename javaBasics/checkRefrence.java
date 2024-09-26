public class checkRefrence {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]=arr;
        arr2[0]=4;
        System.out.println(arr[0]);
    }
}
