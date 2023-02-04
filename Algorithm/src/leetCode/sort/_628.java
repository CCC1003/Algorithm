package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-03-29 20:29
 */
public class _628 {
    //给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
    public static int maximumProduct(int[] nums){
        if(nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
}
