import java.net.StandardSocketOptions;

public class MinLenOfUnsortedArray {
    public static void main(String[] args) {
        int arr[]={10,12,20,30,25,40,32,31,35,50,60};
        int i=1;int si=arr.length-1;int ei=0;int cc=0;
        while(i<arr.length){
            int j=i;int c=0;
            while(j-1>=0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
                c++;
                cc++;
            }
            if(c!=0 && si>j){
                si=j;
            }
            if(c!=0){
                ei=i;
            }
            i++;
        }
        if(cc==0){
            System.out.println(0);
        }
        else{
            System.out.println(ei-si+1);
        }

    }
}
