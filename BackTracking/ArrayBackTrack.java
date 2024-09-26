public class ArrayBackTrack{
    public static void changeArray(int arr[],int i,int v){
        if(i==arr.length){
            return;
        }
        arr[i]=v;
        changeArray(arr,i+1,v+1);
        arr[i]=arr[i]-2;
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArray(arr,0,1);
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}