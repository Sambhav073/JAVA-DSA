import java.util.*;
public class BellmanFord {
    static class Edge{
        int dest;
        int weight;
        Edge(int d,int w){
            this.dest=d;
            this.weight=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(1,2));
        graph[0].add(new Edge(2,4));

        graph[1].add(new Edge(2,-4));

        graph[2].add(new Edge(3,2));

        graph[3].add(new Edge(4,4));

        graph[4].add(new Edge(1,-1));
    }
    public static void bellmanFord(int src,ArrayList<Edge> graph[]){
        int distance[]=new int[graph.length];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src]=0;
        for(int i=0;i<graph.length-1;i++){

            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    if(distance[j]!=Integer.MAX_VALUE && distance[e.dest] > (distance[j])+e.weight){
                        distance[e.dest]=distance[j]+e.weight;
                    }
                }
            }

        }
        for(int i=0;i<graph.length;i++){
            System.out.println("Distance of "+i+" from source "+src+" is "+distance[i]);
        }

    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[5];
        createGraph(graph);
        bellmanFord(0,graph);
    }
}
