package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-02-15 20:35
 */
public class _169 {
    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
