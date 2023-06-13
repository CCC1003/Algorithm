package knowledge.ViolentRecursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author cong
 * @create 2023-03-23 8:52
 */
public class PrintAllSubsquences {
//    打印一个字符串的全部子序列
    public static List<String> subs(String s){
        char[] str=s.toCharArray();
        String path="";
        List<String> ans=new ArrayList<>();
        process1(str,0,ans,path);
        return ans;
    }

    // str 固定参数
    // 来到了str[index]字符，index是位置
    // str[0..index-1]已经走过了！之前的决定，都在path上
    // 之前的决定已经不能改变了，就是path
    // str[index....]还能决定，之前已经确定，而后面还能自由选择的话，
    // 把所有生成的子序列，放入到ans里去
    private static void process1(
            char[] str, int index, List<String> ans, String path) {
        if (index==str.length) {
            ans.add(path);
            return;
        }
        // 没有要index位置的字符
        process1(str,index+1,ans,path);
        // 要了index位置的字符
        process1(str,index+1,ans,path+String.valueOf(str[index]));
    }

//    打印一个字符串的全部子序列，要求不要出现重复字面值的子序列
    public static List<String> subsNoRepeat(String s) {
        char[] str=s.toCharArray();
        String path="";
        HashSet<String> set=new HashSet<>();
        process2(str,0,set,path);
        List<String> ans=new ArrayList<>();
        for(String c:set) {
            ans.add(c);
        }
        return ans;
    }

    private static void process2(
            char[] str, int index, HashSet<String> set, String path) {
        if (index==str.length){
            set.add(path);
            return;
        }
        // 没有要index位置的字符
        process2(str,index+1,set,path);
        // 没有要index位置的字符
        process2(str,index+1,set,path+String.valueOf(str[index]));
    }
}
