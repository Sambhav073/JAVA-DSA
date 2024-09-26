import java.util.*;
public class stack {
     static class queue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        void push(int n){
            s1.push(n);
        }
        int pop(){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int a=s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return a;
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.push(0);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
