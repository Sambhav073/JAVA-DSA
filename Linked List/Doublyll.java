import java.util.*;
public class Doublyll {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }
    public void print(){
        Node temp=head;
        System.out.print("Null<->");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public void reverse(){
        Node next;
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        Doublyll dll=new Doublyll();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println("size:"+size);
        dll.reverse();
        dll.print();
        // dll.removeFirst();
        // dll.print();
        // System.out.println(size);
    }
}
