package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-02-18 21:48
 */
public class _389 {
    //给定两个字符串 s 和 t ，它们只包含小写字母。
    //
    //字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
    //
    //请找出在 t 中被添加的字母。
    public char findTheDifference(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for (int i=0;i<s1.length;i++){
            if (s1[i]!=t1[i]){
                return t1[i];
            }
        }
        return t1[t1.length-1];
    }
}
