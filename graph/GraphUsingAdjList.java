import java.util.ArrayList;

public class GraphUsingAdjList {
    public static void main(String[] args) {
        final int V = 5;    //no of vertex
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i =0 ; i<V;i++){
            graph.add(new ArrayList<>());
        }

        //add the edges
        graph.get(0).add(2);
        graph.get(0).add(1);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(2).add(1);
        graph.get(3).add(0);
        graph.get(4).add(1);

        for(int i =0;i<V;i++){
            System.out.print("vertex " + i+"-->");
            for(int j =0;j<graph.get(i).size();j++){
                System.out.print(graph.get(i).get(j)+(" "));
            }
            System.out.println();
        }
    }
}
