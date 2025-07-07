import java.util.*;

public class TopologicalSort {
    public static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void topologicalSort(ArrayList<Edge>[] graph){
        boolean[] visited =new boolean[graph.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfs(graph,visited,s,i);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void dfs(ArrayList<Edge>[] graph, boolean[] visited, Stack<Integer> s, int curr){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                dfs(graph,visited,s,e.dest);
            }
        }
        s.add(curr);
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));

        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));

    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>[] graph =new ArrayList[v];
        createGraph(graph);
        topologicalSort(graph);
    }
}
