import java.util.*;

public class Classroom {
    public static void main(String[] args) {
        // ArrayList is part of JAVA collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        // add operation in list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //swap 2 elements in arrayList
        int temp=list.get(0);
        list.set(0,list.get(1));
        list.set(1,temp);
        System.out.println(list);
        // Get Operation
        int element = list.get(2);
        System.out.println(element);

        // Remove Element
        list.remove(2);
        System.out.println(list);

        // Set
        list.set(2, 10);
        System.out.println(list);

        // Contains element
        System.out.println(list.contains(1));
        System.out.println(list.contains(12));

        list.add(1, 5);
        System.out.println(list);

        // size of array
        System.out.println(list.size());
    }

}