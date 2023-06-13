package knowledge.ViolentRecursion;

import jdk.internal.dynalink.beans.StaticClass;
import knowledge.Graph.Node;

import java.util.HashMap;

/**
 * @author cong
 * @create 2023-04-18 8:59
 */
public class StickersToSpellWord {
    public static int minStickers(String[] stickers, String target) {
        int N = stickers.length;
        //贴纸词频数组
        int[][] counts = new int[N][26];
        //dp 傻缓存
        HashMap<String, Integer> dp = new HashMap<>();
        //把所有贴纸都记录在词频数组中
        for (int i = 0; i < N; i++) {
            char[] str = stickers[i].toCharArray();
            for (char cur : str) {
                counts[i][cur - 'a']++;
            }
        }
        dp.put("", 0);
        return process(counts, target, dp);
    }

    //dp 傻缓存，如果t已经算过了，直接返回dp中的值
    //t 剩余的目标
    //0..N每一个字符串所含字符的词频统计
    private static int process(int[][] counts,
                               String rest,
                               HashMap<String, Integer> dp) {
        if (dp.containsKey(rest)) {
            return dp.get(rest);
        }
        //以下就是正式的递归调用过程
        int ans = Integer.MAX_VALUE; //ans -> 搞定rest,使用的最少贴指数
        int N = counts.length;
        //目标字符串target的词频数组
        int[] tmap = new int[26];
        char[] targets = rest.toCharArray();
        //统计字母数量在词频数组中
        for (char c : targets) {
            tmap[c - 'a']++;
        }
        for (int i = 0; i < N; i++) {
            //小加速 当前贴纸是否含有target中的第一个字符，没有换下一张贴纸，
            //先把第一个字母搞定，然后第二个。。。。
            if (counts[i][targets[0] - 'a'] == 0) {
                continue;
            }
            StringBuilder sb = new StringBuilder();
            //i号贴纸用过以后，target被消耗，sb为被消耗过剩余的部分
            for (int j = 0; j < 26; j++) {
                if (tmap[j] > 0) { //这个字符时target需要的
                    for (int k = 0; k < Math.max(0, tmap[j] - counts[i][j]); k++) {
                        sb.append((char) (j + 'a'));
                    }
                }
            }
            String s = sb.toString();
            //被i贴纸消耗过的贴纸继续进行递归用的贴纸数
            int tmp = process(counts, s, dp);
            if (tmp != -1) {
                ans = Math.min(ans, 1 + tmp);
            }
        }
        dp.put(rest, ans == Integer.MAX_VALUE ? -1 : ans);
        return dp.get(rest);
    }

    public static void main(String[] args) {
        String[] stickers = {"notice", "possible"};
        String target = "basicbasic";
        System.out.println(minStickers(stickers, target));
    }
}
