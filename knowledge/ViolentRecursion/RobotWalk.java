package knowledge.ViolentRecursion;

import sun.security.util.AuthResources_it;

import java.net.SocketTimeoutException;

/**
 * @author cong
 * @create 2023-04-08 22:10
 */
public class RobotWalk {
    public static int ways1(int N, int start, int aim, int K) {
        if (N < 2 || start < 1 || start > N || aim < 1 || aim > N || K < 1) {
            return -1;
        }
        return process1(start, K, aim, N);
    }

    // 机器人当前来到的位置是cur，
    // 机器人还有rest步需要去走，
    // 最终的目标是aim，
    // 有哪些位置？1~N
    // 返回：机器人从cur出发，走过rest步之后，最终停在aim的方法数，是多少？
    private static int process1(int cur, int rest, int aim, int N) {
        if (rest == 0) {
            return cur == aim ? 1 : 0;
        }
        if (cur == 1) {
            return process1(2, rest - 1, aim, N);
        }
        if (cur == N) {
            return process1(N - 1, rest - 1, aim, N);
        }
        return process1(cur - 1, rest - 1, aim, N) + process1(cur + 1, rest - 1, aim, N);
    }

    public static int ways2(int N, int start, int aim, int K) {
        if (N < 2 || start < 1 || start > N || aim < 1 || aim > N || K < 1) {
            return -1;
        }
        // dp就是缓存表
        // dp[cur][rest] == -1 -> process1(cur, rest)之前没算过！
        // dp[cur][rest] != -1 -> process1(cur, rest)之前算过！返回值，dp[cur][rest]
        // N+1 * K+1
        int[][] dp = new int[N + 1][K + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                dp[i][j] = -1;
            }
        }
        return process2(start, K, aim, N, dp);
    }

    private static int process2(int cur, int rest, int aim, int N, int[][] dp) {
        if (dp[cur][rest] != -1) {
            return dp[cur][rest];
        }
        int ans = 0;
        if (rest == 0) {
            ans = cur == aim ? 1 : 0;
        } else if (cur == 1) {
            ans = process2(2, rest - 1, aim, N, dp);
        } else if (cur == N) {
            ans = process2(N - 1, rest - 1, aim, N, dp);
        } else {
            ans = process2(cur - 1, rest - 1, aim, N, dp) + process2(cur + 1, rest - 1, aim, N, dp);
        }
        dp[cur][rest] = ans;
        return ans;
    }
    public static int ways3(int N,int start,int aim,int K) {
        if (N < 2 || start < 1 || start > N || aim < 1 || aim > N || K < 1){
            return -1;
        }
        int[][] dp=new int[N+1][K+1];
        dp[aim][0]=1;
        for (int rest = 1;rest<=K;rest++) {
            dp[1][rest]=dp[2][rest-1];
            for (int cur=2;cur<N;cur++) {
                dp[cur][rest]=dp[cur-1][rest-1]+dp[cur+1][rest-1];
            }
            dp[N][rest]=dp[N-1][rest-1];
        }
        return dp[start][K];
    }

    public static void main(String[] args) {
        long start1=System.currentTimeMillis();
        System.out.println(ways1(5, 2, 4, 6));
        long end1=System.currentTimeMillis();
        System.out.println(end1-start1);

        long start2=System.currentTimeMillis();
        System.out.println(ways2(5, 2, 4, 6));
        long end2=System.currentTimeMillis();
        System.out.println(end2-start2);

        long start3=System.currentTimeMillis();
        System.out.println(ways3(5, 2, 4, 6));
        long end3=System.currentTimeMillis();
        System.out.println(end3-start3);
    }
}
