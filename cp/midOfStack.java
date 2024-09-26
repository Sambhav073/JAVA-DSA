public class midOfStack {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
        Node(int data,Node next,Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }
    static class Stack{
        int c=0;
        Node head;Node middle;
        void push(int n){
            Node newNode=new Node(n);c++;
            if(head==null){
                head=newNode;
                middle=newNode;
            }
            else{
                newNode.next=head;
                head.prev=newNode;
                head=newNode;
                if(c%2!=0){
                    middle=middle.prev;
                }
            }
        }
        int peek(){
            return head.data;
        }
        int pop(){
            if(head==null){
                return -1;
            }
            if(c%2!=0){
                middle=middle.next;
            }
            c--;
            int ans=head.data;
            head=head.next;
            head.prev=null;
            return ans;
        }
        int mid(){
            return middle.data;
        }
        int size(){
            return c;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.mid());
        System.out.println(s.pop());
        System.out.println(s.mid());
        System.out.println(s.size());
    }
}
