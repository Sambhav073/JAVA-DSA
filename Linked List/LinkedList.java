import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step1=create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        

        // step2--newNode next =head
        newNode.next = head;// link

        // step3--head=newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        size++;
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(key==temp.data){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public void reverse(){
        Node next;
        Node curr=tail=head;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthFromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
    public Node FindMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //Find mid node
        Node mid=FindMiddle(head);
        //reverse right half
        Node next;
        Node curr=mid;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        //check for palindrome
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
    public static boolean isCycle(){//floyds finding cycle algorithim
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        //detect whether cycle is present or not
         Node slow=head;
        Node fast=head;
        boolean exists=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                exists=true;
                break;
            }
        }
        if(exists==false){
            return ;
        }
        //find meeting point
        slow=head;
        Node prev=fast;
        while(fast!=slow){
            prev=fast;
            fast=fast.next;
            slow=slow.next;
        }
        //make the last node point to null
        prev.next=null;
    }
    public void ZigZag(){
        Node mid=FindMiddle(head);
        //reverse right half
        Node next;
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node lefthead=head;
        Node righthead=prev;
        Node nextl,nextr;
        while(lefthead!=null && righthead!=null){
            nextl=lefthead.next;
            lefthead.next=righthead;
            nextr=righthead.next;
            righthead.next=nextl;
            lefthead=nextl;
            righthead=nextr;
        }
    }
    public  Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getmid(head);
        //left and right mergesort
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //merge
        return merge(newLeft,newRight);
    }
    public  Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public  Node merge(Node head1,Node head2){
        Node mergedll=new Node(-1);
        Node temp=mergedll;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                 temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
             temp.next=head1;
             head1=head1.next;
             temp=temp.next;
        }
        while(head2!=null){
          temp.next=head2;
            head2=head2.next;
           temp=temp.next;
        }
        return mergedll.next;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // ll.addFirst(2);

        // ll.addFirst(1);

        // ll.addLast(4);

        // ll.addLast(5);
        // ll.print();
        // ll.add(2, 3);
        // ll.print();
        // System.out.println(ll.size);
        // ll.ZigZag();
        // ll.print();
        // ll.reverse();
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(11));
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(11));
        // ll.deleteNthFromEnd(3);
        // ll.print();
        // ll.deleteNthFromEnd(4);
        // ll.print();
        // ll.addFirst(2);

        // ll.addFirst(1);

        // ll.addLast(2);

        // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.checkPalindrome());
        // head = new Node(1);
        // head.next= new Node(2);
        // head.next.next=new Node(3);
        // head.next.next.next=head.next;
        // //System.out.println(isCycle());
        // removeCycle();
        // ll.print();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();
    }
}