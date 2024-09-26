import java.util.*;
public class priorityQueue {
     static class Student implements Comparable<Student> {
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//comparator is an interface in java
        // pq.add(3); //O(logn)
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);
        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek());  //O(1)
        //     pq.remove(); //O(logn);
        // }
        PriorityQueue<Student> pq = new PriorityQueue<>();
        Student s1=new Student("A",3);
        pq.add(s1);
        pq.add(new Student("B",1));
        pq.add(new Student("C",4));
        pq.add(new Student("D",2));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}
