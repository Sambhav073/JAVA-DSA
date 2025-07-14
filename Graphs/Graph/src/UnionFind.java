import java.util.*;
public class UnionFind {
    static int parent[]=new int[7];
    static int rank[]=new int[7];

    public static void init(){
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
        }
    }
    public static int find(int a){
        if(a==parent[a]){
            return a;
        }
        return parent[a]=find(parent[a]);
    }

    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            parent[parB]=parA;
            rank[parA]++;
        }
        else if(rank[parA]>rank[parB]){
            parent[parB]=parA;
        }else{
            parent[parA]=parB;
        }
    }
    public static void main(String[] args) {
        init();
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);

        for(int i=0;i<parent.length;i++){
            System.out.print(parent[i]+" ");
        }
        System.out.println();
        for(int i=0;i<rank.length;i++){
            System.out.print(rank[i]+" ");
        }
    }
}
