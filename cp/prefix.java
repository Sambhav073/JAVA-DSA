import java.util.*;
public class prefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,-5,2,3,0};
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int arP[]=new int[arr.length];
        int arR[]=new int[arr.length];
        int max_p=0;int max_r=0;int ans=0;
        for(int i=0;i<arr.length;i++){
            arP[i]=Math.max(arr[i]*p,max_p);
            System.out.print(arP[i]+" ");
            max_p=arP[i];
        }
        System.out.println();
        for(int i=arr.length-1;i>=0;i--){
            arR[i]=Math.max(arr[i]*r,max_r);
            System.out.print(arR[i]+" ");
            max_r=arR[i];
        }
        for(int j=1;j<arr.length-1;j++){
            ans=Math.max(ans,arP[j-1]+arr[j]*q+arR[j+1]);
        }
        System.out.println(trappingrainwater.java);
        System.out.println(ans);
    }
}
