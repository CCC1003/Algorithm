package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-03-24 20:02
 */
public class _561 {
    public int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int sum=0;
        for (int i=0;i<nums.length-1;i=i+2){
            sum+=Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }
}
