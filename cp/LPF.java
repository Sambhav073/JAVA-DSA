import java.util.*;
public class LPF{
    public static void main(String[] args) {
        int arr[]={20,15,24,36,25};
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean prime[] = new boolean[arr[i] + 1];
            for(int j=2;j<prime.length;j++){
                prime[j]=true;
            }
     
            for (int p = 2; p * p <= arr[i]; p++) {
                if (prime[p] == true) {
                    for (int j = p * p; j <= arr[i]; j += p)
                        prime[j] = false;
                }
            }
 
            for (int j = 2; j <= arr[i]; j++) {
                if (prime[j] == true && arr[i]%j==0){
                    l.add(j);
                    break;
                }       
            }
        }
        System.out.println(l);
    }
}