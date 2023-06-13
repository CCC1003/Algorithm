package knowledge.ViolentRecursion;

import org.omg.PortableServer.POAPackage.WrongAdapterHelper;

/**
 * @author cong
 * @create 2023-04-22 15:14
 */
public class Coffee {
    //process(drinks,3,10,0,0)
    //a 洗一杯的时间 固定变量
    //b 自己挥发干净的时间 固定变量
    //drinks 每一个员工喝完的时间 固定变量
    //index 到了哪一杯
    //washLine 洗咖啡机的机器什么时候能用
    public static int process(int[] drinks, int a, int b, int index, int washLine) {
        if (index == drinks.length - 1) {
            return Math.min(
                    Math.max(drinks[index], washLine) + a,
                    drinks[index] + b);
        }
        //剩不止一杯咖啡
        //wash是我当前的咖啡杯洗完的时间
        int wash = Math.max(drinks[index], washLine) + a;//洗，index一杯，结束的时间
        //index+1...变干净的最早时间
        int next1 = process(drinks, a, b, index + 1, wash);
        int p1 = Math.max(wash, next1);

        int dry = drinks[index] + b;//挥发，index一杯，结束的时间点
        int next2 = process(drinks, a, b, index + 1, washLine);
        int p2 = Math.max(dry, next2);
        return Math.min(p1, p2);
    }

    //从下往上，在从左往右
    public static int dp(int[] drinks, int a, int b) {
        if (a >= b) {
            return drinks[drinks.length - 1] + b;
        }
        int N = drinks.length;
        int limit = 0;
        for (int i = 0; i < N; i++) {
            limit = Math.max(limit, drinks[i]) + a;
        }
        int[][] dp = new int[N][limit + 1];
        for (int washLine = 0; washLine <= limit; washLine++) {
            dp[N - 1][washLine] = Math.min(
                    Math.max(drinks[N - 1], washLine) + a,
                    drinks[N - 1] + b);
        }
        for (int index = N - 2; index >= 0; index--) {
            for (int washLine = 0; washLine <= limit; washLine++) {
                int p1 = Integer.MAX_VALUE;
                int wash = Math.max(drinks[index], washLine) + a;
                if (wash <= limit) {
                    p1 = Math.max(wash, dp[index + 1][wash]);
                }
                int dry = drinks[index] + b;
                int p2 = Math.max(dry, dp[index + 1][washLine]);

                dp[index][washLine] = Math.min(p1, p2);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[] drinks={4,2,3,5,3,7,15,16};
        int a = 3;
        int b= 10;
        System.out.println(process(drinks,3,10,0,0));
        System.out.println(dp(drinks,3,10));
    }
}
