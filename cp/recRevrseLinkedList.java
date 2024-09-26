public class recRevrseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class LinkedList{
        Node head;
        void insert(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }
            else{
                newNode.next=head;
                head=newNode;
            }
        }
        Node reverse(Node head){
            if(head.next==null){
                return head;
            }
            Node newNode=reverse(head.next);
            head.next=newNode;
            return head;
        }
        void rev(){
            head=reverse(head);
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(0);
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.display();
        ll.rev();
        ll.display();
    }
}
