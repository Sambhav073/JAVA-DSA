import java.util.*;
public class maxRectangularArea {
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        //for nsr
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //for nsl
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s1.peek();
            }
            s1.push(i);
        }
        //for current area:width nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int curr=height*width;
            maxArea=Math.max(curr,maxArea);
        }
        System.out.println("Max Area in histogram = "+maxArea);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }
}
