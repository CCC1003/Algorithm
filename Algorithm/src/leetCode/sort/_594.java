package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-03-25 20:47
 */
public class _594 {
    /*和谐数组是指一个数组里元素的最大值和最小值之间的差别 正好是 1 。

    现在，给你一个整数数组 nums ，请你在所有可能的子序列中找到最长的和谐子序列的长度。

    数组的子序列是一个由数组派生出来的序列，它可以通过删除一些元素或不删除元素、且不改变其余元素的顺序而得到。
*/
    public int findLHS(int[] nums){
        Arrays.sort(nums);
        int p1=0;
        int res=0;
        for (int p2=0;p2<nums.length;p2++){
            while (nums[p2]-nums[p1]>1){
                p1++;
            }
            if (nums[p2]-nums[p1]==1){
                res=Math.max(res,p2-p1+1);
            }
        }
        return res;
    }
}
