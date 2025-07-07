public class detectCycle {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    static class Linkedlist{
        static Node head=null;
         void add(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
            }else{
                newNode.next=head;
                head=newNode;
            }
        }
         void makeCycle(){
            Node temp=head;
            for(int i=1;i<3;i++){
                temp=temp.next;
            }
            Node temp2=head;
            while(temp2.next!=null){
                temp2=temp2.next;
            }
            temp2.next=temp;
        }
         int detectCycle(){
            Node slow=head.next;
            Node fast=head.next.next;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next.next;
            }
            fast=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow.val;
        }
         void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(6);
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.print();
        ll.makeCycle();
        System.out.println(ll.detectCycle());
    }
}
