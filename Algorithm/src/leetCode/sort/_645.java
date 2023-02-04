package leetCode.sort;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-03-30 20:35
 */
public class _645 {
//    集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，
//    导致集合 丢失了一个数字 并且 有一个数字重复 。
//    给定一个数组 nums 代表了集合 S 发生错误后的结果。
//    请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。

    public int[] findErrorNums(int[] nums){
        Arrays.sort(nums);
        int[] errNums=new int[2];
        int n=nums.length;
        int prev=0;
        for (int i=0;i<nums.length;i++){
            int curr=nums[i];
            if (prev==curr){
                errNums[0]=prev;
            }else if (curr-prev>1){
                errNums[1]=prev+1;
            }
            prev=curr;
        }
        if (nums[n-1]!=n){
            errNums[1]=n;
        }
        return errNums;
    }
}
