package knowledge.Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author cong
 * @create 2023-01-07 20:40
 */
public class Dijkstra {
    public static HashMap<Node, Integer> dijkstra1(Node from) {
        //从from出发到所有点的最小距离
        //key：从from出发到达key
        //value：从from出发到达key的最小距离
        //如果在表中，没有T的记录，含义是从from出发到T这个点的距离为正无穷
        HashMap<Node, Integer> distanceMap = new HashMap<>();
        distanceMap.put(from, 0);
        //已经求过距离的节点，存在selectedNodes中，以后再也不碰
        HashSet<Node> selectedNodes = new HashSet<>();
        Node minNode = getMinDistanceAndselectedNode(distanceMap, selectedNodes);
        while (minNode != null) {
            //原始点-->minNode(跳转点) 最小距离distance
            int distance = distanceMap.get(minNode);
            for (Edge edge : minNode.edges) {
                Node toNode = edge.to;
                if (!distanceMap.containsKey(toNode)) {
                    distanceMap.put(toNode, distance + edge.weight);
                } else {
                    distanceMap.put(edge.to, Math.min(distanceMap.get(toNode), distance + edge.weight));
                }
            }
            selectedNodes.add(minNode);
            minNode = getMinDistanceAndselectedNode(distanceMap, selectedNodes);
        }
        return distanceMap;
    }

    private static Node getMinDistanceAndselectedNode(HashMap<Node, Integer> distanceMap,
                                                      HashSet<Node> toucheNodes) {
        Node minNode = null;
        int minDistance = Integer.MIN_VALUE;
        for (Map.Entry<Node, Integer> entry : distanceMap.entrySet()) {
            Node node = entry.getKey();
            int distance = entry.getValue();
            if (!toucheNodes.contains(node) && distance < minDistance) {
                minNode = node;
                minDistance = distance;
            }
        }
        return minNode;
    }
    private static class NodeRecord{
        private Node node;
        private int distance;

        public NodeRecord(Node node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }
    public static class NodeHeap{
        private Node[] nodes;//实际的堆结构
        //key某一个node,value上面堆中的位置
        private HashMap<Node,Integer> headIndexMap;
        //key某一个节点，value从源节点出发到该节点的目前最小距离
        private HashMap<Node,Integer> distanceMap;
        //堆上有多少个点
        private int size;

        public NodeHeap(int size) {
            nodes = new Node[size];
            headIndexMap = new HashMap<>();
            distanceMap = new HashMap<>();
            size = 0;
        }
        private boolean isEmpty(){
            return size==0;
        }
        public void addOrUpdateOrIgnore(Node node,int distance){
            if (inHeap(node)){
                distanceMap.put(node,Math.min(distanceMap.get(node),distance));
                insertHeapify(headIndexMap.get(node));
            }
            if (!isEntered(node)) {
                nodes[size]=node;
                headIndexMap.put(node,size);
                distanceMap.put(node,distance);
                insertHeapify(size++);
            }
        }

        private void insertHeapify(int index) {
            while (headIndexMap.get(nodes[index])<headIndexMap.get(nodes[(index-1)/2])){
                swap(index,(index-1)/2);
                index=(index-1)/2;
            }
        }
        private void heapify(int index, int size) {
            int left=index*2+1;
            while (left<size) {
                int smallest=left+1<size&&distanceMap.get(nodes[left])<distanceMap.get(nodes[left+1])
                        ?left
                        :left+1;
                smallest=distanceMap.get(nodes[smallest])<distanceMap.get(index)?smallest:index;
                if (smallest==index) {
                    break;
                }
                swap(smallest,index);
                index=smallest;
                left=index*2+1;
            }


        }

        private void swap(int index1, int index2) {
            headIndexMap.put(nodes[index1],index1);
            headIndexMap.put(nodes[index2],index2);
            Node tmp=nodes[index1];
            nodes[index1]=nodes[index2];
            nodes[index2]=tmp;
        }

        public boolean isEntered(Node node) {
            return headIndexMap.containsKey(node);
        }
        public boolean inHeap(Node node){
            return isEntered(node)&&headIndexMap.get(node)!=-1;
        }

        public NodeRecord pop() {
            NodeRecord nodeRecord=new NodeRecord(nodes[0],distanceMap.get(nodes[0]));
            swap(0,size-1);
            headIndexMap.put(nodes[size-1],-1);
            distanceMap.remove(nodes[size-1]);
            heapify(0,--size);
            return nodeRecord;
        }
    }
    //改进后的dijkstra算法
    //从head出发，所有head能到达的节点，生成到达每个节点的最小路径记录并返回
    public static HashMap<Node,Integer> dijkstra2(Node head,int size) {
        NodeHeap nodeHeap=new NodeHeap(size);
        nodeHeap.addOrUpdateOrIgnore(head,0);
        HashMap<Node,Integer> result=new HashMap<>();
        while (!nodeHeap.isEmpty()){
            NodeRecord record=nodeHeap.pop();
            Node node=record.node;
            int distance=record.distance;
            for (Edge edge:node.edges){
                nodeHeap.addOrUpdateOrIgnore(edge.to,edge.weight+distance);
            }
            result.put(node,distance);
        }
        return result;
    }
}
