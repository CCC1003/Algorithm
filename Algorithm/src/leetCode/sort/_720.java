package leetCode.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author cong
 * @create 2022-03-31 20:16
 */
public class _720 {
    public static  String longestWord(String[] words) {
        Arrays.sort(words,(a,b)->{
            if (a.length()!=b.length()){
                return a.length()-b.length();
            }else {
                return b.compareTo(a);
            }
        });
        String longest="";
        Set<String> cad=new HashSet<String>();
        cad.add("");
        for (int i=0;i<words.length;i++){
            if (cad.contains(words[i].substring(0,words[i].length()-1))){
                cad.add(words[i]);
                longest=words[i];
            }
        }
        return longest;

    }

}
