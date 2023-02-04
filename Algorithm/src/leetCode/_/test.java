package leetCode._;

import java.util.Arrays;

/**
 * @author cong
 * @create 2022-02-15 21:40
 */
public class test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,5};
        int[] newArr=Arrays.copyOfRange(arr,0,arr.length-1);
        for (int x:newArr){
            System.out.print(x+" ");
        }
    }
}
