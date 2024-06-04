import java.util.*;
public class Hash_Path {
    static class Edge {
        int src;
        int dest;
        int wt; // can remove this as not used 

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void CreateGraph(ArrayList <Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1)); // can remove wt as not used
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    public static boolean hashPath(ArrayList<Edge> [] graph, int src, int dest, boolean vis[]){
        if(src == dest) {
            return true;
        }
        vis[src] = true;
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            //e.dest = neighbour
            if(!vis[e.dest] && hashPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }
    public static void main (String args[]){
            /*
                1 --- 3
            /      | \
            0       |  5 -- 6
            \      | /
                2 --- 4
        */

        int V = 7;
        ArrayList <Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);

        System.out.println(hashPath(graph, 0, 5, new boolean[V]));
    }
}
