package knowledge.Graph;

import java.util.*;

/**
 * @author cong
 * @create 2023-01-04 21:03
 */
public class Kruskal {
    public static class UnionFind {
        // key 某一个节点， value key节点往上的节点
        public HashMap<Node, Node> fatherMap;
        // key 某一个集合的代表节点, value key所在集合的节点个数
        public HashMap<Node, Integer> sizeMap;

        public UnionFind() {
            fatherMap = new HashMap<Node,Node>();
            sizeMap = new HashMap<Node,Integer>();
        }

        public void makeSets(Collection<Node> nodes) {
            fatherMap.clear();
            sizeMap.clear();
            for (Node node : nodes) {
                fatherMap.put(node, node);
                sizeMap.put(node, 1);
            }
        }

        public Node findFather(Node node) {
            Stack<Node> path = new Stack<>();
            while (node != fatherMap.get(node)) {
                path.add(node);
                node = fatherMap.get(node);
            }
            while (!path.isEmpty()) {
                fatherMap.put(path.pop(), node);
            }
            return node;
        }

        public boolean isSameSet(Node a, Node b) {
            return findFather(a) == findFather(b);
        }

        public void union(Node a, Node b) {
            if (a == null || b == null) {
                return;
            }
            Node aHead = findFather(a);
            Node bHead = findFather(b);
            if (aHead != bHead) {
                int aSize = sizeMap.get(aHead);
                int bSize = sizeMap.get(bHead);
                Node big = aSize >= bSize ? aHead : bHead;
                Node small = big == aHead ? bHead : aHead;
                fatherMap.put(small, big);
                sizeMap.put(big, aSize + bSize);
                fatherMap.remove(small);
            }
        }
    }

    public static class EdgeComparator implements Comparator<Edge> {
        @Override
        public int compare(Edge o1, Edge o2) {
            return o1.weight - o2.weight;
        }
    }

    public static Set<Edge> kruskalMST(Graph graph) {
        UnionFind unionFind = new UnionFind();
        unionFind.makeSets(graph.nodes.values());
        // 从小的边到大的边，依次弹出，小根堆！
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(new EdgeComparator());
        for (Edge edge : graph.edges) {// M 条边
            priorityQueue.add(edge);// O(logM)
        }
        Set<Edge> result = new HashSet<>();
        while (!priorityQueue.isEmpty()) {// M 条边
            Edge edge = priorityQueue.poll();// O(logM)
            if (!unionFind.isSameSet(edge.from, edge.to)) { // O(1)
                result.add(edge);
                unionFind.union(edge.from, edge.to);
            }
        }
        return result;
    }
}
