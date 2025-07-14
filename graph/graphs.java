import java.util.*;
public class graphs
{
    static class Edge
    {
        int src;
        int dest;

        public Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;

        }
    }

    //using adjacency list -- time=O(n) and space is optimised
    public static void createGraph(ArrayList<Edge> graph[])
    {
        for (int i = 0 ;i<graph.length;i++)     //creates an empty arraylist to store data
        {
            graph[i] = new ArrayList<>();
        }

/*
        in this case v = 7
               1 --- 3
             /       | \
           0         |  5 --- 6
             \       | /
               2 --- 4
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[3].add(new Edge(4,2));
        graph[3].add(new Edge(4,3));
        graph[3].add(new Edge(4,5));

        graph[3].add(new Edge(5,3));
        graph[3].add(new Edge(5,4));
        graph[3].add(new Edge(5,6));

        graph[3].add(new Edge(6,5));
*/

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[0].add(new Edge(1,0));
        graph[0].add(new Edge(1,2));
//        graph[0].add(new Edge(1,4));

        graph[0].add(new Edge(2,0));
        graph[0].add(new Edge(2,1));
//        graph[0].add(new Edge(2,3));

        graph[0].add(new Edge(3,0));
        graph[0].add(new Edge(3,4));
//        graph[0].add(new Edge(3,5));
//
//        graph[0].add(new Edge(4,0));
        graph[0].add(new Edge(4,3));
//        graph[0].add(new Edge(4,5));
//
//        graph[0].add(new Edge(5,3));
//        graph[0].add(new Edge(5,4));

    }

    //breath first search
//    public static void bfs(ArrayList<Edge> graph[],int v,boolean vis[],int stating)
//    {
//        Queue<Integer> q = new LinkedList<>();
//
//        q.add(stating);
//        while(!q.isEmpty())
//        {
//            int curr = q.remove();
//            if (!vis[curr])
//            {
//                System.out.print(curr + " ");
//                vis[curr] = true;
//
//                for (int i= 0;i<graph[curr].size();i++)
//                {
//                    Edge e = graph[curr] .get(i);
//                    q.add(e.dest);
//                }
//            }
//        }
//    }



    // depth first search  (dfs)
//    public static void dfs(ArrayList<Edge>[] graph, int curr,boolean vis[])
//    {
//        System.out.print(curr+" ");
//        vis[curr] = true;
//        for (int i=0; i<graph[curr].size();i++)
//        {
//            Edge e = graph[curr].get(i);
//            if (!vis[e.dest])
//            {
//                dfs(graph,e.dest,vis);
//            }
//        }
//    }



    //all paths from the source
//    public static void printAllPath(ArrayList<Edge> graph[],boolean vis[],int curr,String path,int tar)
//    {
//        if (curr ==tar)
//        {
//            System.out.println(path);
//            return;
//        }
//        for(int i =0;i< graph[curr].size();i++)
//        {
//            Edge e = graph[curr].get(i);
//            if (!vis[e.dest])
//            {
//                vis[e.dest] =true;
//                printAllPath(graph,vis,e.dest,path+e.dest,tar);
//                vis[e.dest] = false;
//            }
//        }



    //back edging - when a node is not yet treversed as a neighbour of vertex
    //but is already visited

    //cycle detection on undirected graphs

//    public static boolean isCycleUndirected(ArrayList<Edge>[] graph, boolean vis[], int curr, int par)
//    {
//        vis[curr]=true;
//        for (int i = 0;i<graph[curr] .size();i++)
//        {
//            Edge e =graph[curr].get(i);
//            if (vis[e.dest]&& e.dest != par)
//            {
//                return true;
//            }
//            else if (!vis[e.dest])
//            {
//                if (isCycleUndirected(graph,vis,e.dest,curr))
//                {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

   // cycle detection on directed graphs

//    public static boolean isCycleDirected(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[])
//    {
//        vis[curr] = true;
//        rec[curr] = true;
//
//        for (int i = 0;i<graph[curr].size();i++)
//        {
//            Edge e = graph[curr].get(i);
//            if(rec[e.dest])
//            {
//                return true;   //condition of cycle
//            }
//            else if (!vis[e.dest])
//            {
//                if (isCycleDirected(graph,vis,e.dest,rec))
//                {
//                    return true;
//                }
//            }
//        }
//        rec[curr] = false;
//        return false;
//    }


    //topological sorting --> it is a linear order of vertices such that every directed edge
    // u -> v , the vertex u comes before v in order .
    // it is used only for DAGs (directed acyclic graph)
//   public static void topSortUtil(ArrayList<Edge> graph[] , int curr,boolean vis[] ,Stack<Integer> s)
//    {
//        vis[curr] = true;
//        for (int i =0;i<graph[curr] .size();i++)
//        {
//            Edge e = graph[curr].get(i);
//
//            if (!vis[e.dest])
//            {
//                topSortUtil(graph,e.dest,vis,s);
//            }
//        }
//        s.push(curr);
//    }

//    public static void topSort(ArrayList<Edge> graph[],int v)
//    {
//        boolean vis [] = new boolean[v];
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i<v;i++)
//        {
//            if (!vis[i] )
//            {
//                topSortUtil(graph,i,vis,stack);
//            }
//        }
//        while (!stack.isEmpty())
//        {
//            System.out.println(stack.pop() + " ");
//        }
//    }


    //kosaraju's algorithm
    //get nodes in a stack (topological sorting)
    //transpose the graph
    //do DFS according to stack nodes on the transpose graph (dfs)


//    public static void kosarajuAlgo(ArrayList<Edge> graph[],int v)
//    {
//        //step 1
//        Stack<Integer> s= new Stack<>();
//        boolean vis[] = new boolean[v];
//        for (int i =0; i<v;i++)
//        {
//            if (!vis[i])
//            {
//                topSortUtil(graph,i, vis,s);
//            }
//        }
//
//        //step 2
//        //making transpose graph
//        ArrayList<Edge> transposeGraph[] = new ArrayList[v];
//        for (int i = 0 ;i<transposeGraph.length;i++)     //creates an empty arraylist to store data
//        {
//            vis[i] =false;
//            transposeGraph[i] = new ArrayList<Edge>();
//        }
//        for (int i=0;i<v;i++)
//        {
//            for (int j=0;j<graph[i].size();j++)
//            {
//                Edge e = graph[i].get(j);   //e.src  -> e.dest
//                transposeGraph[e.dest] .add(new Edge(e.dest,e.src));   //e.src  <- e.dest
//            }
//        }
//
//        //step 3 print dfs graph
//        while (!s.isEmpty())
//        {
//            int curr = s.pop();
//            if (!vis[curr])
//            {
//                dfs(transposeGraph, curr,vis);
//                System.out.println();
//            }
//        }
//    }



    //Bridges - it is an edge whose deletion increases the graphs number of connected
    //components

    //tarjan's algorithm
    //dfs required for trajans algo with different parameters
//    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[] ,
//                           int dt[],int low[],int time,int par)
//    {
//        vis[curr] = true;
//        dt[curr] = low[curr] =  ++time;
//
//        for (int i=0;i<graph[curr] .size();i++)
//        {
//            Edge e = graph[curr].get(i);
//            if (e.dest == par)
//            {
//                continue;
//            }
//            if(vis[e.dest])
//            {
//                low[curr] = Math.min(low[curr], dt[e.dest]);
//            }
//            else if(!vis[e.dest])
//            {
//                dfs(graph,e.dest,vis,dt,low,time,curr);
//                low[curr] = Math.min(low[curr],low[e.dest]);
//                if (dt[curr] < low[e.dest])
//                {
//                    System.out.println("bridge is : " + curr + "---" + e.dest);
//                }
//            }
//        }
//    }
//    public static void getBridge(ArrayList<Edge> graph[] , int v)
//    {
//        int dt[] = new int [v];  //discovery time
//        int low[] = new int [v];  //
//        int time =0 ;
//        boolean vis[] = new boolean[v];
//
//        for (int i=0;i<v;i++)
//        {
//            if (!vis[i])
//            {
//                dfs(graph,i,vis,dt,low,time,-1);
//            }
//        }
//    }

    //articulation point
    //a vertex in an undirected connected graph is an articulation point (or cut vertex)
    //if removing it (and edges through it)  disconnects the graph

    public static void dfs(ArrayList<Edge> graph[], int curr, int par,
                                    boolean vis[], int dt[], int low[], int time,
                                      boolean isArticulation[])
    {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int child = 0;

        for(int i=0; i<graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            if(e.dest == par)
                continue;
            if(vis[e.dest])
            {
                low[curr] = Math.min(low[curr], dt[e.dest]);
            } else
            {
                dfs(graph, e.dest, curr, vis, dt, low, time, isArticulation);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if(dt[curr] <= low[e.dest] && par != -1)
                {
                    isArticulation[curr] = true;
                }
                child++;
            }
        }

        if(par == -1 && child > 1)
        {
            isArticulation[curr] = true;
        }
    }
    public static void getArticulation(ArrayList<Edge> graph[], int v)
    {
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        boolean vis[] = new boolean[v];
        boolean isArticulation[] = new boolean[v];

        for(int i=0; i<v; i++)
        {
            if(!vis[i])
            {
                dfs(graph, i, -1, vis, dt, low, time, isArticulation);
            }
        }
        for(int i=0; i<v; i++)
        {
            if(isArticulation[i])
            {
                System.out.println("AP "+i);
            }
        }
    }



    //main class
    public static void main(String[] args)
    {
        int v =5;


        ArrayList<Edge>[] graph = new ArrayList[v];
        boolean vis[] = new boolean[v];   //visited array

        createGraph(graph);


        //to print graph vertices and neighbouring element of it
//        for (int i=0;i<graph[2].size();i++)   //2 's neighbour
//        {
//            Edge e = graph[2].get(i);
//            System.out.print(e.dest +" , ");
//        }



        //traversal by dfs ,bfs and print all paths

        //traversal by bfs
//        for (int i =0;i<v; i++)
//        {
//            if (!vis[i])
//            {
//                bfs(graph,v,vis,i);
//            }
//        }
//
//
//        travel by dfs
//        dfs(graph,0,vis);
//
//
//        printing all paths
//        int src =0,tar =5;
//        printAllPath(graph ,new boolean[v] ,src,"0",tar);


        // is cycle directed
        // System.out.println(isCycleUndirected(graph,new boolean[v],0,-1));

        // boolean vis[] is already declared above

//        boolean rec [] = new boolean[v];
//        for (int i = 0;i<v;i++)
//        {
//            if (!vis[i])
//            {
//                boolean isCycle= isCycleDirected(graph, new boolean[v], 0,rec);
//                if (isCycle)
//                {
//                    System.out.println(isCycle);
//                    break;
//                }
//            }
//        }

        //topological sort
//        topSort(graph,v);

        //kosarajuAlgo
//        kosarajuAlgo(graph,v);

        //bridge
//        getBridge(graph,v);


        getArticulation(graph,v);


    }
}
