import java.util.*;
public class DijkstraAlgorithm {
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
        graph[0].add(new Edge(2,4));

        graph[1].add(new Edge(3,7));
        graph[1].add(new Edge(2,1));

        graph[2].add(new Edge(4,3));

        graph[3].add(new Edge(5,1));

        graph[4].add(new Edge(3,2));
        graph[4].add(new Edge(5,5));
    }

//    public static void dijkstra(ArrayList<Edge> graph[],int s){
//        boolean visited[]=new boolean[graph.length];
//        int distance[]=new int[graph.length];
//
//        Arrays.fill(distance,Integer.MAX_VALUE);
//        distance[s]=0;
//        for(int i=0;i<graph.length-1;i++){
//            int v=finMinDistance(distance,visited);
//            if(v==-1){
//                continue;
//            }
//            visited[v]=true;
//            for(int j=0;j<graph[v].size();j++){
//                int w=graph[v].get(j).weight;
//                int d=graph[v].get(j).dest;
//                if((distance[d]>distance[v]+w) && distance[v]!=Integer.MAX_VALUE){
//                    distance[d]=distance[v]+w;
//                }
//            }
//        }
//
//        for(int i=0;i<distance.length;i++){
//            System.out.println(s+" to "+i+" distance is "+distance[i]);
//        }
//    }
//    public static int finMinDistance(int distance[],boolean visited[]){
//        int min=Integer.MAX_VALUE;int vertex=-1;
//        for(int i=0;i<distance.length;i++){
//            if(distance[i]<min && !visited[i]){
//                min=distance[i];
//                vertex=i;
//            }
//        }
//        return vertex;
//    }

    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path){
            this.n=n;
            this.path=path;
        }
        @Override
        public int compareTo(Pair p) {
            return this.path-p.path;
        }
    }
    public static void dijkstra(int src,ArrayList<Edge> graph[]){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int distance[]=new int[graph.length];
        boolean visited[]=new boolean[graph.length];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src]=0;
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            visited[curr.n]=true;
            for(int i=0;i<graph[curr.n].size();i++){
                Edge e=graph[curr.n].get(i);
                if(!visited[e.dest]){
                    if(distance[e.dest]>(distance[curr.n]+e.weight)){
                        distance[e.dest]=distance[curr.n]+e.weight;
                    }
                    pq.add(new Pair(e.dest,distance[e.dest]));
                }
            }
        }

        for(int i=0;i<graph.length;i++){
            System.out.println("Distance of "+i+" from source "+src+" is "+distance[i]);
        }
    }
    public static void main(String args[]){
        ArrayList<Edge> graph[]=new ArrayList[6];
        createGraph(graph);
        dijkstra(0,graph);
        //dijkstra(graph,0);
    }
}
