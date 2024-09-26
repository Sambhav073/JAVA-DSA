import java.util.*;
public class hashMapOperations{
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        

        //Insert data
        hm.put("India",140);
        hm.put("China",138);
        hm.put("US",38);
        System.out.println(hm);

        //Get-O(1)
        int population=hm.get("India");
        System.out.println(population  );


        //ContainsKey-O(1)
        System.out.println(hm.containsKey("India"));


        //Remove-O(1)
        hm.remove("China");
        System.out.println(hm);


        //Size
        System.out.println(hm.size());


        //Is empty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}