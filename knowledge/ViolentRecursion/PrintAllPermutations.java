package knowledge.ViolentRecursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cong
 * @create 2023-03-28 17:02
 */
public class PrintAllPermutations {
    public static List<String> permutation1(String s) {
        List<String> ans = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return ans;
        }
        char[] str = s.toCharArray();
        process1(str, 0, ans);
        return ans;
    }

    //str[0..i-1]已经做好决定的
    //str[i..]都有机会来到i位置
    //i终止位置，str当前的样子，就是一种结果->ans
    private static void process1(char[] str, int index, List<String> ans) {
        if (index == str.length) {
            ans.add(String.valueOf(str));
        } else {
            //i没终止
            for (int i = index; i < str.length; i++) {
                swap(str, index, i);
                process1(str, index + 1, ans);
                swap(str, index, i);
            }
        }
    }

    public static List<String> permutation2(String s) {
        List<String> ans = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return ans;
        }
        char[] str = s.toCharArray();
        process2(str, 0, ans);
        return ans;
    }

    private static void process2(char[] str, int index, List<String> ans) {
        if (index == str.length) {
            ans.add(String.valueOf(index));
        } else {
            //看题意创建，这里是26个英文字母
            boolean[] visited = new boolean[26];
            for (int i = index; i < str.length; i++) {
                if (!visited[str[i]]) {
                    visited[str[i]] = true;
                    swap(str, index, i);
                    process2(str, index + 1, ans);
                    swap(str, index, i);
                }
            }
        }
    }

    public static void swap(char[] chs, int i, int j) {
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }
}
