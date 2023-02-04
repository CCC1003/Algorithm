package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-02-15 21:42
 */
public class _242 {
    public boolean isAnagram(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
