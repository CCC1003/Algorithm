package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-03-14 20:54
 */
public class _414 {
    //给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
    public int thirdMax(int[] nums){
        Arrays.sort(nums);
        reverse(nums);
        for (int i=1,d=1;i<nums.length;++i){
            if (nums[i]!=nums[i-1]&&++d==3){
                return nums[i];
            }
        }
        return nums[0];
    }
    public static void reverse(int[] nums){
        int left=0;
        int right=nums.length-1;
        while (left<right){
            int t=nums[left];
            nums[left]=nums[right];
            nums[right]=t;
            left++;
            right--;
        }
    }
}
