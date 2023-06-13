package knowledge.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * @author cong
 * @create 2022-11-21 21:59
 */
public class LowestLexicography {
    public static String lowestString1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        ArrayList<String> all = new ArrayList<>();
        HashSet<Integer> use = new HashSet<>();
        process(strs, use, "", all);
        String lowest = all.get(0);
        for (int i = 1; i < all.size(); i++) {
            /**
             * compareTo:
             * 如果指定的数与参数相等返回 0。
             *
             * 如果指定的数小于参数返回 -1。
             *
             * 如果指定的数大于参数返回 1。
             */
            if (all.get(i).compareTo(lowest) < 0) {
                lowest = all.get(i);
            }
        }
        return lowest;
    }

    //strs里放着所有的字符串
    //已经使用过的字符串，在use里登记了，不要再使用了
    //之前使用过的字符串，拼接成了->path
    //用all收集所有可能拼接结果
    private static void process(String[] strs,
                                HashSet<Integer> use,
                                String path,
                                ArrayList<String> all) {
        if (use.size() == strs.length) {
            all.add(path);
        } else {
            for (int i = 0; i < strs.length; i++) {
                if (!use.contains(i)) {
                    use.add(i);
                    process(strs, use, path + strs[i], all);
                    use.remove(i);
                }
            }
        }
    }

    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            return (a + b).compareTo(b + a);
        }
    }

    public static String lowestString2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs, new MyComparator());
        String path = "";
        for (int i = 0; i < strs.length; i++) {
            path += strs[i];
        }
        return path;
    }

    //for test
    public static String generateRandomString(int strLen) {
        char[] ans =new char[(int)(Math.random()*strLen)+1];
        for (int i = 0; i < ans.length; i++) {
            int value=(int)(Math.random()*5);
            ans[i] =(Math.random()<=0.5)?(char)(65+value) :(char) (97+value);
        }
        return String.valueOf(ans);
    }
   //for test
    public static String[] generateRandomStringArray(int arrLen,int strLen) {
        String[] ans=new String[(int)(Math.random()*arrLen)+1];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=generateRandomString(strLen);
        }
        return ans;
    }
    //for test
    public static String[] copyStringArray(String[] arr) {
        String[] ans=new String[arr.length];
        for (int i = 0; i <ans.length; i++) {
            ans[i]=String.valueOf(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
//        int arrLen=6;
//        int strLen=5;
//        int testTimes=10000;
//        System.out.println("test begin");
//        for (int i = 0; i < testTimes; i++) {
//            String[] str1=generateRandomStringArray(arrLen,strLen);
//            String[] str2=copyStringArray(str1);
//            if (!lowestString1(str1).equals(lowestString2(str2))){
//                for (String str:str1) {
//                    System.out.println(str+"");
//                }
//                System.out.println();
//                System.out.println("Oop!");
//            }
//        }
//        System.out.println("finish");
        String[] s= {"sst","aa","dc","eg","sv","dd"};
        System.out.println(lowestString1(s));
        System.out.println(lowestString2(s));

    }

}
