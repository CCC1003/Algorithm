package leetCode.sort;

import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;

/**
 * @author cong
 * @create 2022-03-23 21:11
 */
public class _506 {
    public String[] findRelativeRanks(int[] score) {
       int n=score.length;
       String[] s={"Gold Medal","Silver Medal","Bronze Medal"};
       int[][] arr=new int[n][2];
       for (int i=0;i<n;i++){
           arr[i][0]=score[i];
           arr[i][1]=i;
       }
       Arrays.sort(arr,(a,b)->b[0]-a[0]);
       String[] str=new String[n];
       for (int i=0;i<n;i++){
           if (i>=3){
               str[arr[i][1]]=Integer.toString(i+1);
           }
           else {
               str[arr[i][1]]=s[i];
           }
       }
       return str;
    }
}
