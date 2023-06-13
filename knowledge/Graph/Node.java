package knowledge.Graph;

import java.util.ArrayList;

/**
 * @author cong
 * @create 2022-12-29 15:41
 */
public class Node {
    //点的编号
    public int value;
    //入度
    public int in;
    //出度
    public int out;
    //由点自己出发的点的直接邻居
    public ArrayList<Node> nexts;
    //由点自己出发的点的领边
    public ArrayList<Edge> edges;

    public Node(int value) {
        this.value=value;
        in=0;
        out=0;
        nexts=new ArrayList<>();
        edges=new ArrayList<>();
    }
}
