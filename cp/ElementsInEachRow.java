import java.util.*;
public class ElementsInEachRow {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,2,1,4},{2,1,3,5},{1,3,2,4}};
        ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<arr[0].length;i++){
        //     int n=arr[0][i];int c=0;
        //     for(int j=1;j<arr.length;j++){
        //         for(int k=0;k<arr[0].length;k++){
        //             if(arr[j][k]==n){
        //                 c++;
        //             }
        //         }
        //         if(c==0){
        //             break;
        //         }
        //     }
        //     if(c==arr.length-1){
        //         list.add(n);
        //     }
        // }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr[0].length;i++){
            if(hm.containsKey(arr[0][i])){
                hm.replace(arr[0][i],hm.get(arr[0][i]+1));
            }else{
                hm.put(arr[0][i],1);
            }
        }
        for(int i=1;i<arr.length;i++){
            HashMap<Integer,Integer> h=new HashMap<>();
            for(int j=0;j<arr[0].length;j++){
                if(h.containsKey(arr[i][j])){
                    hm.replace(arr[i][j],hm.get(arr[i][j]+1));
                }else{
                    hm.put(arr[i][j],1);
                }
            }
            for(int j=0;i<hm.size();j++){
                
            }
        }
        System.out.println(list);
    }
}
