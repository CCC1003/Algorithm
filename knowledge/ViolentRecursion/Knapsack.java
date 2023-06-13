package knowledge.ViolentRecursion;

import sun.plugin2.applet.Plugin2Manager;

import java.time.OffsetDateTime;

/**
 * @author cong
 * @create 2023-03-31 14:37
 */
public class Knapsack {
    // 所有的货，重量和价值，都在w和v数组里
    // 为了方便，其中没有负数
    // bag背包容量，不能超过这个载重
    // 返回：不超重的情况下，能够得到的最大价值
    public static int maxValue1(int[] w, int[] v, int bag) {
        if (w == null || v == null || w.length != v.length || w.length == 0) {
            return 0;
        }
        // 尝试函数！
        return process1(w, v, 0, 0, bag);
    }

    //不变：w[],v[],bag
    //index...最大价值
    //0..index-1上做了货物的选择，使得你已经到达的重量是多少alreadyw
    //如果返回-1，认为没有方案
    //如果不返回-1，认为返回的值是真实价值
    private static int process1(int[] w, int[] v, int index, int alreadyw, int bag) {
        if (alreadyw > bag) {
            return -1;
        }
        //重量没超
        if (index == w.length) {
            return 0;
        }

        int p1 = process1(w, v, index + 1, alreadyw, bag);
        int p2next = process1(w, v, index + 1, alreadyw + w[index], bag);
        int p2 = -1;
        if (p2next != -1) {
            p2 = v[index] + p2next;
        }
        return Math.max(p1, p2);
    }

    public static int maxValue(int[] w, int[] v, int bag) {
        if (w == null || v == null || w.length != v.length || w.length == 0) {
            return 0;
        }
        return process2(w, v, 0, bag);
    }

    //只剩下rest的空间
    //index..货物自由选择，但是剩余空间不要小于0
    //返回index...货物能够获得的最大价值
    private static int process2(int[] w, int[] v, int index, int rest) {
        if (rest <= 0) {
            return -1;
        }
        //rest>=0
        if (index == w.length) {
            return 0;
        }
        //有货也有空间
        int p1 = process2(w, v, index + 1, rest);
        int p2 = Integer.MIN_VALUE;
        if (rest >= w[index]) {
            p2 = v[index] + process2(w, v, index + 1, rest - w[index]);
        }
        return Math.max(p1, p2);
    }

    //动态规划 从下向上 从左到右
    public static int dpWay(int[] w, int[] v, int bag) {
        if (w == null || v == null || w.length != v.length || w.length == 0) {
            return 0;
        }
        int N = w.length;
        int[][] dp = new int[N + 1][bag + 1];
        //java中int类型默认值为0 dp[N][...]=0
        for (int index = N - 1; index >= 0; index--) {
            for (int rest = 0; rest <= bag; rest++) {
                int p1 = dp[index + 1][rest];
                int p2 = Integer.MIN_VALUE;
                int next = rest - w[index] < 0 ? -1 : dp[index + 1][rest - w[index]];
                if (next != -1) {
                    p2 = v[index] + next;
                }
                dp[index][rest] = Math.max(p1, p2);
            }
        }
        return dp[0][bag];
    }

    public static void main(String[] args) {
        int[] weights = { 3, 2, 4, 7, 3, 1, 7 };
        int[] values = { 5, 6, 3, 19, 12, 4, 2 };
        int bag = 15;
        System.out.println(maxValue1(weights,values,bag));
        System.out.println(dpWay(weights,values,bag));
    }
}
