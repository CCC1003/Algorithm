package knowledge.KMP;

/**
 * @author cong
 * @create 2023-06-04 15:51
 */
public class KMP {
    public static int getIndexOf(String s1, String s2) {
        if (s1 == null || s2 == null || s2.length() < 1 || s1.length() < s2.length()) {
            return -1;
        }
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        int x = 0; //str中当前比对到的位置
        int y = 0; //match中当前比对到的位置
        int[] next = getNextArray(str2);//next[i] match中i之前的字符串match[0..i-1]
        while (x < str1.length && y < str2.length) {
            if (str1[x] == str2[y]) {
                x++;
                y++;
            } else if (next[y] == -1) {//y==0
                x++;
            } else {
                y = next[y];
            }
        }
//        1、x越界，y没越界
//        2、x没越界，y越界了
//        3、x越界，y越界
        return y == str2.length ? x - y : -1;
    }

    private static int[] getNextArray(char[] str2) {
        if (str2.length == 1) {
            return new int[]{-1};
        }
        int[] next = new int[str2.length];
        next[0] = -1;
        next[1] = 0;
        int i = 2;// 目前在哪个位置上求next数组的值
        int cn = 0;// 当前是哪个位置的值再和i-1位置的字符比较
        while (i < next.length) {
            if (str2[i - 1] == str2[cn]) {// 配成功的时候
                next[i++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                next[i++] = 0;
            }
        }
        return next;
    }
}
