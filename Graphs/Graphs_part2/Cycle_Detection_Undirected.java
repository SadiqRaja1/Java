import java.util.*;
public class Cycle_Detection_Undirected {
    static class Edge {
        int src;
        int dest;
        // wt not require

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
            
        }
    }

    static void CreateGraph(ArrayList<Edge> graph []){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2)); // 1st add coment here and down to remove cycle
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0)); //2nd add coment here and above to remove cycle
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }
    public static boolean dectectCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean [graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(dectectCycleUtil(graph, vis, i , -1)) {
                    return true;
                    //cycle exist in one of the parts
                }
                
            }
        }
        return false;
    }

    public static boolean dectectCycleUtil(ArrayList<Edge> [] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            //case 3
            if(!vis[e.dest] ) {
                if(dectectCycleUtil(graph, vis,e.dest, curr)) {
                    return true;
                }
            }
            
            //case 1
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }

            //case 2 -> do nothing -> continue
        }

        return false;
    }
    public static void main (String args []){
        /*
                0 ----- 3
               /|       |
              / |       |
             1  |       4
              \ |
               \|
                2

        */

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);

        System.out.println(dectectCycle(graph));
    }
}
