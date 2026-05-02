import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GraphSimple {
    static void bfs(boolean[][] graph,boolean[] vis,int n){
      Queue<Integer> q=new LinkedList<>();
      q.add(0);
      while (!q.isEmpty()) {
        int temp=q.poll();
        vis[temp]=true;
        System.out.println(temp);
        for(int i=0;i<n;i++){
            if(!vis[i] && graph[temp][i]){
                q.add(i);
            }
        }
        
      }
    }
    public static void main(String[] args) {
        int n = 6;
        int[][] edges={{0,1},{0,2},{1,3},{2,4},{3,5}};
        boolean[][] graph=new boolean[n][n];
        for(int[] data: edges){
            int u=data[0];
            int v=data[1];
            graph[u][v]=true;
            graph[v][u]=true;
        }
        boolean[] vis=new boolean[n];
        bfs(graph,vis,n);
    
    }
    
}
