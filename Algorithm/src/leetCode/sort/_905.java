package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-04-29 21:30
 */
public class _905 {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int less=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==0||nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[less];
                nums[less]=temp;
                less++;
            }
        }
        return nums;
    }
}
