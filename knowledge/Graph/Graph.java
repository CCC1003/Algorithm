package knowledge.Graph;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author cong
 * @create 2022-12-29 15:41
 */
public class Graph {
    public HashMap<Integer,Node> nodes;
    public HashSet<Edge> edges;

    public Graph() {
       nodes=new HashMap<>();
       edges=new HashSet<>();
    }

}

