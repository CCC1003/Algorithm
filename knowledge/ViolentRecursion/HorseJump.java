package knowledge.ViolentRecursion;


/**
 * @author cong
 * @create 2023-05-06 17:40
 */
public class HorseJump {
    // 当前来到的位置是（x,y）
    // 还剩下rest步需要跳
    // 跳完rest步，正好跳到a，b的方法数是多少？
    // 10 * 9

    //暴力递归
    public static int jump(int x, int y, int k) {
        return process(0, 0, k, x, y);
    }

    private static int process(int x, int y, int rest, int a, int b) {
        if (x < 0 || x > 9 || y < 0 || y > 8) {
            return 0;
        }
        if (rest == 0) {
            return (a == x && b == y) ? 1 : 0;
        }
        int ways=process(x-1,y-2,rest-1,a,b);
        ways+=process(x+1,y-2,rest-1,a,b);
        ways+=process(x+2,y-1,rest-1,a,b);
        ways+=process(x+2,y+1,rest-1,a,b);
        ways+=process(x+1,y+2,rest-1,a,b);
        ways+=process(x-1,y+2,rest-1,a,b);
        ways+=process(x-2,y+2,rest-1,a,b);
        ways+=process(x-2,y-1,rest-1,a,b);
        return ways;
    }
    //dp动态
    private static int dp(int a,int b,int k) {
        int[][][] dp=new int[10][9][k+1];
        dp[a][b][0]=1; //其它dp[a][b][...]=0;
        for (int rest = 1; rest <=k; rest++) {
            for (int x = 0; x < 10; x++) {
                for (int y = 0; y < 9; y++) {
                    int ways=pick(dp,x-1,y-2,rest-1);
                    ways+=pick(dp,x+2,y-1,rest-1);
                    ways+=pick(dp,x+2,y+1,rest-1);
                    ways+=pick(dp,x+1,y-2,rest-1);
                    ways+=pick(dp,x+1,y+2,rest-1);
                    ways+=pick(dp,x-1,y+2,rest-1);
                    ways+=pick(dp,x-2,y+2,rest-1);
                    ways+=pick(dp,x-2,y-1,rest-1);
                    dp[x][y][rest]=ways;
                }
            }
        }
        return dp[0][0][k];
    }

    private static int pick(int[][][] dp, int x, int y, int k) {
        if (x < 0 || x > 9 || y < 0 || y > 8) {
            return 0;
        }
        return dp[x][y][k];
    }

    public static void main(String[] args) {
        System.out.println(jump(2,3,5));
        System.out.println(dp(2,3,5));
    }
}
