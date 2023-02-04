package knowledge.Graph;

/**
 * @author cong
 * @create 2022-12-29 15:41
 */
public class Edge {
    public int weight;
    public Node from;
    public Node to;

    public Edge(int weight, Node from, Node to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }
}
