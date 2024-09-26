import java.util.*;
public class input2Graph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<Integer> arr[]=new ArrayList[n];
        for (int i = 0; i < n; i++) { 
            arr[i] = new ArrayList<Integer>(); 
        } 
        for(int i=0;i<e;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[a-1].add(b-1);
            arr[b-1].add(a-1);
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
