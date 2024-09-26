import java.util.*;
public class binarySearchTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    static class BinarysearchTree{
        public static Node insert(Node root,int data){
            if(root==null){
                root=new Node(data);
                return root;
            }
            if(root.data>data){
                root.left=insert(root.left,data);
            }
            if(root.data<data){
                root.right=insert(root.right,data);
            }
            return root;
        }
        public static void inorderTraversal(Node root){
            if(root==null){
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data+" ");
            inorderTraversal(root.right);
        }
         public static void preorderTraversal(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        public static boolean search(Node root,int key){
            if(root==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            if(root.data>key){
                return search(root.left,key);
            }
            if(root.data<key){
                return search(root.right,key);
            }
            return false;
        }
        public static Node delete(Node root,int val){
            if(root.data>val){
                root.left=delete(root.left,val);
            }
            else if(root.data<val){
                root.right=delete(root.right,val);
            }
            else{
                //case 1
                if(root.left==null && root.right==null){
                    return null;
                }
                //case 2
                if(root.left==null){
                    return root.right;
                }
                else if(root.right==null){
                    return root.left;
                }
                //case 3 
                else{
                    Node ios=findInorderSuccessor(root.right);
                    root.data=ios.data;
                    root.right= delete(root.right,ios.data);
                }
            }
            return root;
        }
        public static Node findInorderSuccessor(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }
        public static void printInRange(Node root,int k1,int k2 ){
            if(root==null){
                return;
            }
            if(root.data>=k1 && root.data<=k2){
                printInRange(root.left,k1,k2);
                System.out.print(root.data+" ");
                printInRange(root.right, k1, k2);
            }
            else if(root.data>k2){
                printInRange(root.left,k1,k2);
            }
            else{
                printInRange(root.right, k1, k2);
            }
        }
        public static void printPath( ArrayList<Integer> list){
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
        public static void pathToLeaf(Node root, ArrayList<Integer> list){
            if(root==null){
                return;
            }
            list.add(root.data);
           if(root.left==null && root.right==null){
                printPath(list);
           }
           pathToLeaf(root.left,list);
           pathToLeaf(root.right,list);
           list.remove(list.size()-1);
        }
        public static boolean isValidBst(Node root,Node min,Node max){
            if(root==null){
                return true;
            }
            if(min!=null && root.data<=min.data){
                return false;
            }
            if(max!=null && root.data>=max.data){
                return false;
            }
            return isValidBst(root.left,min,root)&&isValidBst(root.right,root,max);
        }
        public static void mirrorBST(Node root){
            if(root==null){
                return;
            }
            mirrorBST(root.left);
            mirrorBST(root.right);
            Node temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
        public static Node CreateBST(int arr[],int si,int ei){
            if(si>ei){
                return null;
            }
            int mid=(si+ei)/2;
            Node root=new Node(arr[mid]);
            root.left=CreateBST(arr,si,mid-1);
            root.right=CreateBST(arr,mid+1,ei);
            return root;
        }
    }
    public static void main(String[] args) {
         BinarysearchTree bst=new BinarysearchTree();
         Node root=null;
        // int val[]={5,1,2,4,3,6,8,7,9};
        // BinarysearchTree bst=new BinarysearchTree();
        // Node root=null;
        // for(int i=0;i<val.length;i++){
        //     root=bst.insert(root,val[i]);
        // }
        // bst.inorderTraversal(root);
        // System.out.println();
        // if(bst.search(root, 12)){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("Not found");
        // }
        // bst.delete(root, 3);
        // bst.inorderTraversal(root);
        // System.out.println();
        //  bst.delete(root, 5);
        // bst.inorderTraversal(root);
        // int val[]={8,5,10,11,3,6};
        // for(int i=0;i<val.length;i++){
        //    root=bst.insert(root,val[i]);
        //  }
         //bst.printInRange(root,5,12);
        //  ArrayList<Integer> al=new ArrayList<>();
        //  bst.pathToLeaf(root,al);
        //System.out.println(bst.isValidBst(root, null, null));
        // bst.preorderTraversal(root);
        // System.out.println();
        // bst.mirrorBST(root);
        // bst.preorderTraversal(root);
        int val[]={3,5,6,8,10,11,12};
        root=bst.CreateBST(val, 0, val.length-1);
        bst.inorderTraversal(root);
       }
}
