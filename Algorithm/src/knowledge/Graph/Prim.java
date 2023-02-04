package knowledge.Graph;

import java.awt.event.FocusEvent;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author cong
 * @create 2023-01-04 22:42
 */
public class Prim {

    public static class EdgeComparator implements Comparator<Edge> {

        @Override
        public int compare(Edge o1, Edge o2) {
            return o1.weight - o2.weight;
        }
    }

    public static Set<Edge> primMST(Graph graph) {
        // 解锁的边进入小根堆
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(new EdgeComparator());
        // 哪些点被解锁出来了
        HashSet<Node> nodeSet = new HashSet<>();
        //哪些边被选择了
        HashSet<Edge> edgeSet = new HashSet<>();
        // 依次挑选的的边在result里
        Set<Edge> result = new HashSet<>();
        for (Node node : graph.nodes.values()) {// 随便挑了一个点,防森林
            // node 是开始点
            if (!nodeSet.contains(node)) {
                nodeSet.add(node);
            }
            for (Edge edge : node.edges) {// 由一个点，解锁所有相连的边
                if (!edgeSet.contains(edge)) {
                    priorityQueue.add(edge);
                    edgeSet.add(edge);
                }
            }
            while (!priorityQueue.isEmpty()) {
                Edge edge = priorityQueue.poll();// 弹出解锁的边中，最小的边
                Node toNode = edge.to;// 可能的一个新的点
                if (!nodeSet.contains(toNode)) {// 不含有的时候，就是新的点
                    nodeSet.add(toNode);
                    result.add(edge);
                    for (Edge nextEdge : toNode.edges) {
                        if (!edgeSet.contains(nextEdge)) {
                            priorityQueue.add(nextEdge);
                            edgeSet.add(nextEdge);
                        }
                    }
                }
            }
        }
        return result;
    }
}
