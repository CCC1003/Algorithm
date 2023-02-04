package leetCode.sort;

import java.awt.font.NumericShaper;
import java.util.Arrays;

/**
 * @author cong
 * @create 2022-02-18 21:28
 */
public class _350 {
    //给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] nums=new int[nums1.length+nums2.length];
        int index=0;
        int index1=0;
        int index2=0;
        while (index1<nums1.length&&index2< nums2.length){
            int num1=nums1[index1];
            int num2=nums2[index2];
            if (num1==num2){
                nums[index++]=num1;
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
        return Arrays.copyOfRange(nums,0,index );
    }
}
