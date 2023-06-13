package knowledge.ViolentRecursion;

import static knowledge.Greedy.Light.randomString;

/**
 * @author cong
 * @create 2023-03-29 20:18
 */
public class ConvertToLetterString {
    public static int number(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        return process(str.toCharArray(), 0);
    }

    private static int process(char[] str, int i) {
        //当i来到字符串最后一个字符时，生成了一种结果，返回。
        if (i == str.length) {
            return 1;
        }
        //当i来到的位置的数字是0时（单独），没有符合条件的结果，返回0
        if (str[i] == '0') {
            return 0;
        }
        //i没有到终止位置
        //str[i]不是0
        if (str[i] == '1') {
            //第一种分叉，两字符单独，i自己作为单独的部分，后续有多少种方法
            int res = process(str, i + 1);
            if (i + 1 < str.length) {
                //第二种分叉，两字符组合，i和i+1作为一个整体单独的部分，后续有多少种方法
                res += process(str, i + 2);
            }
            return res;
        }
        if (str[i] == '2') {
            //第一种分叉，两字符单独，i自己作为单独的部分，后续有多少种方法
            int res = process(str, i + 1);
            //第二种分叉，两字符组合，i和i+1作为一个整体单独的部分，且i+1的对应字符不能超过26，后续有多少种方法
            if (i + 1 < str.length && (str[i + 1] >= '0' && str[i + 1] <= '6')) {
                res += process(str, i + 2);
            }
        }
        //当str[i]的字符为3-9时，只能自己作为单独的部分，后续有多少方法
        return process(str, i + 1);
    }
    public static int dpWay(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        char[] chars=str.toCharArray();
        int N=chars.length;
        int[] dp=new int[N+1];
        dp[N]=1;
        for (int i=N-1;i>=0;i--) {
            if (chars[i]=='0') {
                dp[i]=0;
            }else if (chars[i]=='1') {
                dp[i]=dp[i+1];
                if (i + 1 < N) {
                    dp[i]+=dp[i+2];
                }
            }else if (chars[i]=='2') {
                dp[i]=dp[i+1];
                if (i + 1 < N && (chars[i + 1] >= '0' && chars[i + 1] <= '6')) {
                    dp[i]=dp[i+2];
                }
            }else {
                dp[i]=dp[i+1];
            }

        }
        return dp[0];
    }
    // 为了测试


    public static void main(String[] args) {
        System.out.println(number("11111"));
        System.out.println(dpWay("11111"));
    }

}
