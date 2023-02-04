package leetCode.sort;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import jdk.nashorn.internal.runtime.FindProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author cong
 * @create 2022-04-06 20:17
 */
public class _888 {
    //爱丽丝和鲍勃拥有不同总数量的糖果。给你两个数组 aliceSizes 和 bobSizes ，aliceSizes[i] 是爱丽丝拥有的第 i 盒糖果中的糖果数量，bobSizes[j] 是鲍勃拥有的第 j 盒糖果中的糖果数量。
    //
    //两人想要互相交换一盒糖果，这样在交换之后，他们就可以拥有相同总数量的糖果。一个人拥有的糖果总数量是他们每盒糖果数量的总和。
    //
    //返回一个整数数组 answer，其中 answer[0] 是爱丽丝必须交换的糖果盒中的糖果的数目，answer[1] 是鲍勃必须交换的糖果盒中的糖果的数目。如果存在多个答案，你可以返回其中 任何一个 。题目测试用例保证存在与输入对应的答案。
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       int sumA=Arrays.stream(aliceSizes).sum();
       int sumB=Arrays.stream(bobSizes).sum();
       int delta=(sumA-sumB)/2;
       Set<Integer> rec=new HashSet<Integer>();
       for (int x:aliceSizes){
           rec.add(x);
       }
       int[] ans=new int[2];
       for (int y:bobSizes){
           int x=y+delta;
           if (rec.contains(x)){
               ans[0]=x;
               ans[1]=y;
               break;
           }
       }
       return ans;
    }
}
