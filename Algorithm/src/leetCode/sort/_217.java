package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-02-15 21:06
 */
public class _217 {
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
