import java.util.ArrayList;
import java.util.List;


/**
 *   Leetcode
 *   - Maximize the Number of Target Nodes After Connecting Trees I
 *   - Maximize the Number of Target Nodes After Connecting Trees II
 */

class GraphSolution {

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {

        int n = edges1.length + 1;
        int m = edges2.length + 1;

        List<List<Integer>> graph1 = buildGraph(n, edges1);
        List<List<Integer>> graph2 = buildGraph(m, edges2);


        return new int[3];
    }


    public List<List<Integer>> buildGraph(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();

        for(int i[] : edges) {

            int src = i[0];
            int dest = i[1];

            List<Integer> temp = new ArrayList<>();
            temp.add(src);
            temp.add(dest);

            graph.add(temp);
        }

        return graph;
    }


}

public class maximun_reach {

    public static void main(String[] args) {

    }
}
