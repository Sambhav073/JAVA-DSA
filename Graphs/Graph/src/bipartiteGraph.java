import java.util.*;
public class bipartiteGraph {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        //graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
        //graph[4].add(new Edge(4,3));

//        0 ---- 1----3
//        |
//        |
//        |
//        2 ---- 4
    }

    public static boolean isBipartite(ArrayList<Edge> graph[]){
        int color[]=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<color.length;i++){
            if(color[i]==-1){
                color[i]=0;
                if(!isBipartiteDfs(graph,color,i)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isBipartiteDfs(ArrayList<Edge> graph[],int color[],int curr){
        boolean ans=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(color[e.dest]==color[curr]){
                return false;
            }else if(color[e.dest]==-1){
                color[e.dest]= color[curr]==0?1:0;
                if(!isBipartiteDfs(graph,color,e.dest)){
                    return false;
                }
            }
        }
        return ans;
    }

    public static boolean isBipartiteUtil(ArrayList<Edge> graph[],int color[],int curr){
        Queue<Integer> q=new LinkedList<>();
        q.add(curr);
        color[curr]=0;
        while(!q.isEmpty()){
            int element=q.remove();
            for(int i=0;i<graph[element].size();i++){
                Edge e=graph[element].get(i);
                if(color[e.dest]==color[element]){
                    return false;
                }else if(color[e.dest]==-1){
                    color[e.dest]= color[element]==0?1:0;
                    q.add(e.dest);
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
