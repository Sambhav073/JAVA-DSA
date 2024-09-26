import java.util.*;
public class stackUsingLL {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
    class stack{
        Node head;
        void push(int n){
            if(head==null){
                head=new Node(n);
            }else{
                Node newNode=new Node(n,head);
                head=newNode;
            }
        }
        int pop(){
            int a=head.val;
            head=head.next;
            return a;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
