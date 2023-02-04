package _5;

import java.util.*;

/**
 * @author cong
 * @create 2022-01-26 19:38
 */
public class P1603 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str1 = reader.nextLine();
        String[] s1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                "a", "both", "another", "first", "second", "third"};
        int[] n1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 1, 1, 2, 3};
        HashMap<String,Integer> hashMap=new HashMap<String, Integer>();
        String[] str2=str1.split(" ");
        for (int i=0;i<s1.length;i++){
            hashMap.put(s1[i],n1[i]);
        }
        int t;
        int index=0;
        int[] p=new int[6];
        for (int i=0;i<6;i++){
            if (hashMap.containsKey(str2[i])){
                t=hashMap.get(str2[i]);
                p[index++]=t*t%100;
            }
        }
        // Arrays.sort()
        // 1、Arrays.sort(int[] a)
        //这种形式是对一个数组的所有元素进行排序，并且是按从小到大的顺序。
        //2、Arrays.sort(int[] a, int fromIndex, int toIndex)
        //这种形式是对数组部分排序，也就是对数组a的下标从fromIndex到toIndex-1的元素排序，注意：下标为toIndex的元素不参与排序哦！
        //3、public static void sort(T[] a,int fromIndex,int toIndex, Comparator c)
        //自定义比较器
        Arrays.sort(p,0,index);
        long temp=0;
        for (int i=0;i<index;i++){
            temp=temp*100+p[i];
        }
        System.out.println(temp);
    }
}