import java.util.*;
public class binaryTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binarytree{
        static int idx=-1;
        static Node buildtree(int arr[]){
            idx++;
            if(arr[idx]==-1){
                return null;
            }
            Node newNode=new Node(arr[idx]);
            newNode.left=buildtree(arr);
            newNode.right=buildtree(arr);
            return newNode;
        }
        public static void preOrdertraversal(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrdertraversal(root.left);
            preOrdertraversal(root.right);
        }
        public static void inOrdertraversal(Node root){
            if(root==null){
                return;
            }
                inOrdertraversal(root.left);
                System.out.print(root.data+" ");
                inOrdertraversal(root.right);
            }
            public static void postOrdertraversal(Node root){
                if(root ==null){
                    return;
                }
                postOrdertraversal(root.left);
                postOrdertraversal(root.right);
                System.out.print(root.data+" ");
            }
        
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
           // q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                // if(currNode==null){
                //     System.out.println();
                //     if(q.isEmpty()){
                //         break;
                //     }
                //     else{
                //         q.add(null);
                //     }
                // }
                //else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                //}
            }
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
        public static int countNodes(Node root){
             if(root==null){
                return 0;
            }
            int lc=countNodes(root.left);
            int rc=countNodes(root.right);
            return lc+rc+1;
        }
        public static int sum(Node root){
             if(root==null){
                return 0;
            }
            int ls=sum(root.left);
            int rs=sum(root.right);
            return ls+rs+root.data;
        }
        public static int diameter(Node root){ //O(n^2)
            if(root==null){
                return 0;
            }
            int leftDiameter=diameter(root.left);
            int leftHeight=height(root.left);
            int rightDiameter=diameter(root.right);
            int rightHeight=height(root.right);

            int selfDiameter=leftHeight+rightHeight+1;
            return Math.max(selfDiameter,Math.max(leftDiameter,rightDiameter));
        }
        static class Info{
            int diam;//diameter of tree
            int h;//height of tree
            Info(int diam,int h){
                this.diam=diam;
                this.h=h;
            }
        }
        public static Info diameter2(Node root){//O(n)
            if(root==null){
                return new Info(0,0);
            }
            Info leftInfo=diameter2(root.left);
            Info rightInfo=diameter2(root.right);
            int finalDiameter=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.h+rightInfo.h+1);
            int finalHeight=Math.max(leftInfo.h,rightInfo.h) + 1;
            return new Info(finalDiameter,finalHeight);
        }
        public static boolean isIdentical(Node root,Node subRoot){
            if(root==null && subRoot==null){
                return true;
            }
            else if(root==null || subRoot==null || root.data!=subRoot.data){
                return false;
            }
            if(!isIdentical(root.left,subRoot.left)){
                return false;
            }
            if(!isIdentical(root.right,subRoot.right)){
                return false;
            }
            return true;
        }
        public static boolean isSubtree(Node root,Node subRoot){
            if(root==null){
                return false;
            }
            if(root.data==subRoot.data){
                if(isIdentical(root,subRoot)){
                    return true;
                }
                return false;
            }
            return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        }
        public static class info{
            int hd;
            Node node;
            info(int hd,Node node){
                this.hd=hd;
                this.node=node;
            }
        }
        public static void topView(Node root){
            Queue<info> q=new LinkedList<>();
            HashMap<Integer,Node> map=new HashMap<>();
            int min=0;int max=0;
            q.add(new info(0,root));
            while(!q.isEmpty()){
                info curr=q.remove();
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new info(curr.hd-1,curr.node.left));
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new info(curr.hd+1,curr.node.right));
                    max=Math.max(max,curr.hd+1);
                }
            }
            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }
        }
        public static void klevel(Node root,int level,int k){
            if(root==null){
                return;
            }
            if(level==k){
                System.out.print(root.data+" ");
            }
            klevel(root.left,level+1,k);
            klevel(root.right,level+1,k);
        }
        public static boolean getpath(Node root,int n,ArrayList<Node> path){
            if(root==null){
                return false;
            }
            path.add(root);
            if(root.data==n){
                return true;
            }
            boolean foundLeft=getpath(root.left,n,path);
            boolean foundRight=getpath(root.right,n,path);
            if(foundLeft || foundRight){
                return true;
            }
            path.remove(path.size()-1);
            return false;
        }
        public static Node LCA(Node root,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();
            getpath(root,n1,path1);
            getpath(root,n2,path2);
            int i=0;
            while(i<path1.size()&&i<path2.size()){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
                i++;
            }
            return path1.get(i-1);
        }8
        public static Node LCA2(Node root,int n1,int n2){
            if(root==null || root.data==n1 || root.data==n2){
                return root;
            }
            Node leftcount=LCA2(root.left,n1,n2);
            Node rightcount=LCA2(root.right,n1,n2);
            if(leftcount==null){
                return rightcount;
            }
            if(rightcount==null){
                return leftcount;
            }
            return root;
        }
        public static int lcaDist(Node root,int n){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int leftDist=lcaDist(root.left,n);
            int rightDist=lcaDist(root.right,n);
            if(leftDist==-1 && rightDist==-1){
                return -1;
            }
            else if(leftDist==-1){
                return rightDist+1;
            }
            else{
                return leftDist+1;
            }
        }
        public static int minDist(Node root,int n1,int n2){
            Node lca=LCA2(root,n1,n2);
            int dist1=lcaDist(lca,n1);
            int dist2=lcaDist(lca,n2);

            return dist1+dist2;
        }
        public static int Kancestor(Node root,int n,int k){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int leftcount=Kancestor(root.left,n,k);
            int rightcount=Kancestor(root.right,n,k);
            if(rightcount==-1 && leftcount==-1){
                return -1;
            }
            int max=Math.max(leftcount,rightcount);
            if(max+1==k){
                System.out.println(root.data);
            }
            return max+1;
        }
        public static int TransformToSumtree(Node root){
            if(root==null){
                return 0;
            }
            int leftChild=TransformToSumtree(root.left);
            int rightChild=TransformToSumtree(root.right);
            int ans=root.data;
            int leftData=root.left==null?0:root.left.data;
            int rightData=root.right==null?0:root.right.data;
            root.data=leftChild+leftData+rightChild+rightData;
            return ans;
        }
    }
    
    public static void main(String[] args) {
        Binarytree t=new Binarytree();
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=t.buildtree(arr);
        // System.out.println(root.data);
        // t.preOrdertraversal(root);
        // System.out.println();
        // t.inOrdertraversal(root);
        // System.out.println();
        // t.postOrdertraversal(root);
        // System.out.println();
        // t.levelOrder(root);
        // System.out.println(t.height(root));
        // System.out.println(t.countNodes(root));
        // System.out.println(t.sum(root));
        // System.out.println(t.diameter(root));
        // System.out.println(t.diameter2(root).diam);
        // Node subRoot=new Node(2);
        // subRoot.left=new Node(4);
        // subRoot.right=new Node(5);
        // System.out.println(t.isSubtree(root,subRoot));
        t.topView(root);
        //t.klevel(root,1,3);
        //Node ans=t.LCA(root, 3, 4);
        // Node ans=t.LCA2(root, 5, 4);
        // System.out.println(ans.data);
        // System.out.println(t.minDist(root,2,6));
        //t.Kancestor(root, 5, 2);
        // t.TransformToSumtree(root);
        // t.inOrdertraversal(root);
    }
}