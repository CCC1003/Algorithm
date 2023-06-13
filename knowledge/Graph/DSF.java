package knowledge.Graph;

import com.sun.corba.se.spi.ior.IORFactories;

import java.util.HashSet;
import java.util.Stack;

/**
 * @author cong
 * @create 2023-01-02 21:38
 */
public class DSF {
    public static void dsf(Node start) {
        if (start == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        HashSet<Node> set = new HashSet<>();
        stack.add(start);
        set.add(start);
        System.out.println(start);
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            for (Node next : cur.nexts) {
                if (!set.contains(next)){
                    stack.push(cur);
                    stack.push(next);
                    set.add(next);
                    System.out.println(next.value);
                    break;
                }
            }
        }
    }
}
