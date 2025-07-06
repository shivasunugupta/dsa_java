import java.util.*;

public class graph2
{
    static class Edge
    {
        int src;
        int dest;
        int weight;

        public Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }

    public static void createGraph2(ArrayList<graph2.Edge> graph2[])
    {
        for (int i = 0 ;i<graph2.length;i++)     //creates an empty arraylist to store data
        {
            graph2[i] = new ArrayList<Edge>();
        }


        //for dijkstras
//        graph2[0].add(new Edge(0,1,10));
//        graph2[0].add(new Edge(0,2,15));
//        graph2[0].add(new Edge(0,3,30));

        graph2[0].add(new Edge(1,2,3));
        graph2[0].add(new Edge(1,3,7));

        graph2[0].add(new Edge(2,4,9));
        graph2[0].add(new Edge(2,3,2));

        graph2[0].add(new Edge(3,5,6));

        graph2[0].add(new Edge(5,4,3));
        graph2[0].add(new Edge(5,7,2));
        graph2[0].add(new Edge(5,8,1));

        graph2[0].add(new Edge(4,6,13));

        //for bellmon ford
//        graph2[0].add(new Edge(0,1,2));
//        graph2[0].add(new Edge(0,2,4));
//
//
//        graph2[0].add(new Edge(1,2,-4));
//
//        graph2[0].add(new Edge(2,3,2));
//
//        graph2[0].add(new Edge(3,4,4));
//
//        graph2[0].add(new Edge(4,1,-1));



    }


    //    dijkstras
    public static class pair implements Comparable<pair>
    {
        int node;
        int dist;


        public pair(int n,int d)
        {
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(pair p2)
        {
            return this.dist - p2.dist;
        }
    }


    // time complexity = O(E+ E log v )  E -- (traversing the edges)
    //                                  E log v -- (priority queue)
    public static void dijkstras(ArrayList<Edge> graph2[],int src,int v)
    {
        PriorityQueue<pair> pq = new PriorityQueue<>() ;
        int dist[] =new int [v];

        for (int i =0;i<v;i++)
        {
            if (i != src)
            {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean vis[] = new boolean[v] ;

        pq.add(new pair(0,0));

        while ((!pq.isEmpty()))
        {
            pair curr = pq.remove();
            if(!vis[curr.node])
            {
                vis[curr.node]= true;

                for (int i =0;i<graph2[curr.node].size();i++)
                {
                    Edge e= graph2 [curr.node].get(i);
                    int u= e.src;
                    int vv = e.dest;
                    if (dist[u] + e.weight < dist[vv])
                    {   //relaxation
                        dist[vv] = dist[u] + e.weight;
                        pq.add(new pair(vv,dist[vv]));
                    }
                }
            }
        }

        for (int i  = 0;i<v;i++)
        {
            System.out.print(dist[i] + " ");
        }
    }


    //does not work for negetive weight cycles
//    public static void bellmanFord(ArrayList<Edge> graph2[],int src,int v)
//    {
//        int dist[] =new int [v];
//        for (int i=0;i<v;i++)
//        {
//            if (i!= src)
//            {
//                dist[i] = Integer.MAX_VALUE;
//            }
//        }
//
//        for (int k=0;k<v-1;k++)
//        {
//            for (int i =0;i<v;i++)
//            {
//                for (int j=0;j<graph2[i].size();j++)
//                {
//                    Edge e = graph2[i].get(j);
//                    int u = e.src;
//                    int vv = e.dest;
//
//                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.weight<dist[vv])
//                    {
//                        dist[vv] = dist[u] + e.weight;
//                    }
//                }
//            }
//        }
//
//        //to detect negative weight cycle
//        for (int i =0;i<v;i++)
//        {
//            for (int j=0;j<graph2[i].size();j++)
//            {
//                Edge e = graph2[i].get(j);
//                int u = e.src;
//                int vv = e.dest;
//
//                if (dist[u] != Integer.MAX_VALUE && dist[u] + e.weight<dist[vv])
//                {
//                    System.out.println("-ve weight cycle");
//                }
//            }
//        }
//
//        for (int i =0; i<dist.length;i++)
//        {
//            System.out.println(dist[i] + " ");
//        }
//        System.out.println();
//
//    }

    //minimum spanning tree
    //it is a subset of the edges of a connected ,edge-weighted undirected graph
    //that connects all the vertices together ,without any cycles and with the
    //minimum possible total edge weight

    //prims algorithm MST set
//    public static class pair implements Comparable<pair>
//    {
//        int node;
//        int cost;
//
//        public pair(int n, int c)
//        {
//            this.node = n;
//            this.cost = c;
//        }
//
//        @Override
//        public int compareTo(pair p2)
//        {
//            return this.cost - p2.cost;
//        }
//    }

//    public static void primsAlgo(ArrayList<Edge> graph2[], int v)
//    {
//        PriorityQueue<pair> pq = new PriorityQueue<>();
//        boolean vis[] = new boolean[v];
//
//        int mstCost = 0;
//
//        // Assuming you have an initial node, let's say 0, to start the algorithm
//        pq.add(new pair(0, 0));
//
//        while (!pq.isEmpty())
//        {
//            pair curr = pq.remove();
//            if (!vis[curr.node])
//            {
//                vis[curr.node] = true;
//                mstCost += curr.cost;
//
//                for (int i = 0; i < graph2[curr.node].size(); i++)
//                {
//                    Edge e = graph2[curr.node].get(i);
//                    if (!vis[e.dest])
//                    {
//                        pq.add(new pair(e.dest, e.weight));
//                    }
//                }
//            }
//        }
//        System.out.println("minimum cost of mst = " + mstCost);
//    }


    public static void main(String[] args)
    {
        int v= 9;
        ArrayList<Edge> graph2[] = new ArrayList[v];
        createGraph2(graph2);

        dijkstras(graph2,0,v);

//        bellmanFord(graph2,0,v);
//        primsAlgo(graph2,v);
    }
}
