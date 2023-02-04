package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-04-02 19:47
 */
public class _747 {
    public int dominantIndex(int[] nums){
        if (nums.length<2){
            return 0;
        }
        int[] numsd=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            numsd[i]=nums[i];
        }
        Arrays.sort(nums);
        if (nums[nums.length-1]>=nums[nums.length-2]*2){
            for (int j=0;j<nums.length;j++){
                if (nums[nums.length-1]==numsd[j]){
                    return j;
                }
            }
        }
        return -1;
    }
}
