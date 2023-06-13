package knowledge.Greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author cong
 * @create 2022-12-07 17:16
 */
public class IPO {
    // 最多K个项目
    // W是初始资金
    // Profits[] 利润
    // Capital[] 资金
    // 一定等长
    // 返回最终最大的资金
    public static int findMaximizedCapital(int K, int W, int[] profits, int[] Capital) {
        PriorityQueue<Program> minCostQ = new PriorityQueue<>(new MinCostComparator());
        PriorityQueue<Program> maxProfitQ = new PriorityQueue<>(new MaxProfitComparator());
        for (int i = 0; i < profits.length; i++) {
            minCostQ.add(new Program(profits[i], Capital[i]));
        }
        for (int i = 0; i < K; i++) {
            while (!minCostQ.isEmpty() && minCostQ.peek().c <= W) {
                maxProfitQ.add(minCostQ.poll());
            }
            if (maxProfitQ.isEmpty()) {
                return W;
            }
            W += maxProfitQ.poll().p;
        }
        return W;
    }

    public static class Program {
        public int p;
        public int c;

        public Program(int p, int c) {
            this.p = p;
            this.c = c;
        }
    }

    public static class MinCostComparator implements Comparator<Program> {

        @Override
        public int compare(Program o1, Program o2) {
            return o1.c - o2.c;
        }
    }

    public static class MaxProfitComparator implements Comparator<Program> {

        @Override
        public int compare(Program o1, Program o2) {
            return o2.p - o1.p;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 1};
        int[] b = {1, 2, 3};
        System.out.println(findMaximizedCapital(2, 0, b, a));
    }
}
