import java.util.*;
public class Prims {
    static class Edge{
        int dest;
        int weight;
        Edge(int d,int w){
            this.dest=d;
            this.weight=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(1,2));
        graph[0].add(new Edge(2,3));
        graph[0].add(new Edge(3,3));

        graph[1].add(new Edge(2,4));
        graph[1].add(new Edge(0,2));
        graph[1].add(new Edge(5,3));

        graph[2].add(new Edge(3,7));
        graph[2].add(new Edge(0,3));
        graph[2].add(new Edge(1,4));
        graph[2].add(new Edge(5,4));
        graph[2].add(new Edge(4,1));

        graph[3].add(new Edge(0,3));
        graph[3].add(new Edge(4,6));
        graph[3].add(new Edge(2,7));
        graph[3].add(new Edge(6,9));

        graph[4].add(new Edge(3,6));
        graph[4].add(new Edge(2,1));
        graph[4].add(new Edge(5,8));

        graph[5].add(new Edge(4,8));
        graph[5].add(new Edge(1,3));
        graph[5].add(new Edge(2,4));

        graph[6].add(new Edge(3,9));
    }

    public static void dijkstra(ArrayList<Edge> graph[],int s){
        boolean visited[]=new boolean[graph.length];
        int distance[]=new int[graph.length];

        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[s]=0;
        for(int i=0;i<graph.length-1;i++){
            int v=finMinDistance(distance,visited);
            if(v==-1){
                continue;
            }
            visited[v]=true;
            for(int j=0;j<graph[v].size();j++){
                int w=graph[v].get(j).weight;
                int d=graph[v].get(j).dest;
                if((distance[d]>w) && distance[v]!=Integer.MAX_VALUE){
                    distance[d]=w;
                }
            }
        }

        for(int i=0;i<distance.length;i++){
            System.out.println(s+" to "+i+" distance is "+distance[i]);
        }
    }
    public static int finMinDistance(int distance[],boolean visited[]){
        int min=Integer.MAX_VALUE;int vertex=-1;
        for(int i=0;i<distance.length;i++){
            if(distance[i]<min && !visited[i]){
                min=distance[i];
                vertex=i;
            }
        }
        return vertex;
    }
    public static void main(String args[]){
        ArrayList<Edge> graph[]=new ArrayList[7];
        createGraph(graph);
        dijkstra(graph,0);
    }
}
