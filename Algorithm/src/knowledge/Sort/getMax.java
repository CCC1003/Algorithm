package knowledge.Sort;

/**
 * @author cong
 * @create 2022-01-18 9:49
 */
public class getMax {
    //递归方法求数组上的最大值
    public static int getMaxs(int[] arr){
        return process(arr,0,arr.length-1);
    }
    private static int process(int[] arr, int L, int R) {
        if(R==L){
            return arr[L];
        }
        int mid=L+((R-L)>>1);
        int leftMax=process(arr,L,mid);
        int rightMax=process(arr,mid+1,R);
        return Math.max(leftMax, rightMax);
    }
}
