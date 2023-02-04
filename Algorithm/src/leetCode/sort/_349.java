package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-02-17 21:05
 */
public class _349 {
//    给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] par=new int[nums1.length+nums2.length];
        int index=0;
        int index1=0;
        int index2=0;
        while (index1<nums1.length&&index2<nums2.length){
            int num1=nums1[index1];
            int num2=nums2[index2];
            if (num1==num2){
                if (index==0||num1!=par[index-1]){
                    par[index++]=num1;
                }
                index1++;
                index2++;
            }
            else if (num1<num2){
                index1++;
            }
            else if (num1>num2){
                index2++;
            }
        }
        return Arrays.copyOfRange(par,0,index );
    }

}
