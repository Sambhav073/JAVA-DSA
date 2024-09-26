import java.util.*;
public class IterationHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",140);
        hm.put("China",138);
        hm.put("US",36);
        hm.put("Nepal",6);

        //Iterate
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for(String k:keys){
            System.out.println("Keys="+k+" ,value="+hm.get(k));
        }
       
    }
}
