package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-02-16 21:30
 */
public class _268 {
    //给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。

    public int missingNumber(int[] nums){
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]!=i){
                return i;
            }
        }
        return 1;
    }
}
