import java.util.*;
public class inputgraph {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        int graph[][]=new int[n][n];
        for(int i=0;i<e;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph[a-1][b-1]=1;
            graph[b-1][a-1]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}
